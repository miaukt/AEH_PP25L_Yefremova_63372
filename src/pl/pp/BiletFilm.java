package pl.pp;

public class BiletFilm extends Bilet implements TypMiejsca {
    private boolean vip;

    public BiletFilm(String tytul, String miejsce, double cena, boolean vip) {
        super(tytul, miejsce, cena);
        this.vip = vip;
    }

    @Override
    public void rezerwuj() {
        System.out.println("Zarezerwowano bilet na film: " + tytulWydarzenia);
    }

    @Override
    public String getTypMiejsca() {
        return vip ? "VIP" : "SIEDZĄCE";
    }
}
