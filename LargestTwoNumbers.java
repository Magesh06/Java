import java.util.*;
public class LargestTwoNumbers 
{  
public static void main(String[] args) 
{  
int[] arr = { 2, 3, 5, 18, 6, 7, 10, 5, 8 };  
LargestTwoNumbers topTwoNumbers = new LargestTwoNumbers();  
topTwoNumbers.topTwoNumbers(arr);  
}  
public void topTwoNumbers(int[] arr) 
{  
int max = 0;  
int secondMax = 0;  
for (int i : arr)  
if (i > max) {  
secondMax = max;  
max = i;  
} 
else if (i > secondMax)  
secondMax = i;    
System.out.println("Max: " + max + " Second Max: " + secondMax);  
}  
}  