package ba.unsa.etf.rpr;

public class Racun {
    private long brojRacuna;
    private Osoba korisnikRacuna;
    private double stanjeRacuna;
    private boolean odobrenjePrekoracenja;

    Racun(Long brojRacuna, Osoba osoba){
        this.brojRacuna = brojRacuna;
        this.korisnikRacuna = osoba;
    }

    public long getBrojRacuna() {
        return brojRacuna;
    }

    public Osoba getKorisnikRacuna() {
        return korisnikRacuna;
    }

    public double getStanjeRacuna() {
        return stanjeRacuna;
    }

    public boolean isOdobrenjePrekoracenja() {
        return odobrenjePrekoracenja;
    }

    private boolean provjeriOdobrenjePrekoracenja(double prekoracenje){
        if(this.odobrenjePrekoracenja){
            this.stanjeRacuna = prekoracenje;
            return true;
        } else return false;
    }

    public boolean izvrsiIsplatu(double isplata){
        if(isplata <= this.stanjeRacuna){
            this.stanjeRacuna -= isplata;
            return true;
        } else return false;

    }

    public boolean izvrsiUplatu(double uplata){
        if(uplata <= 0){
            return false;
        }
        this.stanjeRacuna += uplata;
        return true;
    }

    public void odboriPrekoracenje(double prekoracenje){
        this.odobrenjePrekoracenja = true;
        this.stanjeRacuna = prekoracenje;
    }
}
