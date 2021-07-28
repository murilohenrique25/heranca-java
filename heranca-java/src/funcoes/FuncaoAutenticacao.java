package funcoes;

import interfaces.PermitirAcesso;

//Realemente e somente receber alguem que tem contrato da interface de PermitirAcesso e chamar o autenticar
public class FuncaoAutenticacao {

	private PermitirAcesso acesso;
	
	public boolean autenticar() {
		return acesso.autenticar();
	}

	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.acesso = acesso;
	}
	
	
	
}
