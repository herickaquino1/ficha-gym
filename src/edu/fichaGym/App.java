package edu.fichaGym;

public class App {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Ronaldo","07707707798", "ronaldo@next.com", 1.70, 75, "Hipertrofia");
		Professor professor1 = new Professor("Herick", "09909909976", "Herick@next.com", 8975);
		Ficha treino = new Ficha();
		treino.setAtleta(aluno1);
		treino.setPersonal(professor1);
		treino.calcularImc();
		treino.passarTreino();
		treino.imprimirFicha();
	}

}
