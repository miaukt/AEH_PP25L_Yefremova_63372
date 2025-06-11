package pl.pp;
public class MojaCzternastaAplikacja {
        public static void main(String[] args) {
            Osobowe osobowy = new Osobowe("AB1234", "Czarny", 4);
            osobowy.spalanie = 6.5;
            osobowy.poziomPaliwa = 40;

            Ciezarowka ciezarowka = new Ciezarowka("CD5678", 10000);
            ciezarowka.spalanie = 18.0;
            ciezarowka.poziomPaliwa = 120;

            TypPaliwa benzyna = new Benzyna();
            TypPaliwa diesel = new Diesel();

            System.out.println(osobowy);
            osobowy.prowadz();
            osobowy.zatankuj();
            System.out.println("Typ paliwa: " + benzyna.getTypPaliwa());

            System.out.println();

            System.out.println(ciezarowka);
            ciezarowka.prowadz();
            ciezarowka.zatankuj();
            System.out.println("Typ paliwa: " + diesel.getTypPaliwa());
        }
    }
