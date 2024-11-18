
import java.util.Scanner;


public class Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сторону a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите сторону b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите сторону c: ");
        double c = scanner.nextDouble();


        if (isTriangleExists(a, b, c)) {
            String type = getTriangleType(a, b, c);
            System.out.println("Треугольник существует. Тип: " + type);
        } else {
            System.out.println("Треугольник не существует.");
        }
    }


    public static boolean isTriangleExists(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static String getTriangleType(double a, double b, double c) {
        if (a == b && b == c) {
            return "равносторонний треугольник";
        } else if (a == b || b == c || a == c) {
            return "равнобедренный треугольник";
        } else {
            return "разносторонний треугольник";
        }
    }
}





