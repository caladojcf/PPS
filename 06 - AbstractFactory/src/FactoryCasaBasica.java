import java.util.List;

public class FactoryCasaBasica implements FactoryCasa {

	@Override
	public Comodo criarComodo() {
		Comodo comodo = new Comodo();
		comodo.setPiso("Cerâmica");
		comodo.setParede("Divisória");
		comodo.setPorta("Compensado oca");
		comodo.setTinta("Lavável");
		comodo.setMetais("Ferro cromado");
		comodo.setLoucas("Básica");
		return comodo;
	}

	@Override
	public Casa criarCasa() {
		List<Comodo> comodos = null;
		Casa casa = new Casa();
		casa.setPerfil("Básica");
		casa.setComodos(comodos);
		return casa;
	}
}