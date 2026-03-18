

public class Main {
    public static void main (String[] args){
        Ksiazka harrypotter = new Ksiazka("Harry","Rowling", 300, true);
        Ksiazka blueberry = new Ksiazka("berry", "blue", 150, false);
        Ksiazka lemonislemon = new Ksiazka("noMoreLemon", "lemonDisguise", 75, true);


        harrypotter.wypiszinfo();
        blueberry.wyporzycz();
        blueberry.wypiszinfo();
        lemonislemon.wypiszinfo();
        lemonislemon.wyporzycz();
        lemonislemon.wypiszinfo();
        lemonislemon.zwroc();
        lemonislemon.wypiszinfo();

    }
}
