package com.ginopractice;
import java.util.Scanner;

public class Main {

    public static void addNums(int a , int b) {
        System.out.println(a+b);
    }
    public static void subNums(int a , int b) {
        System.out.println(a-b);
    }
    public static void mulNums(int a , int b) {
        System.out.println(a*b);
    }
    static double divideNums(int a , int b) {
        double c = a/b;
        return c;
    }


    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        System.out.println("HELLO. What are the two numbers from 1-5?");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Type + to add. Type - to substract. Type * to multiply. Type / to divide. Type q to quit the program");
        char pickOperator = scan.next().charAt(0);


            switch (pickOperator) {
                case '+':
                    System.out.println("The sum of " + num1 + " and " + num2 + "  is:");
                    addNums(num1, num2);
                    break;
                case '-':
                    System.out.println("The deficit of " + num1 + " and " + num2 + "  is:");
                    subNums(num1, num2);
                    break;
                case '*':
                    System.out.println("The product of " + num1 + " and " + num2 + "  is:");
                    mulNums(num1, num2);
                    break;
                case '/':
                    System.out.println("The quotient of " + num1 + " and " + num2 + "  is:");
                    System.out.println(divideNums(num1, num2));
                    break;
                default:
                    System.out.println("Please enter a valid number.");
            }
        }
    }
