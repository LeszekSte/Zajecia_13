package zadanie_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main_3 {

    static int iloscLiczb = 0;

    public static void main(String[] args) throws IOException {

        List<Double> lista = wczytajDane();
        System.out.println("ilość Liczb - " + iloscLiczb);
        outLine(lista);



    }

    private static void outLine(List<Double> lista) {
        System.out.println(lista);
    }

    private static List<Double> wczytajDane() throws IOException {
        List<Double> result = new ArrayList<>();

        FileReader fileReader= new FileReader("liczby.csv");
        BufferedReader bfr= new BufferedReader(fileReader);

        String line= null;
        double aa = 2.3456;



        while((line= bfr.readLine()) != null) {
            result.add(Double.valueOf(line));
            iloscLiczb++;


        }
        bfr.close();
        return result;
    }





}
