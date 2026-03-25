

public class Main {
    public static void main (String[] args){
        Ksiazka harrypotter = new Ksiazka("Harry","Rowling", 300, true);
        Ksiazka blueberry = new Ksiazka("berry", "blue", 150, false);
        Ksiazka lemonislemon = new Ksiazka("noMoreLemon", "lemonDisguise", 75, true);


//        harrypotter.wypiszinfo();
//        blueberry.wyporzycz();
//        blueberry.wypiszinfo();
//        lemonislemon.wypiszinfo();
//        lemonislemon.wyporzycz();
//        lemonislemon.wypiszinfo();
//        lemonislemon.zwroc();
//        lemonislemon.wypiszinfo();



        czytelnik carrot = new czytelnik("carrot","rasberry",04);
        czytelnik soup = new czytelnik("badSoup","goodSoup",05);


//        carrot.riseLiczbaWypozyczen();
//        carrot.wyswietlDane();
//        soup.riseLiczbaWypozyczen();
//        soup.riseLiczbaWypozyczen();
//        soup.riseLiczbaWypozyczen();
//        soup.wyswietlDane();

        Biblioteka biblioteka = new Biblioteka(10);
        biblioteka.dodajKsiazke(harrypotter);
        biblioteka.dodajKsiazke(blueberry);
        biblioteka.dodajKsiazke(lemonislemon);
        biblioteka.wypiszDostepneKsiazki();
        System.out.println("Dostepe ksiazki: " +biblioteka.policzDostepneKsiazki());

        biblioteka.wyswietlKsiazkePoTytule("Harry");



    }
}
