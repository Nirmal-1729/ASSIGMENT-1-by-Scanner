import java.util.Scanner;

class Ap {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the area (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the width (w): ");
        int w = scanner.nextInt();

        int l = (a / w);
        int p = 2 * (l + w);

        System.out.println("Length: " + l);
        System.out.println("Perimeter: " + p);

        scanner.close();
    }
}