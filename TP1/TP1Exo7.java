package TP1;
import java.util.Scanner;

public class TP1Exo7 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrez la valeur de a : ");
		float a=sc.nextFloat();
		System.out.print("Entrez la valeur de b : ");
	    float b =sc.nextFloat();
	    System.out.print("Entrez la valeur de c : ");
	    float c=sc.nextFloat();
	    
	    double delta = Math.pow(b, 2)-(4*(a*c));
	       if(delta > 0){
	           System.out.println("L'equation admet deux solutions");
	           double sol_1 = (float)(Math.pow(b,2)-Math.pow(delta,1/2))/(2*a);
	           double sol_2 = (float) (Math.pow(b,2)+Math.pow(delta,1/2))/(2*a);
	           System.out.println("les 2 solutions sont : "+sol_1);
	           System.out.println("et "+sol_2);
	       }
	       else if(delta == 0){
	           System.out.println("L'equation admet une seule solution");
	           double sol= -b/(2*a);
	           System.out.println("la solution est: "+sol);   
	       }
	       else
	           System.out.println("L'equation n'admet pas de solutions");

	}

}
