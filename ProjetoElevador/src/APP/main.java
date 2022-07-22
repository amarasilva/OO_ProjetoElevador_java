package APP;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Elevador e = new Elevador();

		int totalAnd = 10;

		int capacidade = 8;

		int escolha;

		e.inicializa(capacidade, totalAnd);

		do {

			System.out.println("****** Elevador ******");
			System.out.println("tecle 1 #SUBIR#		  ");
			System.out.println("tecle 2 #DESCER#      ");
			System.out.println("tecle 3 ENTRAR pessoa ");
			System.out.println("tecle 4 SAIR pessoa \n");
			System.out.println("Voc� est� no " + e.getAndarAtu() + " andar");
			System.out.println("T�m " + e.getqPessoas() + " pessoas no elevador");

			escolha = sc.nextInt();

			switch (escolha) {

			case 1:
				e.sobe();
				break;

			case 2:
				e.desce();
				break;

			case 3:
				int entrando;
				do {// verifica se o usu�rio digitar o primeiro valor a cima da capacidade
					System.out.println("quantas pessoas est�o entrando?");
					entrando = sc.nextInt();
					if (entrando > e.getCapacidade()) {
						System.out.println("capacidade maxima 8 pessoas!");
					}

				} while (entrando > e.getCapacidade());

				e.entra(entrando);
				break;

			case 4:
				System.out.println("quantas pessoas est�o saindo?");
				int saindo = sc.nextInt();
				e.sai(saindo);
				if (e.getqPessoas() < 0) {// verifica se o elevador est� vazio
					System.out.println("elevador vazio");
					e.setqPessoas(0);
				}

				break;
			}

			System.out.println("voc� est� no " + e.getAndarAtu() + " andar");
			System.out.println("tem " + e.getqPessoas () + "pessoas no elevador");

		} while (escolha != 0);

		sc.close();

	}

}
