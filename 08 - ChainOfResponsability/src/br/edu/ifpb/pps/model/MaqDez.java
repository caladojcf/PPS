package br.edu.ifpb.pps.model;

public class MaqDez extends MaqChain {
	public MaqDez() {
		super(TipoMaq.maqDez);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Moeda de R$ 0,10 aceita pela máquina Dez");
	}
}
