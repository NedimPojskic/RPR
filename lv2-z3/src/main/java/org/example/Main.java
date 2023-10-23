package org.example;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Unosite brojeve: ");

        String str;
        do {
            str = sc.nextLine();
            if(!Objects.equals(str, "stop")) {
                lista.add(Integer.valueOf(str));
            }
        } while (!Objects.equals(str, "stop"));

        Collections.sort(lista);

        System.out.println("min : " + lista.get(0));
        System.out.println("max : " + lista.get(lista.size() - 1));

        Integer suma = 0;
        for(Integer broj : lista) {
            suma += broj;
        }
        double mean = (double)suma /lista.size();

        System.out.println("mean : " + mean);

        double squaredDifferencesSum = lista.stream().mapToDouble(number -> Math.pow(number - mean, 2)).sum();
        double variance = squaredDifferencesSum / lista.size();

        double standardDeviation = Math.sqrt(variance);

        System.out.println("standardna devijacija : " + standardDeviation);

    }
}