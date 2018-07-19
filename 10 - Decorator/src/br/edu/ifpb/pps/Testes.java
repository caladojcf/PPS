package br.edu.ifpb.pps;

public class Testes {
	public static void main(String[] args){
		NumeroUm numeroum = new NumeroUm();
		numeroum.imprimir();
		
		numeroum = new Aspas(numeroum);
		numeroum.imprimir();
		
		numeroum = new Chaves(numeroum);
		numeroum.imprimir();
		
		numeroum = new Parenteses(numeroum);
		numeroum.imprimir();
	}
}
