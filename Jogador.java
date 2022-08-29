package jogoDaVelha;

import java.util.Scanner;

public class Jogador {

	public void novoJogador()//método criado para fazer a leitura dos dados do jogador
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Nome do jogador:");
		String nome=s.nextLine();
		System.out.println("cidade do jogador:");
		String cidade=s.nextLine();
		System.out.println("Idade do jogador:");
		int idade=s.nextInt();
		
	}
}