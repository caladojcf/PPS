import java.util.List;

public class FactoryCasaLuxo implements FactoryCasa {

	@Override
	public Comodo criarComodo() {
		Comodo comodo = new Comodo();
		comodo.setPiso("Porcelanato");
		comodo.setParede("Alvenaria de alto acabamento");
		comodo.setPorta("Madeira Especial");
		comodo.setTinta("Acrílica de alto valor");
		comodo.setMetais("Inox");
		comodo.setLoucas("DECA luxo");
		return comodo;
	}

	@Override
	public Casa criarCasa() {
		List<Comodo> comodos = null;
		Casa casa = new Casa();
		casa.setPerfil("Luxo");
		casa.setComodos(comodos);
		return casa;
	}
}
