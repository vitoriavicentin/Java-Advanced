/**
 * 
 */
package exercicioContas;

/**
 * @author Vitoria
 *
 */
public class ContaTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.cliente = "Daniel";
		conta.saldo = 4000.00;
		conta.exibeSaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Carlos";
		destino.saldo = 5000.00;
		destino.exibeSaldo();

	}

}
