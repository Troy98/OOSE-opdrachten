import java.util.ArrayList;
import java.util.Random;

public class Spelbord {
	public static final int MAAT = 10;
	private ArrayList<Vakje> vakjes = new ArrayList<Vakje>();

	public Spelbord() {
		for (int i=0; i<MAAT*MAAT; i++) {
			vakjes.add(new Vakje (i));
		}
	}
	
	public void plaatsOpVrijVakje(Karakter k) {
		Vakje v = kiesVrijVakje();
		k.setVakje(v);
	}
	
	private Vakje kiesVrijVakje() {
		Random rand = new Random();
		Vakje v;
		do {
			int vaknr = rand.nextInt(Spelbord.MAAT*Spelbord.MAAT);
			v = vakjes.get(vaknr);
		} while (!v.isLeeg());
		return v;
	}

	void wisselVakje(Karakter naamKarakter, int doelVak){

		Karakter doelKarakter = getVakje(doelVak).getKarakter();

		doelKarakter.setVakje(naamKarakter.getVakje());

		Vakje doelVakje = getVakje(doelVak);
		naamKarakter.setVakje(doelVakje);

	}

	public Vakje getVakje(int i) {
		return vakjes.get(i);
	}

    public void teleporteer(Karakter k, int vakNr) {
		Vakje v = k.getVakje();
		v.maakLeeg();

		Vakje nieuwVakje = this.getVakje(vakNr);
		k.setVakje(nieuwVakje);
    }
}
