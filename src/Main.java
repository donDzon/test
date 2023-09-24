import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       //napravite klasu krug koja kao properti ima poluprecnik r i koja ima dve metode koje vracaju obim i povrsinu tog kruga
        ArrayList<Krug> myList = new ArrayList<Krug>();
        myList.add(new Krug(5));
        myList.add(new Krug(10));
        myList.add(new Krug(15));
        myList.add(new Krug(20));

        for(Krug k: myList) {
            System.out.println(k);
//            System.out.println("Obim: " + k.obim());
//            System.out.println("Povrsina: " + k.povrsinu());
        }
        System.out.println();
        for(int i = 0; i < myList.size(); i++) {
            System.out.println("Obim: " + myList.get(i).obim());
            System.out.println("Povrsina: " + myList.get(i).povrsina());
        }
    }
}