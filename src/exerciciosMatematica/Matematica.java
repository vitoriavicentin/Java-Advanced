/**
 * 
 */
package exerciciosMatematica;

/**
 * @author Vitoria
 *
 */
public class Matematica {
	
	int maior(int um, int dois) {
		if(um > dois) {
			return um;
		} else {
			return dois;
		}
	}
	
	double soma(double um, double dois) {
		double s = um + dois;
		return s;
	}
	
	double raiz(double numero) {
		double r = Math.sqrt(numero);
		return r;
	}
}
