public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc) {
        ksiazki = new Ksiazka[pojemnosc];
        liczbaKsiazek = 0;
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        ksiazki[liczbaKsiazek] = ksiazka;
        liczbaKsiazek++;
    }

    public void wypiszDostepneKsiazki() {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].czyDostepna()) {
                System.out.println(ksiazki[i].getTytul());
            }
        }
    }

    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equals(tytul)) {
                return ksiazki[i];
            }
        }
        return null;
    }

    public void wyswietlKsiazkePoTytule(String tytul) {
        Ksiazka k = znajdzKsiazkePoTytule(tytul);

        if (k != null) {
            k.wypiszinfo();
        } else {
            System.out.println("Nie znaleziono ksiazki");
        }
    }

    public int policzDostepneKsiazki() {
        int licznik = 0;

        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].czyDostepna()) {
                licznik++;
            }
        }

        return licznik;
    }
}