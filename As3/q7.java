import java.util.Scanner;

class Ap{
    public static void main(String args []){
        Scanner input= new Scanner (System.in);
        int a,b, h;
        System.out.println("enter the value of a and b");
        a= input.nextInt();
        b= input.nextInt();
        
        // a=500;
        // b=50;
        h=(2*a)/b;
            System.out.println(h);
    }
}
