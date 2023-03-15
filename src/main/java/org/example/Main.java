package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double a,b;
        Calculator cal=new Calculator();
        System.out.println("Enter Choice:");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter first number:");
            a=sc.nextDouble();
            System.out.println("Enter second number:");
            b= sc.nextDouble();
            System.out.println("Result:\n"+cal.add(a,b));
        }
        else{
            System.out.println("error");
        }
    }
}