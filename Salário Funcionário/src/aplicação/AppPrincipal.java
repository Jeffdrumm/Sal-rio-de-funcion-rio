package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidades.Cálculos; 


public class AppPrincipal {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("pt", "BR"));
		Scanner sc = new Scanner(System.in);
		
		Cálculos calculos = new Cálculos();
		
		System.out.println("Dados do funcionário: ");
		
		System.out.print("Nome: ");
		calculos.nome = sc.nextLine();
		
		System.out.print("Salário Bruto: ");
		calculos.salárioBruto = sc.nextDouble();
		
		System.out.print("Valor do imposto em R$: ");
		calculos.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println( "Empregado: " + calculos);
		System.out.println();
		
		System.out.print("Digite o reajuste: ");
		double porcentagem = sc.nextDouble();
		calculos.aumentoDeSalário(porcentagem);
		
		System.out.println();
		System.out.println("Atualização de salário: " + calculos);
		
		
		

		sc.close();
	}

}
