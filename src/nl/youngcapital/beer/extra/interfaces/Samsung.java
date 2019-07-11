package nl.youngcapital.beer.extra.interfaces;

public class Samsung implements Televisie {

    private boolean on = false;
    private int channel = 0;

    public void on() {

        this.on = true;
        System.out.println("Samsung on");
    }

    public void off() {

        this.on = false;
        System.out.println("Samsung off");

    }

    public void switchChannel(int newChannel) {
        System.out.println("Switching from channel: " + channel + " to channel: " + newChannel);
        this.channel = newChannel;
    }
}
