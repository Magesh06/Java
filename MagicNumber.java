import java.util.*;
public class MagicNumber
{
public static void main(String args[])
{
Scanner get=new Scanner(System.in);
System.out.println("Enter the number to be checked.");
int n=get.nextInt();
int sum=0,num=n;
while(num>9)
{
sum=num;
int s=0;
while(sum!=0)
{
s=s+(sum%10);
sum=sum/10;
}
num=s;
}
if(num==1)
{
System.out.println(n+" is a Magic Number.");
}
else
{
System.out.println(n+" is not a Magic Number.");
}
}
}
