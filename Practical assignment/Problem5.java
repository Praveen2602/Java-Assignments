//Write a Java program to print an entire array
import java.util.*;
public class Problem5 {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
   }
   System.out.println("the elements in arrray is= ");
   for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
   }
}
}
