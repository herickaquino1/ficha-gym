package edu.fichaGym;

public class Exercicio {
	private String nomeExercicio;
	private int numeroSeries;
	private int numeroRepeticao;
	
	public Exercicio(String nomeExercicio, int numeroSeries, int numeroRepeticao) {
		this.nomeExercicio = nomeExercicio;
		this.numeroSeries = numeroSeries;
		this.numeroRepeticao = numeroRepeticao;
	}

	public String getNomeExercicio() {
		return nomeExercicio;
	}

	public void setNomeExercicio(String nomeExercicio) {
		this.nomeExercicio = nomeExercicio;
	}

	public int getNumeroSeries() {
		return numeroSeries;
	}

	public void setNumeroSeries(int numeroSeries) {
		this.numeroSeries = numeroSeries;
	}

	public int getNumeroRepeticao() {
		return numeroRepeticao;
	}

	public void setNumeroRepeticao(int numeroRepeticao) {
		this.numeroRepeticao = numeroRepeticao;
	}
	
	
	
	
	
	
}
