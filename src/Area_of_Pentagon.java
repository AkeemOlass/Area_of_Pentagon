import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.tan;

public class Area_of_Pentagon {
// prompts user to enter a length of side
    public static void main (String [] args){
        System.out.println("Please enter the length of side of the pentagon ");
        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();
            //calls method Area to compute area of the Pentagon
           Area( side);
    }
    public static double Area (double side){
        //constant PI
        final double PI;
        PI = 22/7;
        // Area of Pentagon Formula A= (5 * side^2)/4*tan(PI/5)
        double numerator = 5 * (side*side);
        double denominator = 4 * tan(PI/5);
        double area = numerator/denominator;
        System.out.println("The are of the pentagon is " + area);
        return area;
    }
}
