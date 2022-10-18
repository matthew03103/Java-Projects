import java.util.Scanner;

public class Assignment3C {
    public static void main(String[] Args) {
        Scanner myObj = new Scanner(System.in);
        double version;

        System.out.print("[App Checklist]\n" +
                "What mobile device do you have? ");
        String device = myObj.nextLine();

        if (!device.equalsIgnoreCase("Android") && !device.equalsIgnoreCase("Apple"))
            System.out.println("I’m sorry, our app does not support your device.");

        else {
            System.out.println("What version do you have?");
            version = myObj.nextDouble();

            if (device.equalsIgnoreCase("android") && (version >= 11)) {
                System.out.println("Congratulations, you can run the app!");

            } else if (device.equalsIgnoreCase("android") && (version < 11)) {
                System.out.println("Does your device support Augmented Reality?");
                String ar = myObj.nextLine();
                if (ar.equalsIgnoreCase("yes")) ;
                System.out.println("Congratulations, you can run the app!");
            }

            if (device.equalsIgnoreCase("apple") && (version >= 12)) {
                System.out.println("Congratulations, you can run the app!");

            } else if (device.equalsIgnoreCase("apple") && (version < 12)) {
                System.out.println("Does your device support Bluetooth connections?");
                String bt = myObj.nextLine();
                if (bt.equalsIgnoreCase("yes")) {
                    System.out.println("Congratulations, you can run the app!");


                } else
                    System.out.println("I’m sorry, our app does not support your device.");


            }
        }
    }
}
