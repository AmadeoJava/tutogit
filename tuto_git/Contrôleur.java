package tuto_git;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contr�leur implements ActionListener {

	Mod�le refModl;
	
	public Contr�leur(Mod�le m) {
		this.refModl = m;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		refModl.incr�mente();
	}

	
}
