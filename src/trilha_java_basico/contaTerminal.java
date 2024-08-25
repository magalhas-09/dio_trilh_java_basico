package trilha_java_basico;

import java.util.Locale;
import java.util.Scanner;

import entities.conta;

public class contaTerminal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		conta cont = new conta();
		
		System.out.println("FAÇA O SEU CADASTRO:");
		System.out.println("Digite o numero da conta: ");
		cont.numero = sc.nextInt();
		System.out.println("Digite a Agência: ");
		cont.agencia = sc.next();
		System.out.println("Digite o nome do cliente: ");
		cont.nome = sc.next();
		System.out.println("Valor para depósito: ");
		cont.saldo = sc.nextDouble();
		
		System.out.println(cont);
			
		
		sc.close();

	}

}
