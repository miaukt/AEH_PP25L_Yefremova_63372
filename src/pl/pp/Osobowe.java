package pl.pp;

public class Osobowe extends Pojazd {
    private int liczbaDrzwi;

    public Osobowe(String nrRejestracyjny, String kolor, int liczbaDrzwi) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.kolor = kolor;
        this.liczbaDrzwi = liczbaDrzwi;
    }

    @Override
    public void prowadz() {
        System.out.println("Prowadzenie samochodu osobowego");
    }

    @Override
    public void zatankuj() {
        System.out.println("Tankowanie samochodu osobowego");
    }
}

