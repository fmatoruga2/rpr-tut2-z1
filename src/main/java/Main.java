import java.util.Scanner;

public class Main {


    public static int faktorijel(int n){
        int fakt=1;
        for(int i=1;i<=n;i++)
            fakt=fakt*i;
        return fakt;
    }

    public static double sinus(int n){
        double b=Math.sin(n);
        return b;


    }


    public static void main(String[] args) {

        int n;
        Scanner input= new Scanner(System.in);
        int number= input.nextInt();
        int faktorijel=faktorijel(number);
        double sinus=sinus(number);


        System.out.println("Faktorijel je: "+faktorijel+" ,sinus je: "+sinus);
    }
}
