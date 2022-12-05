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
		System.out.println("1 - EXIBIR TREINO ");
		System.out.println("========================");
		System.out.println("0 - SAIR");
		System.out.println("========================");
	}

	public static void exibeMenuPersonal() {
		System.out.println("========================");
		System.out.println("	 OPÇÕES        ");
		System.out.println("========================");
		System.out.println("1 - ALTERAR TREINO");
		System.out.println("========================");
		System.out.println("2 - VISUALIZAR ALUNOS");
		System.out.println("========================");
		System.out.println("3 - INSERIR TREINO");
		System.out.println("========================");
		System.out.println("4 - VIZUALIZAR TODOS OS TREINOS");
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
		int matr = 0;
		int matrAluno;
		int DiaMalhado = 0;
		int DiaTrabalhado = 0;
		String treino;
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
							case 1: // imprime o treino
								Treino treinoBuscado = fachada.buscarTreino(matr);
								treinoBuscado.toString();
								System.out.println("");
								System.out.println("=====BOM TREINO=====");
								DiaMalhado++;
								System.out.println("Dias malhados: " + DiaMalhado);
								break;
							case 0:
								System.out.println("");
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
							case 1: // Alterações do treino
								System.out.println("Insira a matrícula do aluno: ");
								matrAluno = Al.nextInt();
								Treino treinoBuscado = fachada.buscarTreino(matrAluno);
								fachada.excluirTreino(treinoBuscado);
								System.out.println(" ");
								System.out.println("Insira o novo treino: ");
								treino = Al.next();
								trei = new Treino(matrAluno, treino);
								fachada.adicionarTreino(trei);
								break;
							case 2: // Exibir todos os alunos.
								fachada.exibirAlunos();
								break;
							case 3: // Criação do treino 
								System.out.println("Insira a matrícula do aluno: ");
								matrAluno = Al.nextInt();
								System.out.println(" ");
								System.out.println("Insira o treino: ");
								treino = Al.next();
								trei = new Treino(matrAluno, treino);
								fachada.adicionarTreino(trei);
								break;
							case 4: // Vizualização de todos os treinos
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
					matr++;
					System.out.print("Informe o nome do aluno: ");
					nome = Al.nextLine();
					System.out.print("Insira a senha do aluno: ");
					senha = Al.nextLine();
					System.out.println("A sua matricula será: " + matr);
					alu = new Aluno(nome, senha, matr);
					fachada.adicionarAluno(alu);
					break;
				case 4: // Cadastro do novo personal.
					matr++;
					System.out.print("Informe o nome do Personal: ");
					nome = Al.nextLine();
					System.out.print("Insira a senha do personal: ");
					senha = Al.nextLine();
					System.out.println("A sua matricula será: " + matr);
					pers = new Personal(nome, senha, matr);
					fachada.adicionarPerso(pers);
					break;
			}
		} while (mP != 0);
	}
}