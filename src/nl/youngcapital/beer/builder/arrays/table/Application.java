package nl.youngcapital.beer.builder.arrays.table;

public class Application {

    public static void main(String[] args) {

        // tables from 0..to 10 (meaning we will skip the zero index)
        int[][] tables = new int[11][11];

        // fill the table with the product of i en j
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                tables[i][j] = i * j;
            }
        }

        // print the tables from 1 to 10
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {

                String result = String.format(" %2dX%1d=%2d ", i, j, tables[i][j]);
                System.out.print(result + "\t");
            }
            System.out.println();
        }
    }

}
