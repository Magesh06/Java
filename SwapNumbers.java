import java.util.*;
public class SwapNumbers
{
public static void main(String args[])
{
int x, y, temp;
System.out.println("Enter x and y");
Scanner in = new Scanner(System.in);
 x = in.nextInt();
 y = in.nextInt();
System.out.println("Before Swapping\nx = "+x+" "+"y = "+y);
temp = x;
x = y;
y = temp;
System.out.println("After Swapping\nx = "+x+" "+"y = "+y);
}
}