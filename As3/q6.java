import java.util.Scanner;

class Ap{
    public static void main(String args []){
       Scanner input = new Scanner(System.in);
       System.out.println("enter the a"); 
        double a = input.nextInt();
       System.out.println("enter the b"); 
        double b = input.nextInt();
       System.out.println("enter the p"); 
        double p = input.nextInt();
        double d,s,pa,area,
        // a=10;
        // b=9;
        // p=36;
        c=(p-(a+b));
        s=p/2;
        pa=(s*(s-a)*(s-b)*(s-c));
        area=Math.sqrt(pa);
        System.out.println(c);
        System.out.println(s);
        System.out.println(pa);
        System.out.println(area);
    }
}
