import java.util.List;

public class FactoryCasaBasica implements FactoryCasa {

	@Override
	public Comodo criarComodo() {
		Comodo comodo = new Comodo();
		comodo.setPiso("Cer�mica");
		comodo.setParede("Divis�ria");
		comodo.setPorta("Compensado oca");
		comodo.setTinta("Lav�vel");
		comodo.setMetais("Ferro cromado");
		comodo.setLoucas("B�sica");
		return comodo;
	}

	@Override
	public Casa criarCasa() {
		List<Comodo> comodos = null;
		Casa casa = new Casa();
		casa.setPerfil("B�sica");
		casa.setComodos(comodos);
		return casa;
	}
}