public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbastron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbastron, boolean dostepna){
        this.tytul = tytul;
        this.autor = autor;
        this.liczbastron = liczbastron;
        this.dostepna = dostepna;
    }

    public void wypiszinfo(){
        System.out.println("Tytul: "+this.tytul);
        System.out.println("Autor: "+this.autor);
        System.out.println("liczba stron: "+this.liczbastron);
        System.out.println("dostepna: "+this.dostepna);
    }

    public void wyporzycz(){
        if(dostepna) {
            dostepna = false;
            System.out.println("Ksiazka: "+ tytul +" zostala wyporzycona");
        }else{
            System.out.println("Ksiazka: "+ tytul +"nie jest dostepna");

        }

    }

    public void zwroc(){
        if (!dostepna) {
            dostepna = true;
            System.out.println("Ksiazka: "+ tytul +" zostala zwrucona");

        }else{
            System.out.println("Ksiazka: "+ tytul +" jest dostepna");

        }

    }
    public String getTytul() {
        return tytul;
    }

    public boolean czyDostepna() {
        return dostepna;
    }
}
