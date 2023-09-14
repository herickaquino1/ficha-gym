package edu.fichaGym;

public class App {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Herick","07707707798", "herickaquino@next.com", 1.70, 75, "Hipertrofia");
		Professor professor1 = new Professor("Helen", "09909909976", "helen@next.com", 8975);
		Ficha treino = new Ficha();
		treino.setAtleta(aluno1);
		treino.setPersonal(professor1);
		treino.passarTreino();
		treino.imprimirFicha();
	}

}
