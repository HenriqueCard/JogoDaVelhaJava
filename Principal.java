package jogoDaVelha;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args)//função principal
	{	
	Jogador humano=new Jogador();//criação de um novo objeto da classe jogador
	humano.novoJogador();//chamada do metódo
		Tabuleiro jogo =new Tabuleiro();//criação de um novo objeto da classe Tabuleiro
		
		jogo.jogar();// chamada do método que traz o jogo
						
	}

}
