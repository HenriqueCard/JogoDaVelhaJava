package jogoDaVelha;

import java.util.Random;

public class Computador {//classe computador
	
 public int maquina () {//método que vai gerar numeros entre 0 e 8
	 
	 Random num=new Random();
	 int numero=num.nextInt(9);
	 System.out.println(numero);
	 return numero;
}	
}
