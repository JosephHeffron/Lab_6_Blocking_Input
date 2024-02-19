import java.util.Scanner;
// Import scanner and create class
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declare variables
        double width;
        double height;

        // Input the width of the rectangle
        do {
            System.out.print("Enter the width of the rectangle: ");
            width = scanner.nextDouble();
        } while (width <= 0); 
        // Ensure the input is positive

        // Input the height of the rectangle
        do {
            System.out.print("Enter the height of the rectangle: ");
            height = scanner.nextDouble();
        } while (height <= 0); 
        // Ensure the input is positive

        // Calculate area and perimeter of the rectangle
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        // Calculate the length of the diagonal using the Pythagorean theorem
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        System.out.println("Length of the diagonal: " + diagonal);

        scanner.close();
    }
}
