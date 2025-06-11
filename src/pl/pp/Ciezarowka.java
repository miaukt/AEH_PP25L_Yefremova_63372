package pl.pp;

    public class Ciezarowka extends Pojazd {
        private double ladownosc;

        public Ciezarowka(String nrRejestracyjny, double ladownosc) {
            this.nrRejestracyjny = nrRejestracyjny;
            this.ladownosc = ladownosc;
        }

        @Override
        public void prowadz() {
            System.out.println("Prowadzenie ciężarówki");
        }

        @Override
        public void zatankuj() {
            System.out.println("Tankowanie ciężarówki");
        }
    }
