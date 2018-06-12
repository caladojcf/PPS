import java.util.List;

public class FactoryCasaConforto implements FactoryCasa {

	@Override
	public Comodo criarComodo() {
		Comodo comodo = new Comodo();
		comodo.setPiso("Cerâmica Especial");
		comodo.setParede("Alvenaria");
		comodo.setPorta("Madeira padrão");
		comodo.setTinta("Acrílica");
		comodo.setMetais("Alumínio");
		comodo.setLoucas("Elizabeth");
		return comodo;
	}

	@Override
	public Casa criarCasa() {
		List<Comodo> comodos = null;
		Casa casa = new Casa();
		casa.setPerfil("Conforto");
		casa.setComodos(comodos);
		return casa;
	}
}
