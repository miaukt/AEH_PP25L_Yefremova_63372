package pl.pp;

public abstract class Pojazd {
    protected String nrRejestracyjny;
    protected String numerVin;
    protected String kolor;
    protected double cena;
    protected double spalanie;
    protected double poziomPaliwa;
    protected double przebieg;

    public abstract void prowadz();
    public abstract void zatankuj();

    @Override
    public String toString() {
        return String.format("%s [Rejestracja: %s, VIN: %s, Kolor: %s, Cena: %.2f, Spalanie: %.2f, Paliwo: %.2f, Przebieg: %.2f]",
                this.getClass().getSimpleName(), nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
    }
}
