package TP1;
import java.util.Scanner;

public class TP1Exo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la valeur de x : ");
        double x = sc.nextDouble();

        System.out.print("Entrez la valeur de n : ");
        int n = sc.nextInt();

        double R = Math.pow(x, n);
        System.out.println(x+ " à la puissance " +n+ " est égal à : " +R);

	}

}
