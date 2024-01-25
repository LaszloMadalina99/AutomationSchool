package com.welcome;

import java.util.Scanner;

public class Hello {
    private String personName;

    public void setupName(String name){
        personName = name;
    }

    public void welcome(){
        if (personName != null && !personName.isEmpty()){
            System.out.println("Hello, "+personName+"!");
        }
        else{
            System.out.println("Hello!");
        }
    }
    public void byeBay(){
        if (personName != null && !personName.isEmpty()){
            System.out.println("Bye, "+personName+"!");
        }
        else{
            System.out.println("Bye!");
        }
    }

    public static void main(String[] args){
        Hello helloInstance = new Hello();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");

        String name = scanner.nextLine();
        helloInstance.setupName(name);

        helloInstance.welcome();
        helloInstance.byeBay();
        scanner.close();
    }
}


