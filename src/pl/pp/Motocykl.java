package pl.pp;

public class Motocykl extends Pojazd {
    private boolean posiadaDostawke;

    public Motocykl(String nrRejestracyjny, boolean posiadaDostawke) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.posiadaDostawke = posiadaDostawke;
    }

    @Override
    public void prowadz() {
        System.out.println("Prowadzenie motocykla");
    }

    @Override
    public void zatankuj() {
        System.out.println("Tankowanie motocykla");
    }
}
