package edu.fichaGym;

import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in).useLocale(Locale.US)) {
			System.out.println("==========GYM FICHA==========");
			
			System.out.println("NOME DO PROFESSOR RESPONSAVEL");
			String nomeProfessor = sc.nextLine();
			
			System.out.println("CPF");
			String cpfProfessor = sc.next();
			
			System.out.println("E-MAIL");
			String emailProfessor = sc.next();
			
			System.out.println("CREF");
			int nome = sc.nextInt();
			
			Professor professor1 = new Professor(nomeProfessor, cpfProfessor, emailProfessor, nome);
			
			System.out.println("ADICIONAR DADOS DO ALUNO");
			System.out.println("------------------------");
			
			sc.nextLine();
			System.out.println("NOME DO ALUNO");
			String nomeAluno = sc.nextLine();
			
			System.out.println("CPF");
			String cpfAluno = sc.next();
			
			System.out.println("E-MAIL");
			String emailAluno = sc.next();
			
			System.out.println("ALTURA");
			double altura = sc.nextDouble();
			
			System.out.println("PESO");
			double peso = sc.nextDouble();
			
			System.out.println("OBJETIVO");
			String objetivo = sc.nextLine();
			sc.nextLine();
			
			Aluno aluno = new Aluno(nomeAluno,cpfAluno, emailAluno, altura, peso, objetivo);
			Ficha treino = new Ficha();
			treino.setAtleta(aluno);
			treino.setPersonal(professor1);
			treino.passarTreino();
			treino.imprimirFicha();
		}
	}

}
