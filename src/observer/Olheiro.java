package observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Olheiro extends Thread{

	private List<ChegadaAniversarianteObserver> observers = new ArrayList<ChegadaAniversarianteObserver>();
	
	public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer) {
		this.observers.add(observer);
	}
	
	@Override
	public void run() {
		Scanner teclado = new Scanner(System.in);
		
		while(true) {
			int valor = teclado.nextInt();
			
			if(valor == 1) {
				ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());
				
				
				for(ChegadaAniversarianteObserver observer: this.observers) {
					observer.chegou(event);
				}
				
				
			} else {
				System.out.println("alarme falso, é nadaa...");
			}
		}
	}
}
