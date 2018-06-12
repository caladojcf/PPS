import java.util.List;

public class Casa {
	List<Comodo> comodos;
	String perfil;

	public Casa() {
	}

	public List<Comodo> getComodos() {
		return comodos;
	}

	public void setComodos(List<Comodo> comodos) {
		this.comodos = comodos;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	@Override
	public String toString() {

		return (this.getPerfil());
	}

	public void addComodo(Comodo comodo) {
		this.comodos.add(comodo);
	}

}
