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

	public void teleporteer(String naamKarakter, int vakNr) {
		Karakter k = getKarakter(naamKarakter);
		bord.teleporteer(k, vakNr);
		k.verminderEnergie(20);
	}


	public void wisselVakje(String karakterNaam, int i) {
		Karakter k = getKarakter(karakterNaam);
		bord.wisselVakje(k, i);
		k.verminderEnergie(10);
	}
}
