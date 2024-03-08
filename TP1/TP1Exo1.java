package TP1;

import java.util.Scanner;

public class TP1Exo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Entrez le premier entier : ");
        int a = sc.nextInt();

        System.out.print("Entrez le deuxième entier : ");
        int b = sc.nextInt();

        int S = a+b ;
        System.out.println("Somme : " +S);

        int diff= a-b;
        System.out.println("Différence : " +diff);

        int P = a*b;
        System.out.println("Produit : " +P);

        
        if (b!= 0) {
            double Q = (double) a/b ;
            System.out.println("Quotient : " +Q);
        } else {
            System.out.println("Division par zéro impossible.");
        }
	}

}
