package br.edu.ifpb.pps.model;

public class MaqCinquenta extends MaqChain {
	public MaqCinquenta() {
		super(TipoMaq.maqCinquenta);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Moeda de R$ 0,50 aceita pela máquina Cinquenta");
	}
}
