package br.edu.ifpb.pps.model;

public class MaqUm extends MaqChain {
	public MaqUm() {
		super(TipoMaq.maqUm);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Moeda de R$ 0,01 aceita pela m�quina Um");
	}
}
