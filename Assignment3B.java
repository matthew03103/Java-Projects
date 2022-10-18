import java.util.Scanner;

public class Assignment3B {
    public static void main(String[] Args){
        Scanner myObj = new Scanner(System.in);

        String color;
        int stripes;
        System.out.print("[Martial Arts Belt]\nWhat belt grade are you? ");
        int grade = myObj.nextInt();

        switch(grade) {
            case 10:
                color = "white belt";
                stripes = 0;
                System.out.println("You have a " + color+",\nwith "+stripes +" stripes!");
                break;

            case 9:
                color = "white belt";
                stripes = 1;
                System.out.println("You have a " + color+",\nwith "+stripes +" stripes!");
                break;

            case 8:
                color = "yellow belt";
                stripes = 1;
                System.out.println("You have a " + color+",\nwith "+stripes +" stripes!");
                break;

            case 7:
                color = "yellow belt";
                stripes = 2;
                System.out.println("You have a " + color+",\nwith "+stripes +" stripes!");
                break;

            case 6:
                color = "blue belt";
                stripes = 1;
                System.out.println("You have a " + color+",\nwith "+stripes +" stripes!");
                break;

            case 5:
                color = "blue belt";
                stripes = 2;
                System.out.println("You have a " + color+",\nwith "+stripes +" stripes!");
                break;

            case 4:
                color = "green belt";
                stripes = 1;
                System.out.println("You have a " + color+",\nwith "+stripes +" stripes!");
                break;

            case 3:
                color = "green belt";
                stripes = 2;
                System.out.println("You have a " + color+",\nwith "+stripes +" stripes!");
                break;

            case 2:
                color = "brown belt";
                stripes = 1;
                System.out.println("You have a " + color+",\nwith "+stripes +" stripes!");
                break;

            case 1:
                color = "brown belt";
                stripes = 2;
                System.out.println("You have a " + color+",\nwith "+stripes +" stripes!");
                break;

            case 0:
                color = "black belt";
                stripes = 0;
                System.out.println("You have a " + color+",\nwith "+stripes +" stripes!");
                break;

            default:
                System.out.println("You have no belt...");
                break;
        }

    }
}


