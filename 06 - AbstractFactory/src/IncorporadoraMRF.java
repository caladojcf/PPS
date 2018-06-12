
public class IncorporadoraMRF {

	public static void main(String[] args) {

		System.out.println("Criando fábrica de casas básicas");
		FactoryCasa fabrica = new FactoryCasaBasica();
		Casa casa = fabrica.criarCasa();
		System.out.println("Criado nova casa do tipo " + casa);
		Comodo comodo = fabrica.criarComodo();
		System.out.println("Criado novo cômodo de uma casa " + casa
				+ ", com os atributos :\n" + comodo);

		System.out.println("\n\nCriando nova fábrica de casas do tipo Conforto");
		fabrica = new FactoryCasaConforto();
		casa = fabrica.criarCasa();
		System.out.println("A fábrica criou uma nova casa de tipo " + casa);
		comodo = fabrica.criarComodo();
		System.out.println("A fábrica criou um novo cômodo de uma casa " + casa
				+ ", com os seguintes atributos :\n" + comodo);

		System.out.println("\n\nCriando uma nova fábrica de casas de Luxo");
		fabrica = new FactoryCasaLuxo();
		casa = fabrica.criarCasa();
		System.out.println("A fábrica criou uma nova casa do tipo " + casa);
		comodo = fabrica.criarComodo();
		System.out.println("A fábrica criou um novo cômodo de uma casa " + casa
				+ ", com os seguintes atributos :\n" + comodo);
	}
}
