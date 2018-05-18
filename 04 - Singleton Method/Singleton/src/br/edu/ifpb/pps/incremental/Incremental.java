package br.edu.ifpb.pps.incremental;

public class Incremental {
	private static Incremental incremento;
	private static int count = 0;
	private int numero;
	
	public Incremental(){
		numero = ++count;
	}
	
	public static Incremental getIncremento(){
		if(incremento == null){
			incremento = new Incremental();
		}
		return incremento;
	}
	
	public String toString(){
		return "Incremental " + numero;
	}
}
