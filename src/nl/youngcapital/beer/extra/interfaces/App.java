package nl.youngcapital.beer.extra.interfaces;

public class App {

    public static void main(String[] args) {
        Televisie televisieVanKahKih = new Samsung();

        televisieVanKahKih.on();
        televisieVanKahKih.switchChannel(3);
        televisieVanKahKih.off();
    }
}
