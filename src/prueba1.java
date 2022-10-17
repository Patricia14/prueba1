import java.util.Scanner;
public class prueba1 {
	public static void main(String[] args) {
		 Scanner Entrada = new Scanner(System.in);
		 String n1;
		 String n2;
		    int Casos;
		    
		    
		    System.out.print("Ingrese cantidad de casos: ");
		    Casos = Entrada.nextInt();
		
		    String PalabrasTrifelias[] = new String[Casos];

		    for( int i = 0; i < Casos; i++ ){
		    	System.out.print("Ingrese Palabra "+i+":");
		    	n1=Entrada.next();
		    	System.out.println("Ingrese el Trifelio de Palabra "+i+":");
		    	n2=Entrada.next();
		    	System.out.println("--------------------------------------");
		    	 trifelio(n1, n2);
		    	System.out.println("--------------------------------------");
		    	
		    }
		
		
	    
	}

	private static void trifelio(String str1, String str2) {
	 System.out.println( str1 + ", " + str2 );
	    if(esTrifelio(str1, str2)==true) {
	    	System.out.println("SI");
	    }else {
	    	System.out.println("No");
	    }
	}

	private static boolean esTrifelio(String str1, String str2) {
	    if(str1 == str2) {
	        return false;
	    }

	    str1 = str1.replace("v", "b").toLowerCase();
	    str2 = str2.replace("v", "b").toLowerCase();

	    if(str1.equals(str2)) {
	        return false;
	    }

	    return str1.concat(str1).contains(str2) && str2.concat(str2).contains(str1);
	}
}