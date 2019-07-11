package nl.youngcapital.beer.statics;

public class App {

    public static void main(String[] args) {

        System.out.println(Dobbelsteen.kleur);

        Dobbelsteen steen = new Dobbelsteen();

        Dobbelsteen andereSteen = new Dobbelsteen();

        Dobbelsteen nogEenSteen = new Dobbelsteen();
        Dobbelsteen laatsteSteen = new Dobbelsteen();

        System.out.println(steen.worp);

        System.out.println(Dobbelsteen.aantalGecreerdeDobbelstenen);



    }
}


class Dobbelsteen {

    static int aantalGecreerdeDobbelstenen = 0;
    static String kleur = "rood";

    int worp;


    Dobbelsteen() {
        aantalGecreerdeDobbelstenen++;
    }

}
