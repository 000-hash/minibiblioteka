public class czytelnik {
    private String imie;
    private String nazwisko;
    private int numerKarty;
    private int liczbaWypozyczen;

    public czytelnik(String imie, String nazwisko, int numerKarty) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = 0;
    }
    public void wyswietlDane(){
        System.out.println("imie : "+imie);
        System.out.println("nazwisko : "+nazwisko);
        System.out.println("numerKarty : "+numerKarty);
        System.out.println("liczbaWypozyczen : "+liczbaWypozyczen);

        

    }
    public void riseLiczbaWypozyczen(){
        liczbaWypozyczen++;
    }
    public void zmiejszLiczbaWypozyczen(){
        if(liczbaWypozyczen > 0){
            liczbaWypozyczen--;
        }
    }

}
