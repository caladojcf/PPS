package br.edu.ifpb.pps.model;

public class Teste {
public static void main(String[] args) {
		
		MaqChain maquinas = new MaqUm();
		maquinas.setNext(new MaqCinco());
		maquinas.setNext(new MaqVinteCinco());
		maquinas.setNext(new MaqCinquenta());
		maquinas.setNext(new MaqUmReal());

		try {
			maquinas.efetuarPagamento(TipoMaq.maqUm);
			maquinas.efetuarPagamento(TipoMaq.maqCinco);
			maquinas.efetuarPagamento(TipoMaq.maqDez);
			maquinas.efetuarPagamento(TipoMaq.maqVinteCinco);
			maquinas.efetuarPagamento(TipoMaq.maqCinquenta);
			maquinas.efetuarPagamento(TipoMaq.maqUmReal);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
