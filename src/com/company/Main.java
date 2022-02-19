package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        float salary=sc.nextFloat();
        System.out.println("Enter the service");
        float service=sc.nextFloat();
        float bonus;
        if (service>=5){
            bonus=(salary/100*5);
            System.out.println("Give him bonus"+" "+bonus);
        }
        else{
            System.out.println("Do not Give him bonus");
        }


     }
}