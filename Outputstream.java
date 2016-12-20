import java.io.*;  
class Outputstream
{  
  public static void main(String args[])
{  
   try
{  
     FileOutputstream fout=new FileOutputStream("C:\\Users\\User\\Documents\\GitHub\\Java-Project");  
     String s="Sachin Tendulkar is my favourite player";  
     byte b[]=s.getBytes();  
     fout.write(b);  
     fout.close();  
     System.out.println("success...");  
    }
catch(Exception e)
{
System.out.println(e);
}  
  }  
}  