package br.edu.ifpb.pps.factory;

public class Lastname extends Nome{

	public Lastname(String nome, String sobrenome) {
		super(nome, sobrenome);
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String toString(){
		return nome + sobrenome;
	}
}
