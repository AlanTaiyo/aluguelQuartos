package sistema;

import java.util.Scanner;

import classe.Registro;

public class Main {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.println("Este programa irá simular um aluguel de quartos.");
		Registro[] vetor = new Registro[10];

		int alugar = 0;
		int quarto = 0;
		String sistema = "on";

		while (sistema == "on") {
			
			System.out.println();
			System.out.println("O que você quer fazer?");
			System.out.println("1 - Mostrar hospedes");
			System.out.println("2 - Alugar quarto");
			System.out.println("3 - Encerrar aluguel");
			System.out.println("4 - Sair do sistema");
			System.out.println();
			System.out.print("DIGITE: ");
			int opcao = leitura.nextInt();
			System.out.println();

			switch (opcao) {

			case 1:
				System.out.println("QUARTOS ALUGADOS: ");

				for (int i = 0; i < vetor.length; i++) {
					if (vetor[i] != null) {
						System.out.println(vetor[i]);
					} else {
						continue;
					}
				}
				break;

			case 2:
				System.out.println("Digite a quantidade de quartos que você quer alugar: ");
				alugar = leitura.nextInt();
				for (int i = 0; i < alugar;) {
					while (i < alugar) {
						System.out.println("Digite o número do quarto que você vai querer alugar de 1 a 10.");
						quarto = leitura.nextInt();
						leitura.nextLine();
						if (vetor[quarto] == null) {
							System.out.println("Quarto está disponível.");
							System.out.println("Digite o nome do hospedeiro: ");
							String nome = leitura.nextLine();
							System.out.println("Digite o e-mail: ");
							String email = leitura.nextLine();

							vetor[quarto] = new Registro(nome, email, quarto);
							i++;
						} else if (vetor[quarto] != null) {
							System.out.println("O quarto não está disponível.");
							continue;
						}

					}

				}
				break;

			case 3:
				System.out.println("Digite o número do quarto que você vai querer encerrar o aluguel de 1 a 10.");
				quarto = leitura.nextInt();
				leitura.nextLine();
				if (vetor[quarto] != null) {
					System.out.println("Quarto está sendo alugado por:");
					System.out.println(vetor[quarto]);

					System.out.println("Você tem certeza que quer cancelar o alugel?");
					System.out.println("1 - SIM");
					System.out.println("2 - NÃO");
					int cancelar = leitura.nextInt();

					if (cancelar == 1) {
						vetor[quarto] = null;
						break;
					} else if (cancelar == 2) {
						break;
					} else {
						System.out.println("A opção digitada é inválida."); //Eu não sei ainda como imprimir essa mensagem na tela sem dá erro.
					}
					

				} else if (vetor[quarto] == null) {
					System.out.println("O quarto está vazio.");
					continue;
				} else {
					System.out.println("Número do quarto inválido."); //Eu não sei ainda como imprimir essa mensagem na tela sem dá erro.
					break;
				}
				
			case 4:
				System.out.println();
				System.out.println("Saindo do sistema...");
				sistema = "off";
				break;

			}

		}
		
		System.out.println();
		System.out.println("A utilização do sistema foi concluída com sucesso!");
		System.out.println("Obrigado por utiliza-lo.");
		System.out.println("Feito por: alan_taiyo");
		
		leitura.close();
	}
}