package edu.fichaGym;

import java.util.Scanner;

public class Ficha {
	 private Professor personal;
	 private Aluno atleta;
	 private Exercicio[] listaExercicio;
	 
	 
	 //TODO: Metodo criado para imprimir as informa��es do aluno, professor e do treino.
	public void imprimirFicha() {
		 System.out.println("Professor: "+personal.getNome());
		 System.out.println("CREF: "+personal.getCref());
		 System.out.println("_______________________");
		 System.out.println("Aluno: "+atleta.getNome());
		 System.out.println("Altura: "+atleta.getAltura());
		 System.out.println("Peso: "+atleta.getPeso());
		 System.out.println("Objetivo: "+atleta.getObjetivo());
		 atleta.setImc(calcularImc());
		 System.out.printf("Imc: %.2f \n", atleta.getImc());
		 System.out.println("=========TREINO=========");
		 for(int n = 0; n < listaExercicio.length; n++) {
			 System.out.println("-----"+listaExercicio[n].getNomeExercicio()+"-----");
			 System.out.println("Numero de series: "+listaExercicio[n].getNumeroSeries());
			 System.out.println("Numero de repeti��es: "+listaExercicio[n].getNumeroRepeticao());
		 }
	 }
	// TODO: Metodo criado para armazena o nome, numero de series e numero de repeti��es de cada exercicio
	public void passarTreino() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Insira a quantidade de exercicios: ");
		int quantidadeExercicio = sca.nextInt();
		this.listaExercicio = new Exercicio[quantidadeExercicio];
		
		for(int n = 0; n < listaExercicio.length; n++) {
			listaExercicio[n] = new Exercicio();
			
			System.out.println("Nome do exercicio: ");
			listaExercicio[n].setNomeExercicio(sca.next());
			
			System.out.println("Numero de series: ");
			listaExercicio[n].setNumeroSeries(sca.nextInt());
			
			System.out.println("Numero de repetic�o: ");
			listaExercicio[n].setNumeroRepeticao(sca.nextInt());
			
		}
	}
	// TODO: Metodo que tem por finalidade calcular o indice de massa corporal do aluno.
	private double calcularImc() {
		double resultado = this.atleta.getPeso()/(this.atleta.getAltura()*this.atleta.getAltura());
		return resultado;

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
