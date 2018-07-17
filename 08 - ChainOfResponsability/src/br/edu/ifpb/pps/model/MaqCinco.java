package br.edu.ifpb.pps.model;

public class MaqCinco extends MaqChain {
	public MaqCinco() {
		super(TipoMaq.maqCinco);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Moeda de R$ 0,05 aceita pela máquina Cinco");
	}
}
