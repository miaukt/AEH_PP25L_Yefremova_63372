package pl.pp;

public class Person {
    public String forename;
    public String surname;
    public int age;
    public String adres;
    public int rok_urodzenia;

    public Person() {
    }

    public Person(String initForename, String initSurname, int initAge) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
    }


    public void hiToAll(){
        System.out.println("Nazywam się " + forename + " " + surname + ". " + "Mam " + age + " lat.");
    }

    public int growOld(int i){
        if (i == 18) {
            age = age + 10;
        } else {
            age = age + i;
        }
        if (age < 0) age = 0;
        return age;
    }
    public int beYounger(){
        age = age - 1;
        if (age < 0) age = 0;
        return age;
    }

    public String getName(){
        return forename;
    }

    public void setName(String nameToSet){
        forename = nameToSet;
    }
}