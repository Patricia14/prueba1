import java.util.Scanner;
public class Prueba {

	public static void main(String[] args) {

	    Scanner Entrada = new Scanner(System.in);
	    int Casos;

	    System.out.print("Ingrese cantidad de casos: ");
	    Casos = Entrada.nextInt();
	    Casos = Casos*2;

	    String PalabrasTrifelias[] = new String[Casos];

	    for( int i = 0; i < PalabrasTrifelias.length; i++ ){
	        PalabrasTrifelias[i] = Entrada.next();
	        if( i % 2 == 0){
	            System.out.println();
	        }
	    }

	    int nx = 0;
	    for ( String Palabras:PalabrasTrifelias){
	        System.out.printf(" %d : %s%n", nx, Palabras);
	        nx++;
	    }

	    nx = 0;
	    for ( String Palabras:PalabrasTrifelias){
	        String n1 = Palabras;
	        nx++;
	        String n2 = Palabras;
	        int contador = 0;
	        // Verifico que tengan el mismo numero de carateres creo que deberia tener el mismo numero
	        if( n1.length() == n2.length()){
	            // Ciclo para recorrer el string n1
	            for(int i = 0; i < n1.length(); i++){
	                // Ciclo para recorrer string n2
	                for (int j = 0; j < n2.length(); j++){
	                    // condicinal para ir comparando
	                    if( n1.charAt(i) == n2.charAt(j)){
	                        contador++;
	                    }
	                }
	            }
	        } 
	        System.out.println("contador "+ contador++);
	        if (contador == n1.length()){
	            System.out.println("Si cumple"+ n1 + " con "+ n2);
	        }else{
	            System.out.println("No cumple"+ n1 + " con "+ n2);
	        }
	        nx++;
	    }
	}
   }

