import java.util.Scanner;

class Ap {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = scanner.nextInt();

        System.out.print("Enter width: ");
        int w = scanner.nextInt();

        System.out.print("Enter r: ");
        int r = scanner.nextInt();

        int a = l * w;
        int u = (a * 100) / 100; 
        int t = u * r;
        System.out.println(t);

        scanner.close();
    }
}
