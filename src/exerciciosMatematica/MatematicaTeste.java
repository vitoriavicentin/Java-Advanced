/**
 * 
 */
package exerciciosMatematica;

/**
 * @author Vitoria
 *
 */
public class MatematicaTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Matematica m = new Matematica();
		int maior = m.maior(20, 30);
		System.out.println("O numero maior � " + maior);

		double som = m.soma(50, 60);
		System.out.println("A soma � " + som);
		
		double ra = m.raiz(10);
		System.out.println("A raiz quadrada � " + ra);

	}

}
