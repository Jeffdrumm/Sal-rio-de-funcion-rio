package aplica��o;

import java.util.Locale;
import java.util.Scanner;

import entidades.C�lculos; 


public class AppPrincipal {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("pt", "BR"));
		Scanner sc = new Scanner(System.in);
		
		C�lculos calculos = new C�lculos();
		
		System.out.println("Dados do funcion�rio: ");
		
		System.out.print("Nome: ");
		calculos.nome = sc.nextLine();
		
		System.out.print("Sal�rio Bruto: ");
		calculos.sal�rioBruto = sc.nextDouble();
		
		System.out.print("Valor do imposto em R$: ");
		calculos.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println( "Empregado: " + calculos);
		System.out.println();
		
		System.out.print("Digite o reajuste: ");
		double porcentagem = sc.nextDouble();
		calculos.aumentoDeSal�rio(porcentagem);
		
		System.out.println();
		System.out.println("Atualiza��o de sal�rio: " + calculos);
		
		
		

		sc.close();
	}

}
