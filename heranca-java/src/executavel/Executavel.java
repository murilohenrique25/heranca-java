package executavel;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.Diretor;
import classes.Secretario;
import funcoes.FuncaoAutenticacao;
import interfaces.PermitirAcesso;

public class Executavel {
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setNome("Murilo");
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("125");
		diretor.setNome("Paulo Mansur");
		
		Secretario secretario = new Secretario();
		secretario.setNome("Jose Carlos");
		secretario.setExperiencia("Administração");
		
		String login = JOptionPane.showInputDialog("informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
				
		
		if(new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()) {
			JOptionPane.showMessageDialog(null,"Acesso liberado");
		}{
			JOptionPane.showMessageDialog(null,"Acesso negado");
		}
		
		//System.out.println(secretario.autenticar() == true ? "Acesso liberado" : "Acesso negado!");
	}
}
