package jogoDaVelha;

import java.util.Scanner;

public class Tabuleiro {
	Computador novo=new Computador();//novo objeto da classe computador
Scanner teclado=new Scanner(System.in);
	
	
	 public void jogar() {

			String mat[][]=new String[3][3];//método que imprime o tabuleiro na tela
			mat[0][0]="0";
			mat[0][1]="1";
			mat[0][2]="2";
			mat[1][0]="3";
			mat[1][1]="4";
			mat[1][2]="5";
			mat[2][0]="6";
			mat[2][1]="7";
			mat[2][2]="8";
			for(int i=0;i<mat.length;i++) {
				for(int j=0;j<mat.length;j++) {
					System.out.print(mat[i][j]+"\t");
					
				}
				System.out.println("\n");
			}
			
			
			String linha1,linha2,linha3;
			 String col1,col2,col3,diag1,diag2;//declaração de variáveis
			
			int rodadas=0;
			int jogada=0;
			String simbolo;
			System.out.println("jogo começando");//inicio do jogo
			System.out.println("jogador humano inicia as jogadas");
			
			while(rodadas < 10)//condição criada para garantir as rodadas necessárias
			{
				linha1=mat[0][0]+mat[0][1]+mat[0][2];
				linha2=mat[1][0]+mat[1][1]+mat[1][2];
				linha3=mat[2][0]+mat[2][1]+mat[2][2];
				col1=mat[0][0]+mat[1][0]+mat[2][0];
				col2=mat[0][1]+mat[1][1]+mat[2][1];
				col3=mat[0][2]+mat[1][2]+mat[2][2];
				diag1=mat[0][0]+mat[1][1]+mat[2][2];
				diag2=mat[2][0]+mat[1][1]+mat[0][2];
				 
				if(linha1.equals("xxx")||linha2.equals("xxx")||linha3.equals("xxx")||col1.equals("xxx")||col2.equals("xxx")||col3.equals("xxx")||diag1.equals("xxx")||diag2.equals("xxx")){
					System.out.println("vitoria do jogador humano:");
				//condição que estabele vitória para o jogador
					break;
					
				}   if(linha1.equals("ooo")||linha2.equals("ooo")||linha3.equals("ooo")||col1.equals("ooo")||col2.equals("ooo")||col3.equals("ooo")||diag1.equals("ooo")||diag2.equals("ooo")) {
					System.out.println("Vitoria da maquina");
					//condição que estabelece vitória para a máquina
					break;
				}
				if(rodadas >8) {
					System.out.println("jogo empatado");//condição que estabelece um empate
					break;
				}
				if(rodadas %2==0) {
					jogada=teclado.nextInt();//condição que estabelece quem joga primeiro
					simbolo="x";
					
				}else {
					jogada=novo.maquina();//condição que estabelece a segunda jogada 
					simbolo="o";
				}
				if(jogada==0 && mat[0][0].equals("0")) {//preenchimento de posição
					mat[0][0]=simbolo;
					for(int i=0;i<mat.length;i++) {
						for(int j=0;j<mat.length;j++) {
							System.out.print(mat[i][j]+"\t");
						}
						System.out.println("\n");
					}
					rodadas++;//variável contadora
					continue;
				}
				if(jogada==1 && mat[0][1].equals("1")) {//preenchimento de posição
					mat[0][1]=simbolo;
					for(int i=0;i<mat.length;i++) {
						for(int j=0;j<mat.length;j++) {
							System.out.print(mat[i][j]+"\t");
							
						}
						System.out.println("\n");
					}
	
					rodadas++;//variável contadora
					continue;
				}
				if(jogada==2 && mat[0][2].equals("2")) {//preenchimento de posição
					mat[0][2]=simbolo;
					for(int i=0;i<mat.length;i++) {
						for(int j=0;j<mat.length;j++) {
							System.out.print(mat[i][j]+"\t");
							
						}
						System.out.println("\n");
					}
					rodadas++;//variável contadora
					continue;
				}
				if(jogada==3 && mat[1][0].equals("3")) {//preenchimento de posição
					mat[1][0]=simbolo;
					for(int i=0;i<mat.length;i++) {
						for(int j=0;j<mat.length;j++) {
							System.out.print(mat[i][j]+"\t");
							
						}
						System.out.println("\n");
					}
					
					rodadas++;//variável contadora
					continue;
				}
				if(jogada==4 && mat[1][1].equals("4")) {//preenchimento de posição
					mat[1][1]=simbolo;
					for(int i=0;i<mat.length;i++) {
						for(int j=0;j<mat.length;j++) {
							System.out.print(mat[i][j]+"\t");
							
						}
						System.out.println("\n");
					}
					
					rodadas++;//variável contadora
					continue;
				}
				if(jogada==5 && mat[1][2].equals("5")) {//preenchimento de posição
					mat[1][2]=simbolo;
					for(int i=0;i<mat.length;i++) {
						for(int j=0;j<mat.length;j++) {
							System.out.print(mat[i][j]+"\t");
							
						}
						System.out.println("\n");
					}
					
					rodadas++;//variável contadora
					continue;
				}
				if(jogada==6 && mat[2][0].equals("6")) {//preenchimento de posição
					mat[2][0]=simbolo;
					for(int i=0;i<mat.length;i++) {
						for(int j=0;j<mat.length;j++) {
							System.out.print(mat[i][j]+"\t");
							
						}
						System.out.println("\n");
					}
					
					rodadas++;//variável contadora
					continue;
				}
				if(jogada==7 && mat[2][1].equals("7")) {//preenchimento de posição
					mat[2][1]=simbolo;
					for(int i=0;i<mat.length;i++) {
						for(int j=0;j<mat.length;j++) {
							System.out.print(mat[i][j]+"\t");
							
						}
						System.out.println("\n");
					}
					
					rodadas++;//variável contadora
					continue;
				}
				if(jogada==8 && mat[2][2].equals("8")) {//preenchimento de posição
					mat[2][2]=simbolo;
					for(int i=0;i<mat.length;i++) {
						for(int j=0;j<mat.length;j++) {
							System.out.print(mat[i][j]+"\t");
							
						}
						System.out.println("\n");
					}
					rodadas++;//variável contadora
					continue;
				}else  //condição contrária a todas as outras
				{
					System.out.println(jogada+" Posiçao ocupada.Tente outra");
					continue;
				}
					
		 
		 
	 }
	
	
	
}
}


