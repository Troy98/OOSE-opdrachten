import java.util.ArrayList;

public class Spel {
	private ArrayList<Karakter> karakters = new ArrayList<Karakter>();
	private Spelbord bord = new Spelbord();
	
	public void meldAan (String naamKarakter) {
		Karakter k = new Karakter(naamKarakter);
		karakters.add(k);
		bord.plaatsOpVrijVakje(k);
	}

	public Karakter getKarakter (String naamKarakter) {
		for (Karakter k : karakters) {
			if (naamKarakter.equals (k.getNaam())) {
				return k;
			}
		};
		return null;
	}

	public void teleporteer(String naamKarakter, int i) {
		// TO DO: implement		
	}
}
