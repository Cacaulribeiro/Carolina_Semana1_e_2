package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class exec9MaoirNumAlea {
    public static void main(String[] args) {
        List<Integer> numeros=new ArrayList<>();

        for(int i=0;i<10;i++){
            int numAleatorio = new Random().nextInt(91)+10 ;
            System.out.println("Número: " + numAleatorio);
            numeros.add(numAleatorio);
        }

        int maiorNum= Collections.max(numeros);
        System.out.println("O maior número gerado de forma aleatória pelo computaor é: "+maiorNum);

    }
}
