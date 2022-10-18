
import java.util.Scanner;
public class Assignment3A {
    public static void main(String[] Args) {

        int ans1, ans2, ans3, ans4;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Hello stranger! Do you have time to hear my tale?\n1) Yes\n2) No");
        ans1 = myObj.nextInt();

        if (ans1 == 1) {
            System.out.println("Thank you! I come from the land of Pax Bisonica. Our country has been taken over by a cruel tyrant!");
            System.out.println("1) That's awful!!\n2) What can I do?");
            ans2 = myObj.nextInt();

                if (ans2 == 1) {
                    System.out.println("Alas, it is truly terrible...\nPlease, you must journey to Pax Bisoncia and free our country!\n1) Yes\n2) No");
                    ans3 = myObj.nextInt();

                    if (ans3 == 1) {
                        System.out.println("Hooray!!");

                    } else {
                        System.out.println("Then all is lost...");
                    }
                }
                else {
                    System.out.println("Ah, then goodbye...");
                        }
                    }
                }
            }
