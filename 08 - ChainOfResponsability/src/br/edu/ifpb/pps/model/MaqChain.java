package br.edu.ifpb.pps.model;

public abstract class MaqChain {
	protected MaqChain next;
	protected TipoMaq identificadorDaMaquina;

	public MaqChain(TipoMaq maquina001) {
		next = null;
		identificadorDaMaquina = maquina001;
	}

	public void setNext(MaqChain forma) {
		if (next == null) {
			next = forma;
		} else {
			next.setNext(forma);
		}
	}

	public void efetuarPagamento(TipoMaq id) throws Exception {
		if (podeEfetuarPagamento(id)) {
			efetuaPagamento();
		} else {
			if (next == null) {
				throw new Exception("Tipo de moeda não aceito");
			}
			next.efetuarPagamento(id);
		}
	}

	private boolean podeEfetuarPagamento(TipoMaq id) {
		if (identificadorDaMaquina == id) {
			return true;
		}
		return false;
	}

	protected abstract void efetuaPagamento();
}
