package br.edu.ifpb.pps;

public abstract class NumeroUmDecorator extends NumeroUm {
	NumeroUm numeroum;
	
	public NumeroUmDecorator(NumeroUm numeroum){
		numeroum = numeroum;
	}
	
}
