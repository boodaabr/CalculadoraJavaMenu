
import java.util.Scanner;

public class CalculadoraMenu {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int opcao;
		
		do {
			System.out.println("Favor escolher a operação matematica que deseja: ");
			
			System.out.println("\n1 => Soma ");
			System.out.println("2 => Subtração ");
			System.out.println("3 => Multiplicação ");
			System.out.println("4 => Divisão ");
			System.out.println("5 => Sair ");
			
			System.out.print("\nDigite o numero do menu [1,2,3,4,5] => ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			
			case 1:{
				
				System.out.println("\n---- Operação Soma ----\n");
				
				System.out.print("Informe o primeiro numero a ser somado: ");
				num1 = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Informe o segundo numero a ser somado: ");
				num2 = sc.nextInt();
				sc.nextLine();
				
				int soma = num1 + num2;
				
				System.out.print("\nO valor total da soma é => " + soma + "\n");
				
				System.out.println("\n---- Operação realizada com sucesso ----");
				
				System.exit(soma);
				
							
				break;			
				
			
			}
			
			
			case 2:{
				
				
				System.out.println("---- Operação Subtração ----");
				
				System.out.print("Informe o primeiro numero da subtração: ");
				num1 = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Informe o segundo numero da subtração: ");
				num2 = sc.nextInt();
				sc.nextLine();
				
				int subtracao = num1 - num2;
				
				System.out.print("\nO valor total da subtração é => " + subtracao + "\n");
				
				System.out.println("\n---- Operação realizada com sucesso ----");
				
				System.exit(subtracao);
				
				break;				
			}
			
			
			case 3:{
				
				System.out.println("---- Operação Multiplicação ----");
				
				System.out.print("Informe o primeiro numero da multiplicação: ");
				num1 = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Informe o segundo numero da multiplicação: ");
				num2 = sc.nextInt();
				sc.nextLine();
				
				int multiplicacao = num1 * num2;
				
				System.out.print("\nO valor total da multiplicação é => " + multiplicacao + "\n");
								
				System.out.println("\n---- Operação realizada com sucesso ----");
				
				System.exit(multiplicacao);
				
									
			}	
			
			
			case 4:{
				
				System.out.println("---- Operação Divisão ----");
				
				System.out.print("Informe o primeiro numero da divisão: ");
				num1 = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Informe o segundo numero da divisão: ");
				num2 = sc.nextInt();
				sc.nextLine();
				
				int divisao = num1 / num2;
				
				System.out.print("\nO valor total da divisão é => " + divisao + "\n");
								
				System.out.println("\n---- Operação realizada com sucesso ----");
				
				System.exit(divisao);
								
				
				}
			
						
			}
			
			
		} while (opcao !=5);
		
		System.out.println("");
		
		System.out.println("\nOpção Sair [5] digitada , a calculadora foi encerrada com sucesso!!");
	
				
		sc.close();			
		
	}
	
	
	

}
