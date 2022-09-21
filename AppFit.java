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
		System.out.println("0 - SAIR");
	}

	public static void main(String[] args) {
		Scanner Al = new Scanner(System.in);
		AcoesAluno cadastro = new AcoesAluno();
		int mP;
		int adm;
		int dia;
		int agenda;
		Aluno alu;
		Treino treininho = new Treino(treinoPeito, treinoPerna, treinoCostas, treinoBraco);

		do {
            exibeMenuPrincipal();
			mP = Al.nextInt(); Al.nextLine();
			switch (mP) {
				case 1: // exibindo menu do aluno
						exibeMenuTreino();
						dia = Al.nextInt(); Al.nextLine();
						switch (dia) {
							case 1: //imprime o treino de peito/ombro/triceps.
									System.out.println("Treino escolhido de PEITO/OMBRO/TRICEPS");
									treininho.treinoPOB();
									break;
			
							case 2: //imprime o treino de perna.
									System.out.println("Treino escolhido de PERNA");
									treininho.treinoPerna();
									break;
		
							case 3: //imprime o treino de costas/biceps.
									System.out.println("Treino escolhido de COSTAS/BICEPS");
									treininho.treinoCB();
									break;

							case 0:
									System.out.println("Programa encerrado...");

							default: System.out.println("Opção inválida");
            			}
						break;

				case 2: // exibindo o menu do personal
						exibeMenuPersonal();
						adm = Al.nextInt(); Al.nextLine();
						switch (adm) {
							case 1: //imprime o treino de peito/ombro/triceps.
									System.out.println("Treino escolhido de PEITO/OMBRO/TRICEPS");
									treininho.treinoPOB();
									break;
			
							case 2: //imprime o treino de perna.
									System.out.println("Treino escolhido de PERNA");
									treininho.treinoPerna();
									break;
		
							case 3: //imprime o treino de costas/biceps.
									System.out.println("Treino escolhido de COSTAS/BICEPS");
									treininho.treinoCB();
									break;

							case 0:
									System.out.println("Programa encerrado...");

							default: System.out.println("Opção inválida");
            			}
						break;
				case 3: // cadastro de novo aluno
						System.out.print("Informe o nome do aluno: ");
                        nome = Al.nextLine();
                        System.out.print("Insira a senha: ");
                        senha = Al.nextLine();
                        alu = new Aluno (nome, senha);
                        cadastro.inserirAluno(alu);
                        break;
			} while (mP != 0);
		}
	}
}