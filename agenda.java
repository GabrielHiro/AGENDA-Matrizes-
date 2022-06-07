package agenda;

import java.util.Scanner;

public class agenda {
	@SuppressWarnings({ "resource"}) //suprimir ou ignorar avisos do compilador
	public static void main(String[] args) {
		
		// Novo Scanner: "ler"
		
		Scanner ler = new Scanner(System.in);
		
		//	    | Variaveis | 
		
		int l, c = 0; //Linhas e colunas para movimentação dentro das matrizes
		String a[][] = new String [10][5]; // Matriz da Agenda + Dimensão da matriz
		
		//      | Inicio do Codigo | 
		
		for(l = 0; l < 2; l++) {
			System.out.printf("\n |   NOVA PESSOA - NUMERO %d  |  ", l+1);
			
			System.out.print("\n  Primeiro Nome..:  ");
			a[l][0] = ler.nextLine(); //leitura do nome da pessoa
			
			System.out.print("\n  Endereço.......:  ");
			a[l][1] = ler.nextLine(); //leitura do Endereço da pessoa
			
			System.out.print("\n  Codigo Postal..:  ");
			a[l][2] = ler.nextLine(); //leitura do Codigo Postal da pessoa
			
			System.out.print("\n  Bairro.........:  ");
			a[l][3] = ler.nextLine(); //leitura do Bairro da pessoa
			
			System.out.print("\n  Telefone.......:  ");
			a[l][4] = ler.nextLine(); //leitura do Telefone da pessoa
		
		}
		
		//Impresão da Agenda 
		System.out.printf("\n AGENDA | Nome, Endereço, Codigo Postal, Bairro, Telefone	");
		for(l = 0; l < 2; l++) {
			System.out.printf("\n 0%d ",l);
			for(c = 0; c < 5; c++) {
				
				System.out.printf(" %s,",a[l][c]);
				
			}
		}
	}
}

