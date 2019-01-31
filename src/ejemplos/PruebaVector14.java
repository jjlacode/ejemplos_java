/**
 * 
 */
package ejemplos;
import java.util.Scanner;

/**
 * @author jjlacode
 *
 */
public class PruebaVector14 {
	private Scanner teclado;
	private String[] paises;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		paises=new String[5];
		for(int f=0;f<paises.length;f++) {
			System.out.print("Ingrese el nombre del pais:");
			paises[f]=teclado.next();
		}
	}
	
	public void ordenar() {
		for(int k=0;k<4;k++) {
			for(int f=0;f<4-k;f++) {
				if(paises[f].compareTo(paises[f+1])>0) {
					String aux;
					aux=paises[f];
					paises[f]=paises[f+1];
					paises[f+1]=aux;
				}
			}
		}
	}
	
	public void imprimir() {
		System.out.println("Paises ordenados en forma alfabetica:");
		for(int f=0;f<paises.length;f++) {
			System.out.println(paises[f]);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		PruebaVector14 pv=new PruebaVector14();
		pv.cargar();
		pv.ordenar();
		pv.imprimir();
	}

}
