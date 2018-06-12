
public class Comodo {
	String tipo;
	String piso;
	String parede;
	String porta;
	String tinta;
	String metais;
	String loucas;
	int qtd_paredes;
	int qtd_portas;
	int qtd_metais;
	int qtd_loucas;

	public Comodo() {
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getParede() {
		return parede;
	}

	public void setParede(String parede) {
		this.parede = parede;
	}

	public String getPorta() {
		return porta;
	}

	public void setPorta(String porta) {
		this.porta = porta;
	}

	public String getTinta() {
		return tinta;
	}

	public void setTinta(String tinta) {
		this.tinta = tinta;
	}

	public String getMetais() {
		return metais;
	}

	public void setMetais(String metais) {
		this.metais = metais;
	}

	public String getLoucas() {
		return loucas;
	}

	public void setLoucas(String loucas) {
		this.loucas = loucas;
	}

	public int getQtd_paredes() {
		return qtd_paredes;
	}

	public void setQtd_paredes(int qtd_paredes) {
		this.qtd_paredes = qtd_paredes;
	}

	public int getQtd_portas() {
		return qtd_portas;
	}

	public void setQtd_portas(int qtd_portas) {
		this.qtd_portas = qtd_portas;
	}

	public int getQtd_metais() {
		return qtd_metais;
	}

	public void setQtd_metais(int qtd_metais) {
		this.qtd_metais = qtd_metais;
	}

	public int getQtd_loucas() {
		return qtd_loucas;
	}

	public void setQtd_loucas(int qtd_loucas) {
		this.qtd_loucas = qtd_loucas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("\n Piso :" + piso + "\n Parede :" + parede + "\n Porta  :" + porta + "\n Tinta  :" + tinta
				+ "\n Metais :" + metais + "\n Loucas :" + loucas);
	}
}
