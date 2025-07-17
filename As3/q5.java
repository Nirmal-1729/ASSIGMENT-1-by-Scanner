import java.util.Scanner;
class Ap{
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the value of l ");
        System.out.println("enter the a"); 
        System.out.print("enter the value of tc ");
        double tc = input.nextDouble();
        System.out.print("enter the value of r ");
        double r = input.nextDouble();

        double a,w,p;
        // l=20.0;
        // tc=1600.0;
        // r=25.0;
        a=(tc/r);
        w=(a/l);
        p=(2*(w+l));
        System.out.println(a);
        System.out.println(w);
        System.out.println(p);
    }
}