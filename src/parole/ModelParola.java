package parole;

import java.util.ArrayList;
import java.util.Collections;

public class ModelParola {
	private ArrayList<String>x= new ArrayList();

/**
 * Metodo che aggiunge la parola e mette in ordine tutte le parole inserite
 * @param p
 */
	public void addParola(String p) {
		x.add(p);
		Collections.sort(x);
	}
	/**
	 * Sis
	 * @return
	 */
	public ArrayList<String>getElenco(){
		Collections.sort(x);
		return x;
	}
	public void reset() {
		x.clear();
	}
	public void cancellaParola(String p) {
		for(int i = 0;i<x.size();i++) {
			if(x.get(i).equals(p)) {
				x.remove(x.get(i));
			}
		}
		Collections.sort(x);
	}
}
