package edu.fichaGym;

public class Ficha {
	 private Professor personal;
	 private Aluno atleta;
	 private Exercicio listaExercicio[];
	 
	 
	 // Metodo criado para imprimir as informações do aluno, professor e do treino.
	 void imprimirFicha() {
		 System.out.println("Professor: "+personal.getNome());
		 System.out.println("CPF: "+personal.getCpf());
		 System.out.println("Email: "+personal.getEmail());
		 System.out.println("CREF: "+personal.getCref());
		 System.out.println("_______________________");
	 }
	 
	public Professor getPersonal() {
		return personal;
	}
	public void setPersonal(Professor personal) {
		this.personal = personal;
	}
	public Aluno getAtleta() {
		return atleta;
	}
	public void setAtleta(Aluno atleta) {
		this.atleta = atleta;
	}
	public Exercicio[] getListaExercicio() {
		return listaExercicio;
	}
	public void setListaExercicio(Exercicio[] listaExercicio) {
		this.listaExercicio = listaExercicio;
	}
	 
	 
}
