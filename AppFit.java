import java.util.Scanner;

public class AppFit {

	public static void exibeMenuPrincipal() {
		System.out.println("OPÇÕES:");
		System.out.println("1 - ENTRAR COMO ALUNO");
		System.out.println("2 - ENTRAR COMO PERSONAL");
		System.out.println("3 - CADASTRAR ALUNO");
		System.out.println("0 - SAIR");
	}

	public static void exibeMenuTreino() {
		System.out.println("OPÇÕES:");
		System.out.println("1 - EXIBIR TREINO A (PEITO/OMBRO/TRICEPS)");
		System.out.println("2 - EXIBIR TREINO B (PERNA)");
		System.out.println("3 - EXIBIR TREINO C (COSTAS/BICEPS)");
		System.out.println("0 - SAIR");
	}

	public static void exibeMenuPersonal() {
		System.out.println("OPÇÕES:");
		System.out.println("1 - ALTERAR TREINO A");
		System.out.println("2 - ALTERAR TREINO B");
		System.out.println("3 - ALTERAR TREINO C");
		System.out.println("4 - VISUALIZAR ALUNOS");
		System.out.println("5 - CRIAR TREINO");
		System.out.println("0 - SAIR");
	}

	public static void main(String[] args) {
		Scanner Al = new Scanner(System.in);
		AcoesAluno cadastro = new AcoesAluno();
		int mP;
		int adm;
		int dia;
		Aluno alu;

		String treinoOriginalA, treinoOriginalB, treinoOriginalC;
		// Treino trei;
		Treino treininho = new Treino();
		String nome, matr, senha, novoTreino;

		do {
			exibeMenuPrincipal();
			mP = Al.nextInt();
			Al.nextLine();
			switch (mP) {
				case 1: // exibindo menu do aluno
					exibeMenuTreino();
					dia = Al.nextInt();
					Al.nextLine();

					switch (dia) {
						case 1: // imprime o treino de peito/ombro/triceps.
							System.out.println("Treino escolhido de PEITO/OMBRO/TRICEPS");
							System.out.println(treininho.getTreinoA());
							mP = 0;
							break;

						case 2: // imprime o treino de perna.
							System.out.println("Treino escolhido de PERNA");
							System.out.println(treininho.getTreinoB());
							mP = 0;
							break;

						case 3: // imprime o treino de costas/biceps.
							System.out.println("Treino escolhido de COSTAS/BICEPS");
							System.out.println(treininho.getTreinoC());
							mP = 0;
							break;

						case 0:
							System.out.println("Programa encerrado...");

						default:
							System.out.println("Opção inválida");
					}
					break;

				case 2: // exibindo o menu do personal
					exibeMenuPersonal();
					adm = Al.nextInt();
					Al.nextLine();
					switch (adm) {
						case 1: // Alterações do treino de peito/ombro/triceps.
							System.out.println("Treino escolhido para mudar A - (PEITO/OMBRO/TRICEPS)");
							System.out.println("Insira o novo treino A: ");
							novoTreino = Al.nextLine();
							treininho.setTreinoA(novoTreino);
							System.out.println(treininho.getTreinoA());

							break;

						case 2: // Alterações do treino de perna.
							System.out.println("Treino escolhido para mudar B - (PERNA)");

							System.out.println("Insira novo treino B: ");
							novoTreino = Al.nextLine();
							treininho.setTreinoB(novoTreino);
							System.out.println(treininho.getTreinoB());

							break;

						case 3: // Alterações do treino de costas/biceps.
							System.out.println("Treino escolhido para mudar C - (COSTAS/BICEPS)");
							System.out.println("Insira novo treino C: ");
							novoTreino = Al.nextLine();
							treininho.setTreinoC(novoTreino);
							System.out.println(treininho.getTreinoC());
							break;
						case 4:
							break;

						case 5:
							System.out.println("Crie o treino A");
							treinoOriginalA = Al.nextLine();
							treininho.setTreinoA(treinoOriginalA);
							break;
						case 6:
							System.out.println("Crie o treino B");
							treinoOriginalB = Al.nextLine();
							treininho.setTreinoB(treinoOriginalB);
							break;
						case 7:
							System.out.println("Crie o treino C");
							treinoOriginalC = Al.nextLine();
							treininho.setTreinoC(treinoOriginalC);
							break;
						case 0:
							System.out.println("Programa encerrado...");

						default:
							System.out.println("Opção inválida");
					}
					break;
				case 3: // cadastro de novo aluno
					System.out.print("Informe o nome do aluno: ");
					nome = Al.nextLine();
					System.out.print("Insira a senha: ");
					senha = Al.nextLine();
					System.out.println("Insira a Matricula: ");
					matr = Al.nextLine();
					alu = new Aluno(nome, senha, matr);
					cadastro.inserirAluno(alu);
					break;
			}

		} while (mP != 0);
	}
}