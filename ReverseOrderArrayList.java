import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.io.*; 
public class ReverseOrderArrayList
{
public static void main(String[]args)
{
ArrayList<String> aList = new ArrayList<String>();
aList.add("H");
aList.add("S");
aList.add("E");
aList.add("G");
aList.add("A");
aList.add("M");
System.out.println("Before Reverse Order, ArrayList Contains : " + aList);
Collections.reverse(aList);  
System.out.println("After Reverse Order, ArrayList Contains : " + aList);   
}
}