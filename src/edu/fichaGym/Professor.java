package edu.fichaGym;

public class Professor extends Pessoa {
	private int cref;
	
	public Professor(String nome, String cpf, String email, int cref) {
		super(nome, cpf, email);
		this.cref = cref;
	}

	public int getCref() {
		return cref;
	}

	public void setCref(int cref) {
		this.cref = cref;
	}
	
	

	
	
	
}
