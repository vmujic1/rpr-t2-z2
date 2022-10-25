package ba.unsa.etf.rpr;

import java.util.List;

public class Banka {
    private List<Korisnik> korisnici;

    public List<Korisnik> getKorisnici() {
        return korisnici;
    }

    public List<Uposlenik> getUposlenici() {
        return uposlenici;
    }

    private List<Uposlenik> uposlenici;


    public Banka(){
    }

    public Uposlenik kreirajNovogUposlenika(String ime, String prezime){
        Uposlenik u1 = new Uposlenik(ime,prezime);
        uposlenici.add(u1);
        return u1;
    }

    public Korisnik kreirajNovogKorisnika(String ime, String prezime){
        Korisnik k1 = new Korisnik(ime,prezime);
        korisnici.add(k1);
        return  k1;
    }

    public Racun kreirajRacunZaKorisnika(Korisnik k1){
        k1.dodajRacun(k1.getRacun());

        return k1.getRacun();
    }
}
