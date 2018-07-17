package br.edu.ifpb.pps.model;

public class MaqVinteCinco extends MaqChain {
	public MaqVinteCinco() {
		super(TipoMaq.maqVinteCinco);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Moeda de R$ 0,25 aceita pela máquna VinteCinco");
	}
}
