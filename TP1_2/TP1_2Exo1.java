package TP1_2;
import java.util.Scanner;

public class TP1_2Exo1 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez un entier positif : ");
        int nbr = sc.nextInt();
        if (nbr <= 0) {
            System.out.println("Veuillez entrer un entier positif.");
        }
        afficherDiviseurs(nbr);

        sc.close();
    }
    public static void afficherDiviseurs(int nbr) {
        int nombreDiviseurs = 0;
        int sommeDiviseurs = 0;
        System.out.println("Les diviseurs de " + nbr + " sont :");
        for (int i = 1; i <= nbr; i++) {
            if (nbr % i == 0) {
                System.out.print(i + " ");
                nombreDiviseurs++;
                sommeDiviseurs += i;
            }
        }
        System.out.println("\nLe nombre de diviseurs est : " + nombreDiviseurs);
        System.out.println("La somme des diviseurs est : " + sommeDiviseurs);

	}

}
