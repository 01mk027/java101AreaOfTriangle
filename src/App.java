import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Create variables
        int firstEdge, secondEdge, thirdEdge, perimeter;
        double areaOfTriangle, u;
        Scanner input = new Scanner(System.in);

        //Get values from user (keyboard)
        System.out.println("Enter the length of first edge: ");
        firstEdge = input.nextInt();

        System.out.println("Enter the length of second edge: ");
        secondEdge = input.nextInt();

        System.out.println("Enter the length of third edge: ");
        thirdEdge = input.nextInt();

        //Calculate perimeter and half of perimeter
        perimeter = firstEdge + secondEdge + thirdEdge;
        u = perimeter / 2.0;
        
        //Calculating area of triangle and print to screen
        areaOfTriangle = Math.sqrt(u * (u - firstEdge) * (u - secondEdge) * (u - thirdEdge));
        System.out.println("Area of triangle is = " + areaOfTriangle);
    }
}
