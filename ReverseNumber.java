import java.util.*;
class ReverseNumber
{ 
int a,b,c;
	public void number1()
		{
			a= 123654;
		System.out.println("Reversed number is  ");
		for(int i=0;i<6;i++)
			{
				b= a/10;
				c= a%10;
				a= b;
				System.out.print(c);	
			}
			System.out.println("");
		}