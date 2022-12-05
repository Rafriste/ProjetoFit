package UI;

import java.util.Scanner;

import Negocio.Fachada;
import Negocio.Aluno.Aluno;
import Negocio.Personal.Personal;
import Negocio.Treino.Treino;

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

	public static void main(String[] args) throws Exception {
		Scanner Al = new Scanner(System.in);
		
		Fachada fachada = new Fachada();
		int mP;
		int adm;
		int dia;
		Aluno alu;
		Personal pers;
		String nome, senha;
		int matr;
		int DiaMalhado = 0;
		int DiaTrabalhado = 0;
		String treinoA, treinoB, treinoC;
		Treino trei;

		do {
			System.out.println("=====SEJA BEM-VINDO=====");
			exibeMenuPrincipal();
			mP = Al.nextInt();
			Al.nextLine();
			switch (mP) {
				case 1: // exibindo menu do aluno
					System.out.println("Insira sua matrícula: ");
					matr = Al.nextInt();
					fachada.buscarAluno(matr);
					if (fachada.buscarAluno(matr) != null) {
						exibeMenuTreino();
						dia = Al.nextInt();
						Al.nextLine();
						switch (dia) {
							case 1: // imprime o treino de peito/ombro/triceps.
								Treino treinoABuscado = fachada.buscarTreino(matr);
								System.out.println("Treino escolhido de PEITO/OMBRO/TRICEPS");
								treinoABuscado.toString();
								System.out.println("=====BOM TREINO=====");
								DiaMalhado++;
								System.out.println("Dias malhados: " + DiaMalhado);
								break;
							case 2: // imprime o treino de perna.
								Treino treinoBBuscado = fachada.buscarTreino(matr);
								System.out.println("Treino escolhido de PERNA");
								treinoBBuscado.toString();
								System.out.println("=====BOM TREINO=====");
								DiaMalhado++;
								System.out.println("Dias malhados: " + DiaMalhado);
								break;
							case 3: // imprime o treino de costas/biceps.
								Treino treinoCBuscado = fachada.buscarTreino(matr);
								System.out.println("Treino escolhido de COSTAS/BICEPS");
								treinoCBuscado.toString();
								System.out.println("=====BOM TREINO=====");
								DiaMalhado++;
								System.out.println("Dias malhados: " + DiaMalhado);
								break;
							default:
								System.out.println("Opção inválida");
						}
						break;
					}

				case 2: // exibindo o menu do personal.
					System.out.println("Insira sua matrícula: ");
					matr = Al.nextInt();
					fachada.buscarPersonal(matr);
					if (fachada.buscarPersonal(matr) != null) {
						exibeMenuPersonal();
						adm = Al.nextInt();
						Al.nextLine();
						DiaTrabalhado++;
						System.out.println("Dias Trabalhados: " + DiaTrabalhado);
						switch (adm) {
							case 1: // Alterações do treino de peito/ombro/triceps.
								Treino treinoABuscado = fachada.buscarTreino(matr);
								fachada.excluirTreino(treinoABuscado);
								System.out.println("Treino escolhido para mudar A - (PEITO/OMBRO/TRICEPS)");
								System.out.println("Insira o novo treino A: ");
								treinoA = Al.nextLine();
								trei = new Treino(matr, treinoA);
								fachada.adicionarTreino(trei);
								break;
							case 2: // Alterações do treino de perna.
								Treino treinoBBuscado = fachada.buscarTreino(matr);
								fachada.excluirTreino(treinoBBuscado);
								System.out.println("Treino escolhido para mudar B - (PERNA)");
								System.out.println("Insira novo treino B: ");
								treinoB = Al.nextLine();
								trei = new Treino(matr, treinoB);
								fachada.adicionarTreino(trei);
								break;
							case 3: // Alterações do treino de costas/biceps.
								Treino treinoCBuscado = fachada.buscarTreino(matr);
								fachada.excluirTreino(treinoCBuscado);
								System.out.println("Treino escolhido para mudar C - (COSTAS/BICEPS)");
								System.out.println("Insira novo treino C: ");
								treinoC = Al.nextLine();
								trei = new Treino(matr, treinoC);
								fachada.adicionarTreino(trei);
								break;
							case 4: // Exibir todos os alunos.
								fachada.exibirAlunos();
								break;
							case 5: // Criação do treino A
								System.out.println("Crie o treino A");
								treinoA = Al.nextLine();
								trei = new Treino(matr, treinoA);
								fachada.adicionarTreino(trei);
								break;
							case 6: // Criação do treino B
								System.out.println("Crie o treino B");
								treinoB = Al.nextLine();
								trei = new Treino(matr, treinoB);
								fachada.adicionarTreino(trei);
								break;
							case 7: // Criação do treino C
								System.out.println("Crie o treino C");
								treinoC = Al.nextLine();
								trei = new Treino(matr, treinoC);
								fachada.adicionarTreino(trei);
								break;
							case 8: // Vizualização de todos os treinos
								System.out.println("Treinos cadastrados: ");
								fachada.exibirTreinos();
								break;
							case 0:
								System.out.println("Programa encerrado...");

							default:
								System.out.println("Opção inválida");
						}
						break;
					}
				case 3: // cadastro de novo aluno.
					System.out.print("Informe o nome do aluno: ");
					nome = Al.nextLine();
					System.out.print("Insira a senha do aluno: ");
					senha = Al.nextLine();
					System.out.println("Insira a matricula do aluno: ");
					matr = Al.nextInt();
					alu = new Aluno(nome, senha, matr);
					fachada.adicionarUsuario(alu);
					break;
				case 4: // Cadastro do novo personal.
					System.out.print("Informe o nome do Personal: ");
					nome = Al.nextLine();
					System.out.print("Insira a senha do personal: ");
					senha = Al.nextLine();
					System.out.println("Insira a matricula do personal: ");
					matr = Al.nextInt();
					pers = new Personal(nome, senha, matr);
					fachada.adicionarPerso(pers);
					break;
			}
		} while (mP != 0);
	}
}