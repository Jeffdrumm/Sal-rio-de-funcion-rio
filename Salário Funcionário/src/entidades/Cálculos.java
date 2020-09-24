package entidades;

public class C�lculos {
	public String nome;
	public double sal�rioBruto;
	public double imposto;

	public double sal�rioL�quido() {
		return sal�rioBruto - imposto;
	}

	public void aumentoDeSal�rio(double porcentagem) {

		sal�rioBruto += sal�rioBruto * porcentagem / 100.00;
	}

	public String toString () {
 		
 		return nome
 				+
 				", R$" 
 				+
 				String.format("%.2f", sal�rioL�quido())
 				+" reais";
 	}
}
