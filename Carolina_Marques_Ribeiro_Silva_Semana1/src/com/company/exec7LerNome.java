package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exec7LerNome {
    public static void main(String[] args) {
        List nomes = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Insira um nome: ");
            String nome = entrada.nextLine();
            nomes.add(nome);
        }

        System.out.println("\n--------Lista de nomes ao contrário-----------");
        Collections.reverse(nomes);
        for (Object nu : nomes) {
            System.out.println(nu);
        }
    }
}
