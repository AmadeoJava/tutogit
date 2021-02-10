package tuto_git;

import java.util.Observable;

public class Mod�le extends Observable {

	int compte;
	
	public Mod�le() {
		this.compte = 0;
	}

	public void incr�mente() {
		this.compte += 1;
		this.setChanged();
		this.notifyObservers(String.valueOf(this.compte));
	}
	
}
