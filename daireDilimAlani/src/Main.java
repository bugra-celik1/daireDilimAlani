import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int r;
    double merkezAci,alan,pi=3.14;

    Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz:");
        r = inp.nextInt();
        System.out.print("Dairenin merkez açı ölçüsünü giriniz:");
        merkezAci = inp.nextDouble();

        alan = ( pi* (r*r) * merkezAci) / 360;

        System.out.println("Daire diliminin alanı:" +alan);


    }
}