// Name: Matthew Marchman
// Class: CS 3305/ W02
// Term: Fall 2023
// Instructor: Sharon Perry
// Assignment: 4-Part-2-Palindromes


//Import Scanner and Stack, as we will be using both classes.
import java.util.Scanner;
import java.util.Stack;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Create three stacks that all are of type Char.
        Stack<Character> Stack1 = new Stack<>();
        Stack<Character> Stack2 = new Stack<>();
        Stack<Character> Help = new Stack<>();

        //Create boolean same and set it to true, this is to check if the words are a palindrome.
        boolean same=true;

        //Prompt the user for a word and store the response as word.
        System.out.println("Enter a word");
        String word = scanner.nextLine();

        //Use a for loop to add the word to the first two Stacks.
        for (int i = 0; i < word.length(); i++) {
            Stack1.push(word.charAt(i));
            Stack2.push(word.charAt(i));
        }

        //Use an additional for loop to push the top element to the help loop, which just flips the word.
        for (int i = 0; i < word.length(); i++) {
            Help.push(Stack1.peek());
            Stack1.pop();
        }

        //Use one last for loop to compare Stack 1 to the Help Stack.
        for (int i = 0; i <= Stack2.size(); i++) {
            if(!Stack2.peek().equals(Help.peek())){
                same=false;
                Stack2.pop();
                Help.pop();
            }
        }

        //If the stacks are equal, print that it is palindromes.
        if(same){
            System.out.println(word+" is a palindrome.");
        }

        //else print that it is not.
        else {
            System.out.println(word+" is not a palindrome.");
        }
    }
}
