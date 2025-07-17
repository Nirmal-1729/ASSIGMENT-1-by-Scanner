import java.util.Scanner;

class Ap {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length 1:");
        int l1 = scanner.nextInt();

        System.out.println("Enter width 1:");
        int w1 = scanner.nextInt();

        System.out.println("Enter length 2:");
        int l2 = scanner.nextInt();

        System.out.println("Enter width 2:");
        int w2 = scanner.nextInt();

        int a1 = (l1 * w1);
        int a2 = (l2 * w2);
        int t = (a2 / a1);

        System.out.println(t);

        scanner.close();
    }
}