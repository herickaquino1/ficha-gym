package edu.fichaGym;

public class Aluno extends Pessoa {
	private double altura;
	private double peso;
	private String objetivo;
	private double imc;

	public Aluno(String nome, String cpf, String email, double altura, double peso, String objetivo) {
		super(nome, cpf, email);
		this.altura = altura;
		this.peso = peso;
		this.objetivo = objetivo;
		
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public double getImc() {
		return this.imc;
	}
	public void setImc(double imc) {
		this.imc = imc;
	}
	
	

}
