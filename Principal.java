package jogoDaVelha;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args)//fun��o principal
	{	
	Jogador humano=new Jogador();//cria��o de um novo objeto da classe jogador
	humano.novoJogador();//chamada do met�do
		Tabuleiro jogo =new Tabuleiro();//cria��o de um novo objeto da classe Tabuleiro
		
		jogo.jogar();// chamada do m�todo que traz o jogo
						
	}

}
