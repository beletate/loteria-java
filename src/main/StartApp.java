package main;

import java.io.IOException;
import java.util.Scanner;
import univas.vo.FactoryJogo;
import univas.vo.Jogo;
import univas.vo.TipoJogo;

public class StartApp {

	public static void main(String[] args){
	
		
		int 	opcaoMenu	= 0; // para leitura do Menu
		int     opcaoSub	= 0; // para leitura do SubMenu
		Scanner scanner 	= new Scanner(System.in);
		Jogo 	jogo 		= null;


		do {
			
			// Menu de Intera��o com Usuario
			
			System.out.println("------ Menu -----");
			System.out.println("1 - Mega-Sena 	 ");
			System.out.println("2 - Quina 		 ");
			System.out.println("3 - Lotof�cil 	 ");
			System.out.println("9 - Sair 		 ");
			System.out.println("-----------------");
			
			opcaoMenu = scanner.nextInt(); // Ler o numero Digitado pelo usuario
			
			switch(opcaoMenu) {
				case Menu.MEGA :
					jogo = FactoryJogo.getJogo(TipoJogo.MEGA);
					System.out.println("-------------------------	");
					System.out.println("-------- MEGA SENA ------	");
					
				break;
				case Menu.QUINA :					
					jogo = FactoryJogo.getJogo(TipoJogo.QUINA);
					System.out.println("-------------------------	");
					System.out.println("--------- QUINA ---------	");
				break;
				case Menu.LOTO :					
					jogo = FactoryJogo.getJogo(TipoJogo.LOTO);
					System.out.println("-------------------------	");
					System.out.println("--------- LOTO ----------	");
				break;
				case Menu.SAIR :
					System.out.println("Usu�rio escolheu sair");
				return;
				default :
					System.out.println("Op��o escolhida no menu n�o existe. Programa encerrado\n\n");						
				return;
			}
			
			// Sub-Menu de Intera��o com Usuario
			do {
				System.out.println("----- OP��ES DO JOGO ----		");
				System.out.println("1 - N�meros que mais sa�ram  	");
				System.out.println("2 - N�meros que menos sa�ram 	");
				System.out.println("3 - Gerar numeros rand�micos   	");
				System.out.println("4 - Verificar meu jogo 			");
				System.out.println("9 - Voltar para o Menu 			");
				System.out.println("----------------------			");
				
				opcaoSub = scanner.nextInt(); // 
				
				switch(opcaoSub) {
					case Menu.OS_QUE_MAIS_SAIRAM :
						
						jogo.getNumerosQueMaisSairam();
					break;
					case Menu.OS_QUE_MENOS_SAIRAM :
						
						jogo.getNumerosQueMenosSairam();
					break;
					case Menu.NUMEROS_RANDOMICOS :
						
						jogo.gerarRandomicos();
					break;
					case Menu.VERIFICAR_JOGO:
						
						jogo.checarJogo();
					break;
					case Menu.SAIR:
						
						System.out.println("Usu�rio escolheu sair do subMenu");
					break;
					default :
						
						System.out.println("Op��o escolhida � invalida.\n\n");
					break;
				}
			} while (opcaoSub != Menu.SAIR);
		} while (opcaoMenu != Menu.SAIR);
			

	}
}