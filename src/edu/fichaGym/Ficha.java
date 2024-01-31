package edu.fichaGym;

import java.util.ArrayList;
import java.util.Scanner;

public class Ficha {
	 private Professor personal;
	 private Aluno atleta;
	 private ArrayList<Exercicio> listaExercicio;
	 
	 
	 //TODO: Metodo criado para imprimir as informações do aluno, professor e do treino.
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
		 for(Exercicio exercicio: listaExercicio) {
			 System.out.println("----" + exercicio.getNomeExercicio()+"----");
			 System.out.println("Numero de series: " + exercicio.getNumeroSeries());
			 System.out.println("Numero de repetições: " + exercicio.getNumeroRepeticao());
		 }
	 }
	// TODO: Metodo criado para armazena o nome, numero de series e numero de repetições de cada exercicio
	public void passarTreino() {
		try (Scanner sca = new Scanner(System.in)) {
			System.out.println("Insira a quantidade de exercicios: ");
			int quantidade = sca.nextInt();
			
			this.listaExercicio = new ArrayList<Exercicio>();
			
			for(int n = 0; n < quantidade ; n++) {
				// Metodo nextLine implementado para consumir a linha anterior
				sca.nextLine();
				System.out.println("Nome: ");
				String nome = sca.nextLine();
				
				System.out.println("Series: ");
				int series = sca.nextInt();
				
				System.out.println("Repetições: ");
				int repeticao = sca.nextInt();
				
				listaExercicio.add(n, new Exercicio(nome,series,repeticao));
				
			}
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
	public ArrayList<Exercicio> getListaExercicio() {
		return listaExercicio;
	}
	public void setListaExercicio(ArrayList<Exercicio> listaExercicio) {
		this.listaExercicio = listaExercicio;
	}
	
	 
}
