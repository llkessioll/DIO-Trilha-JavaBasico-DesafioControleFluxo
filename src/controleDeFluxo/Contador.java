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
			} catch (ParametrosInvalidosException e) {
				
				System.out.println(e.mensagem());
			}

	}
	
	static void contador(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		
		int cont = 0;
		
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}else {
			
			cont = parametroDois - parametroUm;
			
			for(int i=1; i<=cont; i++) {
				System.out.println("Imprimindo o número "+i);
			}
			
		}
	}
	

}
