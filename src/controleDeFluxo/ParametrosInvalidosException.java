package controleDeFluxo;

public class ParametrosInvalidosException extends Exception	{

	private static final long serialVersionUID = 1L;
	
	public String mensagem() {
		return "O segundo parâmetro deve ser maior que o primeiro";
	}
}
