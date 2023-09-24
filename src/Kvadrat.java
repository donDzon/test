public class Kvadrat extends Oblik {
    private double a;

    public Kvadrat(double a) {
        this.a = a;
    }
    public double getA() {
        return this.a;
    }

    public double povrsina() {
        return this.a*this.a;
    }

    public double obim() {
        return this.a * 4;
    }

//    @Override
//    public String toString() {
//        return "Ovo je kvadrat sa obimom " + this.obim() + " i povrsinom " + this.povrsina();
//    }
}
