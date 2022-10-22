import java.util.Scanner;

public class Faktorijel{
    public static void main (String args[]){

        int fakt=1;
        int n;
        Scanner input= new Scanner(System.in);
        n= input.nextInt();
        for(int i=1;i<=n;i++){
            fakt=fakt*i;
        }
        System.out.println("Faktorijel broja " +n+ " je : "+fakt);
    }
}


