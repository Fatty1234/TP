package TP1;
import java.util.Scanner;

public class TP1Exo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la valeur de a : ");
        double a = sc.nextDouble();

        System.out.print("Entrez la valeur de b : ");
        double b = sc.nextDouble();

        if (a != 0) {
            double s = -b/a;
            System.out.println("L'équation a une solution unique : x = " +s);
        } else if (b == 0) {
            System.out.println("L'équation a une infinité de solutions (tous les réels sont solutions).");
        } else {
            System.out.println("L'équation n'a pas de solution.");
        }

	}

}
