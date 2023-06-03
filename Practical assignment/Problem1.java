//1. Write a program to demonstrate method overloading with 3 different parameters.

import java.util.*;

public class Problem1{

    public static void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public static  void add(char a,char b){
        char x=a;
        char y=b;
        System.out.println(y+ " "+ x);


    }
    public static void add(double a, double b){
        System.out.println(a+b);
    }
     public static void main(String args[]){
        int a=10;
        int b=15;
        char x='a';
        char y='b';
        double p= 10.0;
        double q=12.0;
        add(a,b);
        add(x,y);
        add(p,q);
       
    }
}