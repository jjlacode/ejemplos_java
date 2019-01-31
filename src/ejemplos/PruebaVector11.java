/**
 * 
 */
package ejemplos;
import java.util.Scanner;

/**
 * @author jjlacode
 *
 */
public class PruebaVector11 {
	private Scanner teclado;
	private String[] nombres;
	private float[] sueldos;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		nombres=new String[5];
		sueldos=new float[5];
		for(int f=0;f<nombres.length;f++) {
			System.out.print("ingrese el nombre del empleado:");
			nombres[f]=teclado.next();
			System.out.print("Ingrese el sueldo:");
			sueldos[f]=teclado.nextFloat();
		}
	}
	
	public void mayorSueldo() {
		float mayor;
		int pos;
		mayor=sueldos[0];
		pos=0;
		for(int f=1;f<nombres.length;f++) {
			if(sueldos[f]>mayor) {
				mayor=sueldos[f];
				pos=f;
			}
		}
		System.out.println("El empleado con sueldo mayor es "+nombres[pos]);
		System.out.println("Tiene un sueldo: "+mayor);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		PruebaVector11 pv=new PruebaVector11();
		pv.cargar();
		pv.mayorSueldo();
	}

}
