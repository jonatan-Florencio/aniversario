package observer;

public class AniversarioSurpresa {
	
	public static void main(String[] args) {
		Amigo amigo = new Amigo();
		Olheiro olheiro = new Olheiro();
		
		olheiro.addChegadaAniversarianteObserver(amigo);
		
		olheiro.start();
	}

}
