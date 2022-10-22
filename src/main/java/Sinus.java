import java.util.Scanner;
import java.lang.Math;
public class Sinus {
    public static void main(String[] args) {
        double a;
        Scanner input=new Scanner(System.in);
        a= input.nextDouble();
        double b=Math.toRadians(a);
        System.out.println(Math.sin(b));
    }
}
