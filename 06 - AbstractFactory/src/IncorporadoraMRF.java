
public class IncorporadoraMRF {

	public static void main(String[] args) {

		System.out.println("Criando f�brica de casas b�sicas");
		FactoryCasa fabrica = new FactoryCasaBasica();
		Casa casa = fabrica.criarCasa();
		System.out.println("Criado nova casa do tipo " + casa);
		Comodo comodo = fabrica.criarComodo();
		System.out.println("Criado novo c�modo de uma casa " + casa
				+ ", com os atributos :\n" + comodo);

		System.out.println("\n\nCriando nova f�brica de casas do tipo Conforto");
		fabrica = new FactoryCasaConforto();
		casa = fabrica.criarCasa();
		System.out.println("A f�brica criou uma nova casa de tipo " + casa);
		comodo = fabrica.criarComodo();
		System.out.println("A f�brica criou um novo c�modo de uma casa " + casa
				+ ", com os seguintes atributos :\n" + comodo);

		System.out.println("\n\nCriando uma nova f�brica de casas de Luxo");
		fabrica = new FactoryCasaLuxo();
		casa = fabrica.criarCasa();
		System.out.println("A f�brica criou uma nova casa do tipo " + casa);
		comodo = fabrica.criarComodo();
		System.out.println("A f�brica criou um novo c�modo de uma casa " + casa
				+ ", com os seguintes atributos :\n" + comodo);
	}
}
