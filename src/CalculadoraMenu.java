
import java.util.Scanner;

public class CalculadoraMenu {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int opcao;
		
		do {
			System.out.println("Favor escolher a opera��o matematica que deseja: ");
			
			System.out.println("\n1 => Soma ");
			System.out.println("2 => Subtra��o ");
			System.out.println("3 => Multiplica��o ");
			System.out.println("4 => Divis�o ");
			System.out.println("5 => Sair ");
			
			System.out.print("\nDigite o numero do menu [1,2,3,4,5] => ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			
			case 1:{
				
				System.out.println("\n---- Opera��o Soma ----\n");
				
				System.out.print("Informe o primeiro numero a ser somado: ");
				num1 = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Informe o segundo numero a ser somado: ");
				num2 = sc.nextInt();
				sc.nextLine();
				
				int soma = num1 + num2;
				
				System.out.print("\nO valor total da soma � => " + soma + "\n");
				
				System.out.println("\n---- Opera��o realizada com sucesso ----");
				
				System.exit(soma);
				
							
				break;			
				
			
			}
			
			
			case 2:{
				
				
				System.out.println("---- Opera��o Subtra��o ----");
				
				System.out.print("Informe o primeiro numero da subtra��o: ");
				num1 = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Informe o segundo numero da subtra��o: ");
				num2 = sc.nextInt();
				sc.nextLine();
				
				int subtracao = num1 - num2;
				
				System.out.print("\nO valor total da subtra��o � => " + subtracao + "\n");
				
				System.out.println("\n---- Opera��o realizada com sucesso ----");
				
				System.exit(subtracao);
				
				break;				
			}
			
			
			case 3:{
				
				System.out.println("---- Opera��o Multiplica��o ----");
				
				System.out.print("Informe o primeiro numero da multiplica��o: ");
				num1 = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Informe o segundo numero da multiplica��o: ");
				num2 = sc.nextInt();
				sc.nextLine();
				
				int multiplicacao = num1 * num2;
				
				System.out.print("\nO valor total da multiplica��o � => " + multiplicacao + "\n");
								
				System.out.println("\n---- Opera��o realizada com sucesso ----");
				
				System.exit(multiplicacao);
				
									
			}	
			
			
			case 4:{
				
				System.out.println("---- Opera��o Divis�o ----");
				
				System.out.print("Informe o primeiro numero da divis�o: ");
				num1 = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Informe o segundo numero da divis�o: ");
				num2 = sc.nextInt();
				sc.nextLine();
				
				int divisao = num1 / num2;
				
				System.out.print("\nO valor total da divis�o � => " + divisao + "\n");
								
				System.out.println("\n---- Opera��o realizada com sucesso ----");
				
				System.exit(divisao);
								
				
				}
			
						
			}
			
			
		} while (opcao !=5);
		
		System.out.println("");
		
		System.out.println("\nOp��o Sair [5] digitada , a calculadora foi encerrada com sucesso!!");
	
				
		sc.close();			
		
	}
	
	
	

}
