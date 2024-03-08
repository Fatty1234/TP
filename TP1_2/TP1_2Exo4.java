package TP1_2;
import java.util.Scanner;

public class TP1_2Exo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.print("Entrez le premier entier : ");
	        int n = sc.nextInt();
	        System.out.print("Entrez le deuxième entier : ");
	        int m = sc.nextInt();
	        if (sontNombresAmis(n, m)) {
	            System.out.println(n + " et " + m + " sont des nombres amis.");
	        } else {
	            System.out.println(n + " et " + m + " ne sont pas des nombres amis.");
	        }

	    }

	    public static boolean sontNombresAmis(int n, int m) {
	      
	        int sommeDiviseursN = sommeDiviseurs(n);
	        int sommeDiviseursM = sommeDiviseurs(m);

	        
	        return sommeDiviseursN == m && sommeDiviseursM == n;
	    }

	    public static int sommeDiviseurs(int nombre) {
	        int somme = 0;
	      
	        for (int i = 2; i <= nombre / 2; i++) {
	            if (nombre % i == 0) {
	                somme += i; 
	            }
	        }
	        return somme;
	}

}
