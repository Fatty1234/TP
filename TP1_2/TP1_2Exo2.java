package TP1_2;
import java.util.Scanner;

public class TP1_2Exo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez l'heure : ");
        int heure = sc.nextInt();
        System.out.print("Entrez les minutes : ");
        int minutes = sc.nextInt();
        int nouvelleHeure = (heure + (minutes + 1) / 60) % 24;
        int nouvellesMinutes = (minutes + 1) % 60;
        System.out.println("Dans une minute, il sera " + nouvelleHeure + " heure(s) " + nouvellesMinutes + ".");

	}

}
