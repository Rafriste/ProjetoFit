import java.net.SocketTimeoutException;
import java.util.Scanner;

public class AppFit {

	public static void exibeMenuPrincipal() {
		System.out.println("========================");
		System.out.println("	 OPÇÕES        ");
		System.out.println("========================");
		System.out.println("1 - ENTRAR COMO ALUNO");
		System.out.println("========================");
		System.out.println("2 - ENTRAR COMO PERSONAL");
		System.out.println("========================");
		System.out.println("3 - CADASTRAR ALUNO");
		System.out.println("========================");
		System.out.println("4 - CADASTRAR PERSONAL");
		System.out.println("========================");
		System.out.println("0 - SAIR");
		System.out.println("========================");
	}

	public static void exibeMenuTreino() {
		System.out.println("========================");
		System.out.println("	 OPÇÕES        ");
		System.out.println("========================");
		System.out.println("1 - EXIBIR TREINO A (PEITO/OMBRO/TRICEPS)");
		System.out.println("========================");
		System.out.println("2 - EXIBIR TREINO B (PERNA)");
		System.out.println("========================");
		System.out.println("3 - EXIBIR TREINO C (COSTAS/BICEPS)");
		System.out.println("========================");
		System.out.println("0 - SAIR");
		System.out.println("========================");
	}

	public static void exibeMenuPersonal() {
		System.out.println("========================");
		System.out.println("	 OPÇÕES        ");
		System.out.println("========================");
		System.out.println("1 - ALTERAR TREINO A");
		System.out.println("========================");
		System.out.println("2 - ALTERAR TREINO B");
		System.out.println("========================");
		System.out.println("3 - ALTERAR TREINO C");
		System.out.println("========================");
		System.out.println("4 - VISUALIZAR ALUNOS");
		System.out.println("========================");
		System.out.println("5 - CRIAR TREINO A");
		System.out.println("========================");
		System.out.println("6 - CRIAR TREINO B");
		System.out.println("========================");
		System.out.println("7 - CRIAR TREINO C");
		System.out.println("========================");
		System.out.println("8 - VIZUALIZAR TODOS OS TREINOS");
		System.out.println("========================");
		System.out.println("0 - SAIR");
		System.out.println("========================");
	}

	public static void main(String[] args) {
		Scanner Al = new Scanner(System.in);
		AcoesAluno cadastroA = new AcoesAluno();
		AcoesAluno cadastroB = new AcoesAluno();
		int mP;
		int adm;
		int dia;
		Aluno alu;
		Personal pers;
		String matr, nome, senha;
		int DiaMalhado = 0;
		String treinoOriginalA, treinoOriginalB, treinoOriginalC;
		// Treino trei;
		Treino treininho = new Treino();
		String novoTreino;

		do {
			System.out.println("=====SEJA BEM-VINDO=====");
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
							System.out.println("=====BOM TREINO=====");
							
							DiaMalhado ++;
							System.out.println("Dias malhados: " + DiaMalhado);
							break;

						case 2: // imprime o treino de perna.
							System.out.println("Treino escolhido de PERNA");
							System.out.println(treininho.getTreinoB());
							System.out.println("=====BOM TREINO=====");
							
							DiaMalhado ++;
							System.out.println("Dias malhados: " + DiaMalhado);
							break;

						case 3: // imprime o treino de costas/biceps.
							System.out.println("Treino escolhido de COSTAS/BICEPS");
							System.out.println(treininho.getTreinoC());
							System.out.println("=====BOM TREINO=====");
							
							DiaMalhado ++;
							System.out.println("Dias malhados: " + DiaMalhado);
							break;

						case 0:
							System.out.println("Programa encerrado...");

						default:
							System.out.println("Opção inválida");
					}
					break;

				case 2: // exibindo o menu do personal.
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
						case 4: // Exibir todos os alunos.
							cadastroA.exibir();
							break;

						case 5: // Criação do treino A
							System.out.println("Crie o treino A");
							treinoOriginalA = Al.nextLine();
							treininho.setTreinoA(treinoOriginalA);
							break;
						case 6: // Criação do treino B
							System.out.println("Crie o treino B");
							treinoOriginalB = Al.nextLine();
							treininho.setTreinoB(treinoOriginalB);
							break;
						case 7: // Criação do treino C
							System.out.println("Crie o treino C");
							treinoOriginalC = Al.nextLine();
							treininho.setTreinoC(treinoOriginalC);
							break;
						case 8: // Vizualização de todos os treinos
							System.out.println("Treino A: ");
							treininho.getTreinoA();
							System.out.println(" ");
							System.out.println("Treino B: ");
							treininho.getTreinoB();
							System.out.println(" ");
							System.out.println("Treino C: ");
							treininho.getTreinoC();
							System.out.println(" ");
							break;
						case 0:
							System.out.println("Programa encerrado...");

						default:
							System.out.println("Opção inválida");
					}
					break;
				case 3: // cadastro de novo aluno.
					System.out.print("Informe o nome do aluno: ");
					nome = Al.nextLine();
					System.out.print("Insira a senha do aluno: ");
					senha = Al.nextLine();
					System.out.println("Insira a matricula do aluno: ");
					matr = Al.nextLine();
					alu = new Aluno(nome, senha, matr);
					cadastroA.inserirAluno(alu);
					break;
				case 4: // Cadastro do novo personal.
					System.out.print("Informe o nome do Personal: ");
					nome = Al.nextLine();
					System.out.print("Insira a senha do personal: ");
					senha = Al.nextLine();
					System.out.println("Insira a matricula do personal: ");
					matr = Al.nextLine();
					pers = new Personal(matr, nome, senha);
					cadastroB.inserirPersonal(pers);
					break;
			}

		} while (mP != 0);
	}
}