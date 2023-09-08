// Name: Matthew Marchman
// Class: CS 3305/ W02
// Term: Fall 2023
// Instructor: Sharon Perry
// Assignment: 4-Part-1-Stacks

import java.util.Scanner;

public class Stacks {

    //Create an array that we will use as the two stacks.
    public static int[] array=new int[10];

    //Create a top A method that keeps track of the location in StackA (the bottom of the array).
    public static int top_a=0;

    //Create a top B method that keeps track of the location of the top of stackB (top of the array).
    public static int top_b=array.length-1;

    //Create a public is full variable that keeps track of if the array is full.
    public static boolean is_full;

    //Create an is A empty method that checks if the top of a is in the 0 position.
    public static boolean is_empty_a(){
        return top_a == 0;
    }

    //Create an is B empty method to check if top b is equal to the array length-1.
    public static boolean is_empty_b(){
        return top_b==array.length-1;
    }

    //Create a push A method that adds an input to the position of top A.
    // -Note: I added an if loop to check if the array is full, because I was getting an error before.
    public static void push_a(int push){
        if(top_a==top_b-1){
            is_full=true;
        }
        else {
            array[top_a] = push;
            top_a++;
        }
    }

    //Do the same for push B with top B.
    public static void push_b(int pushB){
        if(top_a==top_b){
            is_full=true;
        }
        else {
            top_b--;
            array[top_b] = pushB;
        }
    }

    //Create a pop A method that decrements top A, then sets the location to 0 (value of stock array).
    // -Note: I tried to do it after first, and it caused an error.
    // -Note: I had to add an if else to check if top A was <= 0 because it would throw an error when I pushed when the array was empty.
    public static void pop_a(){
        if(top_a<=0){
            System.out.println("nope");
        }
        else {
            top_a--;
            array[top_a] = 0;
            System.out.println("yep");
        }
    }

    //Create the same for pop B.
    // The only difference is that you increment top B after the 0 is added and check if top B >= the length of the array.
    public static void pop_b() {
        if(top_b>=array.length){
            System.out.println("nope");
        }
        else {
            array[top_b] = 0;
            top_b++;
            System.out.println("yep");
        }
    }

    //Create the main method.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Set the size of the array to anything (I choose 10).
        array = new int[10];

        is_full=false;

        //Instantiate the user input as an int so that it can be used in a while loop.
        int userInput;

        //Create a do while loop with a method that ends when the array is full or the user selects 8.
        do {

            //Create a menus that will display all options and takes in user input.
            System.out.println("What would you like to do?" +"\n"+
                    "1: push a" +"\n"+
                    "2: push b" +"\n"+
                    "3: pop a" +"\n"+
                    "4: pop b" +"\n"+
                    "5: print array" +"\n"+
                    "6: check if Stack A is empty"+"\n"+
                    "7: check if Stack B is empty"+"\n"+
                    "8: end");
            userInput = scan.nextInt();

            //Switch user input and code each method.
            switch (userInput){
                case 1:
                    System.out.println("enter a number:");
                    int pushA=scan.nextInt();
                    push_a(pushA);
                    break;
                case 2:
                    System.out.println("enter a number:");
                    int pushB=scan.nextInt();
                    push_b(pushB);
                    break;
                case 3:
                    pop_a();
                    break;
                case 4:
                    pop_b();
                    break;
                case 5:
                    for (int i = 0; i < array.length-1; i++) {
                        System.out.println(array[i]);
                    }
                    break;
                case 6:
                    if(is_empty_a()){
                        System.out.println("Stack A is empty");
                    }
                    else {
                        System.out.println("Stack A is not empty");
                    }
                    break;
                case 7:
                    if(is_empty_b()){
                        System.out.println("Stack B is empty");
                    }
                    else {
                        System.out.println("Stack B is not empty");
                    }
                    break;
            }

            //Each time the loop runs check if the array is full.
            if (top_a==top_b){
                is_full=true;
                System.out.println("Stack full");
            }

        }while (!is_full&&userInput!=8);
    }
}
