package ejemplos;
import java.util.Scanner;

/**
 * @author jjlacode
 *
 */
public class PruebaVector10 {
	
	private Scanner teclado;
	private String[] nombres;
	private int[] edades;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		nombres=new String[5];
		edades=new int[5];
		for(int f=0;f<nombres.length;f++) {
			System.out.print("Ingrese nombre:");
			nombres[f]=teclado.next();
			System.out.print("Ingrese edad:");
			edades[f]=teclado.nextInt();
		}	
	}
	
	public void mayoresEdad() {
		System.out.println("Personas mayores de edad.");
		for (int f=0;f<nombres.length;f++) {
			if(edades[f]>=18) {
				System.out.println(nombres[f]);
			}
			
		}
	}
	/**
	 * @param args
	 */
 	public static void main(String[] args) {
		
		PruebaVector10 pv=new PruebaVector10();
		pv.cargar();
		pv.mayoresEdad();
	}

}
