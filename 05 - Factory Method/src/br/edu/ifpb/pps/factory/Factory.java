package br.edu.ifpb.pps.factory;

public class Factory {
	public Nome getNome(String texto){
		String[] textos;
		String nome;
		String sobrenome;
		Nome todo_texto = null;
		
		if(texto.contains(",")){
			textos = texto.split(",");
			nome = textos[1];
			sobrenome = textos[0];
			todo_texto = new Lastname(nome + " ", sobrenome);
		}
		if((texto.trim() != null) && (!texto.contains(","))){
			textos = texto.split(" ");
			nome = textos[0];
			sobrenome = textos[1];
			todo_texto = new Firstname(nome + " ", sobrenome);
		}
		
		return todo_texto;
	}
}
