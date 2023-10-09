package ejercicio10Marzo;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10Marzo {
	

	public static void main(String[] args) {
		
		
		     ArrayList<String> paraules = new ArrayList<String>();
		
			 Scanner sc = new Scanner(System.in);
			 
			 int numParaules;
			 String paraula;
	
		     System.out.print("Introdueix el número de paraules que vols introduir:");
		     numParaules = sc.nextInt();
		 	 sc.nextLine();
		 
		     
		     for (int i = 0; i < numParaules; i++) {
		         System.out.print("Introdueix la paraula" + i + ": " );
		         paraula = sc.nextLine();
		         paraules.add(paraula);
		        
		     }
		     
		     System.out.println("Les paraules introduïdes són: " + paraules);
		     
	}
}

			
			
		

