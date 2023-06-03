//Write a Java program to calculate the sum of all elements in an integer array?
import java.util.*;

public class Problem3 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int arr[]={2,4,6,8};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
          }
        System.out.println(sum);
        }
}
