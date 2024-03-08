package TP1;
import java.util.Scanner;

public class TP1Exo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int n = sc.nextInt();

        long factorielle = 1;

        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                factorielle *= i;
            }
            System.out.println("La factorielle de " + n + " est : " + factorielle);
        } 
        else {
        	System.out.println("La factorielle n'est définie que pour les nombres entiers non négatifs.");
        }

	}

}
