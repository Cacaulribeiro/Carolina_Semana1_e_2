package com.company;

import java.util.ArrayList;
import java.util.List;

public class exec6ArrayList {

        public static void main(String[] args) {
            List coisas = new ArrayList<>();

            coisas.add("Chaves");
            coisas.add(24);
            coisas.add("Rua minas gerais");
            coisas.add(3.14);
            coisas.add("Bola");
            coisas.add("X");
            coisas.add(2021);
            coisas.add("Carolina");
            coisas.add(446804764); //não aceita valores muito grandes
            coisas.add("Vermelho");

            for (Object coisa : coisas) {
                System.out.println("A coisa da vez é: " + coisa);
            }
        }
}
