package src;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        Kvadrat kvadrat = new Kvadrat(5);
        Krug krug = new Krug(5);

        ArrayList<Oblik> oblici = new ArrayList<Oblik>();
        oblici.add(kvadrat);
        oblici.add(krug);

        for(Oblik o : oblici) {
            System.out.println(o.obim());
            System.out.println(o.povrsina());
            System.out.println();
        }


        ArrayList<Object> objecs = new ArrayList<Object>();
        objecs.add(new A());
        objecs.add(new B());
        objecs.add(new Krug(5));
        objecs.add(new Kvadrat(5));

        for(Object o : objecs) {
            System.out.println(o.toString());
            System.out.println();
        }


        Krug a = new Krug(5);
        Krug b = new Krug(5);

        if(a.equals(b)) {
            System.out.println("Isto");
            System.out.println(a);
            System.out.println(b);
        } else {
            System.out.println("Nije");
            System.out.println(a);
            System.out.println(b);
        }




    }
}