import java.util.Scanner;
public class Exercise_01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the parallelogram: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the height of the parallelogram: ");
        double h = scanner.nextDouble();
        double area = Parallelogram_Area(a, h);
        System.out.println("Area of a parallelogram: " + area);
    }
    public static double Parallelogram_Area(double a, double h) {
        double area = a * h;
        return area;
    }
}
