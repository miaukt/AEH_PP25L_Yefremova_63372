package pl.pp;

public class MaszynaRobocza extends Pojazd {
    private double przepracowaneGodziny;

    public MaszynaRobocza(String nrRejestracyjny, double przepracowaneGodziny) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.przepracowaneGodziny = przepracowaneGodziny;
    }

    @Override
    public void prowadz() {
        System.out.println("Używanie maszyny roboczej");
    }

    @Override
    public void zatankuj() {
        System.out.println("Tankowanie maszyny roboczej");
    }
}

