package zadanie_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main_1 {

    public static void main(String[] args) {
        List<String>lista = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyzazy - stop kińczy listę");

        String world = null;
        world = scanner.nextLine();
        while (!world.equals("stop")){
            lista.add(world);
            world = scanner.nextLine();
        }
        System.out.println(lista.size());
        System.out.println(lista.toString());

    }
}
