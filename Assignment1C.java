import java.util.Scanner;

public class Assignment1C {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("[And the next letter is]");
        System.out.print("Please enter a letter: ");

        char ch = myObj.next().charAt(0);

        System.out.println("The next letters after " + ch + " are " + (char) (ch + 1) + ", " + (char)(ch+2) + ", and " + (char) (ch + 3) + "!");
    }
}

