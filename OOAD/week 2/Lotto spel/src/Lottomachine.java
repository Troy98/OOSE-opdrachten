public class Lottomachine {

    public void voerTrekkingUit() {

        Scorebord scorebord = new Scorebord();

        GlazenBol glazenBol = new GlazenBol();

        for (int i = 0; i < 6; i++) {
            int bal = glazenBol.trekBal();
            scorebord.plaatsBal(bal);
        }

    }
}
