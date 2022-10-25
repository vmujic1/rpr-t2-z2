package ba.unsa.etf.rpr;

public class Korisnik extends Osoba{
    private Racun racun;

    public Racun getRacun() {
        return racun;
    }
    public void dodajRacun(Racun novi){
        this.racun = novi;
    }

    Korisnik(String ime, String prezime){
        super(ime,prezime);
    }
}
