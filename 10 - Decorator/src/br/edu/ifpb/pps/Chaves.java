package br.edu.ifpb.pps;

public class Chaves extends NumeroUmDecorator {
	public Chaves(NumeroUm numeroum){
		super(numeroum);
		nome = "{" + numeroum.getNome() + "}";
	}
}
