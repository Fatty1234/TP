package TP1;
import java.util.Scanner;

public class TP1EXO3 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez la valeur de a : ");
        int a = sc.nextInt();

        System.out.print("Entrez la valeur de b : ");
        int b = sc.nextInt();
        
        System.out.println("Valeurs initiales :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Valeurs après permutation :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

	}

}
