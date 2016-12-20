import java.util.*; 
public class BinaryNumber1 
{ 
public static void main(String args[]) 
{ 
int c=0,num,b; 
Scanner sl=new Scanner(System.in); 
System.out.println("Enter a number"); 
num=sl.nextInt(); 
b= num; 
while(num>0) 
{
if((num %10==0)|| (num%10==1)) 
c++;
System.out.println(b+" is a Binary Number."); 
else
System.out.println(b+" is not a Binary Number"); 
num=num/10; 
 }
} 
} 