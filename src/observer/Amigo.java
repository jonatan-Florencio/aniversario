package observer;

public class Amigo implements ChegadaAniversarianteObserver {
	
	@Override
	public void chegou(ChegadaAniversarianteEvent event) {
		System.out.println("apagar luz, apaga tudo");
		System.out.println("shhh quieto, silencio");
		System.out.println("surpresa, parabéns mano!!!!");
	
	}
}
