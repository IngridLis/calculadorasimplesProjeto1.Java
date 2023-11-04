package calculadorasimples;

import java.util.Scanner;
public class calculadorasimples{
	
	public static void main (String[] args) {
		double n1, n2; 
		int op; //Declarar variável aqui
		double adicao, subtracao, multiplicacao, divisao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor, por favor: ");
		n1 = entrada.nextDouble();
		System.out.println("Digite o segundo valor, por favor: ");
		n2 = entrada.nextDouble();
		
		System.out.println("#SELECIONE UMA OPERAÇÃO#");
		System.out.println("[1] - Adição");
		System.out.println("[2] - Subtração");
		System.out.println("[3] - Multiplicação");
		System.out.println("[4] - Divisão");
		System.out.println("DIGITE SUA OPÇÃO, POR GENTILEZA: ");
		op = entrada.nextInt();
		
		//Estrutura SWITCH - vai avaliar a variável opção que vai ser a operação matemática que deseja realizar  
		
		switch(op) {
			case 1:
				adicao = n1 + n2; 
				System.out.println("A soma é :" + adicao);
				break;
				
			case 2:
				subtracao = n1 - n2;
				System.out.println("O resultado da subtração é:" + subtracao);
				break;
				
			case 3: 
				multiplicacao = n1 * n2;
				System.out.println("O resultado da multiplicação é :" + multiplicacao);
				break;
				
			case 4:
				if(n1<n2) {
					System.out.println("Impossível de realizar o cálculo ");
				}
				else {
					divisao = n1/n2;
					System.out.println("O resultado da divisão é :" + divisao);
				}
				break;
				
				//default -> se caso nenhuma dessas possibilidades acontecerem, irá retornar aqui
				
				default:
					System.out.println("Operação inválida");
				
		
		}
	}
}