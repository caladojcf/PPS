import java.util.List;

public class FactoryCasaConforto implements FactoryCasa {

	@Override
	public Comodo criarComodo() {
		Comodo comodo = new Comodo();
		comodo.setPiso("Cer�mica Especial");
		comodo.setParede("Alvenaria");
		comodo.setPorta("Madeira padr�o");
		comodo.setTinta("Acr�lica");
		comodo.setMetais("Alum�nio");
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
