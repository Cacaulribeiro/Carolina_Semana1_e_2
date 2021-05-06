package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exec8ExcluirNome {
    public static void main(String[] args) {
        List nomes=new ArrayList<>();
        Scanner entrada= new Scanner(System.in);
        int indice = 0;

        nomes.add("Taina");
        nomes.add("Pituzinho");
        nomes.add("Salem");
        nomes.add("Belinha");
        nomes.add("Neide");

        System.out.println("Qual nome voce quer remover?"+
                "\n1-Taina"+
                "\n2-Pituzinho"+
                "\n3-Salem"+
                "\n4-Belinha"+
                "\n5-Neide");
        indice=entrada.nextInt();

        switch (indice) {
            case 1:
                nomes.remove("Taina");
                break;

            case 2:
                nomes.remove("Pituzinho");
                break;
            case 3:
                nomes.remove("Salem");
                break;
            case 4:
                nomes.remove("Belinha");
                break;
            case 5:
                nomes.remove("Neide");
                break;
        }
        for(Object nu:nomes){
            System.out.println( nu);
        }


    }

}
