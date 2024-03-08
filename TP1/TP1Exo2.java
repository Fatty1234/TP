package TP1;
import java.util.Scanner;

public class TP1Exo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Entrez le rayon du cercle : ");
	     double r= sc.nextDouble();

	     double s = Math.PI*Math.pow(r, 2);
	     System.out.println("Surface du cercle : " +s);

	     double p = 2 * Math.PI*r;
	     System.out.println("Périmètre du cercle : " +p);

	}

}
