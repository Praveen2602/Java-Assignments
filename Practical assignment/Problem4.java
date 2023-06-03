//4. Write a Java program to find the index of a specific element in an integer array.
import java.util.*;
public class Problem4 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=sc.nextInt();
        int x;
        int arr[]= new int[n];
        System.out.println("enter the element int the array is:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to find index: ");
        x=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                System.out.println("the element is at index = "+ i);
            }
        } 
            
        }

    }

