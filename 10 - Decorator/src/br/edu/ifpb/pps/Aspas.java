package br.edu.ifpb.pps;

public class Aspas extends NumeroUmDecorator {
	public Aspas(NumeroUm numeroum){
		super(numeroum);
		nome = "'" + numeroum.getNome() + "'";
	}
}
