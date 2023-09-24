// Sta je klasa? Kalup za objekte
// Sta je konstruktor i cemu sluzi (sta radi u memoriji)
// Sta je objekat? Instanca klase

// Sta je enkapsulacija i cemu sluzi?

// Ste je nasledjivanje?
// Sta je interface?

public class Krug extends Oblik{
    // Properti poluprecnik
    private double poluprecnik;

    // Konstruktor
    public Krug(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    // Metoda za izracunavanje obima
    public double obim() {
        return 2 * Math.PI * poluprecnik;
    }

    // Metoda za izracunavanje povrsine
    @Override
    public double povrsina() {
        return Math.PI * poluprecnik * poluprecnik;
    }

    @Override
    public boolean equals(Object obj) {
        Krug ulazniKrug = (Krug) obj;
        return this.poluprecnik == ulazniKrug.poluprecnik;
    }

    //    @Override
//    public String toString() {
//        return "Ovo je krug sa obimom " + this.obim() + " i povrsinom " + this.povrsina();
//    }
}
