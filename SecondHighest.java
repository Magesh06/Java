import java.util.*;
public class SecondHighest 
{
public static void main(String[] args) 

{
int arr[] = {10,20,30,40,50,60,80,70,90};
int largest = arr[0];
int secondLargest = arr[0];
System.out.println("The given array is:" );

for (int i = 0; i < arr.length; i++) 
{
System.out.print(arr[i]+"\t");
}

for (int i = 0; i < arr.length; i++) 
{
if (arr[i] > largest) 
{
secondLargest = largest;
largest = arr[i]; 
} 
else if (arr[i] > secondLargest) 
{
secondLargest = arr[i];
}
}
System.out.println("\nSecond largest number is:" + secondLargest);
 
}
}