import java.util.Scanner;
public class LagdaanRectangle
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("SQUARE");
        System.out.println("Programmed by Makoy Lagdaan");
        System.out.println();

        // User Input
        System.out.print("Please enter the length of the side: ");
        double l = console.nextDouble();
        System.out.print("Please enter the width of the side: ");
        double w = console.nextDouble();

        //Formula
        double perimeter = 2 * (l+w);
        double area = l * w;

        //Display
        System.out.println("The Perimeter of the rectangle is " + perimeter + ".");
        System.out.println("THe Area of the rectangle is " + area + ".");
    }
}
