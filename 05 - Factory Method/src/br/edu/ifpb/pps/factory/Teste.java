package br.edu.ifpb.pps.factory;

public class Teste {

	public static void main(String[] args) {
		Factory factory = new Factory();
		
		String texto = "José Calado";
		Nome nome = factory.getNome(texto);
		System.out.println(nome + " - " + nome.getClass().getSimpleName());
		
		texto = "Bond,James";
		nome = factory.getNome(texto);
		System.out.println(nome + " - " + nome.getClass().getSimpleName());
	}

}
