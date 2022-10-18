import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment1A {
    public static void main(String[] args)
    {
        double width;
        double length;
        double resolution;
        double wide;
        double height;


        Scanner myObj = new Scanner(System.in);
       System.out.print("Enter the width (in pixels): ");
       width = myObj.nextDouble();

        System.out.print("Enter the height (in pixels): ");
        length = myObj.nextDouble();

        System.out.print("Enter the resolution (PPI): ");
        resolution = myObj.nextDouble();

        wide = width/resolution;
        height = length/resolution;

        DecimalFormat dFormatter = new DecimalFormat("0.000");
        String formatted = dFormatter.format(wide);

        DecimalFormat dFormatter2 = new DecimalFormat("0.000");
        String formatted2 = dFormatter.format(height);

//        double rounded1 = Math.round(wide *1000)/1000.0;
//        double rounded2 = Math.round(height *1000)/1000.0;


        System.out.print("At " + resolution + " PPI, the image is " + formatted + "\" " + "wide by " + formatted2 + "\" " + "high." );

    }

}
