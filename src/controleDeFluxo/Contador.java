package controleDeFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Entre com o valor do primeiro parametro");
		int primeiroParametro = teclado.nextInt();
		
		System.out.println("Entre com o valor do segundo parametro");
		int segundoParametro = teclado.nextInt();
		
		try {
			
			contador(primeiroParametro, segundoParametro);
			
		}catch(Exception e) {
			
		}
	}
	
	static void contador(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		
	}
	
}
