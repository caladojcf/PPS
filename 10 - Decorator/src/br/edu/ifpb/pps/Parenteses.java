package br.edu.ifpb.pps;

public class Parenteses extends NumeroUmDecorator {
	public Parenteses(NumeroUm numeroum){
		super(numeroum);
		nome = "(" + numeroum.getNome() + ")";
	}
}
