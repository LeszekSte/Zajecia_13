import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class zadanie_2 {


    public static void main(String[] args) {
        List<Integer> lista = wpiszDane();

        drukujListeOdTylu(lista);
        Integer suma = drukujParzyste(lista);
        Integer sum = iliczynNieparzystchIndeksow(lista);
        Integer max =  maxLista(lista);

    }

    private static Integer maxLista(List<Integer> lista) {
        if(lista == null){
            throw new NullPointerException ();
        }


        int max = Integer.MIN_VALUE;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > max) {
                max = lista.get(i);
            }
        }
        return max;
    }

    private static Integer iliczynNieparzystchIndeksow(List<Integer> lista) {
        int iloczyn = 1;
        for (int i = 1; i < lista.size(); i += 2) {
            iloczyn *= lista.get(i);
        }
        System.out.println("Ilosczyn nieparzystych indneksów " + iloczyn);
        return iloczyn;
    }

    private static void drukujListeOdTylu(List<Integer> lista) {
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.print(lista.get(i) + ", ");
        }
        System.out.println();
    }

    private static List<Integer> wpiszDane() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("lp - " + (i + 1));
            result.add(scanner.nextInt());
        }
        return result;
    }

    private static Integer drukujParzyste(List<Integer> lista) {
        int sum = 0;
        for (int i = 0; i < lista.size(); i += 2) {
            sum += lista.get(i);
        }
        return sum;
    }
}



