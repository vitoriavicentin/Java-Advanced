package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean continuar = true;
		do { 
			try {
			
			System.out.println("Numero : ");
			
			int a = s.nextInt();
			System.out.println("Divisor:" );
			
			int b = s.nextInt();
			System.out.println("A divisão é: " + a/b);
			continuar = false;
			}
			catch(InputMismatchException e1) {
				System.err.println("Favor inserir numeros inteiros!");
				s.nextLine(); //descarta entrada invalida
			}
			catch(Throwable e2) {
				System.err.println("Favor divisor deve ser diferente de 0!");
			}
			finally {
				System.err.println("Finally executado...");
			}
		}while(continuar);
	}

}
