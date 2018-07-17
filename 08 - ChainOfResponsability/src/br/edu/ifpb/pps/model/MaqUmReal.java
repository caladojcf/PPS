package br.edu.ifpb.pps.model;

public class MaqUmReal extends MaqChain {
	public MaqUmReal() {
		super(TipoMaq.maqUmReal);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Moeda de R$ 1,00 aceita pela máquina UmReal");
	}
}
