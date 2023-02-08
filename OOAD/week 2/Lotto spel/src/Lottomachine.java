public class Lottomachine {

    private GlazenBol bol;
    private Scorebord scorebord;

    public void voerTrekkingUit() {
        scorebord.maakLeeg();
        bol.verzamelAlleBallen();
        for (int i = 0; i < 6; i++) {
            Lottobal bal = bol.schepBal();
            scorebord.plaatsBal(bal);
        }
        Lottobal bonusbal = bol.schepBal();
        scorebord.plaatsBonusBal(bonusbal);
        scorebord.sorteerBallen();

    }
}
