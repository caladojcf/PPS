public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baralho baralho = new Baralho();
		
		Jogador jogador1 = new Jogador("Maria", 0);		
		Jogador jogador2 = new Jogador("Joao", 0);
				
		algoritmoDistribuido alg = new RetiraCartaAleatorio();
				
		for(int i = 0; i <= 10; i++) {
			alg.retiraCarta(jogador1, jogador2, baralho);
			baralho.embaralhar(baralho);			
		}
		
		if (jogador1.getPontos() > jogador2.getPontos()) {
			alg.retiraCarta(jogador1, jogador2, baralho);
			baralho.embaralhar(baralho);
//			System.out.println("Vencedor: " + jogador1.getNome());
		}
		else if(jogador1.getPontos() < jogador2.getPontos()){
			alg.retiraCarta(jogador1, jogador2, baralho);
			baralho.embaralhar(baralho);
//			System.out.println("Vencedor: " + jogador2.getNome());
		}
		else {
			alg.retiraCarta(jogador1, jogador2, baralho);
			baralho.embaralhar(baralho);
//			System.out.println("Empate");
		}
		
		System.out.println();
		System.out.println("Jogador1: " + jogador1.toString());
		System.out.println("Jogador2: " + jogador2.toString());
	}
}