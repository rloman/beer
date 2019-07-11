package nl.youngcapital.beer.wrappers;

import javax.xml.bind.SchemaOutputResolver;

public class App {

    public static void main(String[] args) {


        System.out.println(Boolean.valueOf("true"));
        System.out.println(Boolean.valueOf(true));


        System.out.println(Boolean.valueOf("TruE"));

        System.out.println(Boolean.valueOf("jan"));

        System.out.println(Boolean.valueOf("ONWAAR"));

        System.out.println(Boolean.valueOf("FaLse"));


        char lettertje = Character.valueOf('C');

        System.out.println(Integer.toBinaryString(173));

        System.out.println(Integer.toHexString(173));

    }
}
