package classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private List<Disciplina> disciplinas = new ArrayList<>();
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	
	public Aluno(String dataMatricula, String nomeEscola, String serieMatriculado, List<Disciplina> disciplinas) {
		super();
		this.dataMatricula = dataMatricula;
		this.nomeEscola = nomeEscola;
		this.serieMatriculado = serieMatriculado;
		this.disciplinas = disciplinas;
	}
	public Aluno() {}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1500.50;
	}
	
	
}
