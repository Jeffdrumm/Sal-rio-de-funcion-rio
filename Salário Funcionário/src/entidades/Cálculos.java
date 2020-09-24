package entidades;

public class Cálculos {
	public String nome;
	public double salárioBruto;
	public double imposto;

	public double salárioLíquido() {
		return salárioBruto - imposto;
	}

	public void aumentoDeSalário(double porcentagem) {

		salárioBruto += salárioBruto * porcentagem / 100.00;
	}

	public String toString () {
 		
 		return nome
 				+
 				", R$" 
 				+
 				String.format("%.2f", salárioLíquido())
 				+" reais";
 	}
}
