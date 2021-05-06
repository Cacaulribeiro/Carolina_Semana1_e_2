package com.company;

import java.util.Scanner;

public class exec3Compra {
    public static void main (String[] args) {
        Scanner leitor= new Scanner(System.in);

        System.out.print("-------Por favor digite o código do produto:----------- "+
                         "\n PRODUTO               VALOR       CÓDIGO"+
                         "\n Cachorro-quente:------1,20--------100"+
                         "\n Bauru:----------------1,30--------101"+
                         "\n Bauru com ovo:--------1,50--------102"+
                         "\n Hamburguer:-----------1,20--------103"+
                         "\n Cheeseburguer :-------1,30--------104"+
                         "\n Refrigerante :--------1,00--------105"+
                          "\n insira o código aqui: "      );

        int ncodigo = leitor.nextInt();

        System.out.print("Quantos item o cliente quer levar?  ");
        int quantidade = leitor.nextInt();

        double precoFinal;

        switch (ncodigo) {
            case 100 :
                precoFinal= quantidade * 1.20;
                System.out.println("Você comprou "+ quantidade+" Cachorro-quente e o preço total da compra foi de "+ precoFinal);
                break;
            case 101 :
                precoFinal= quantidade * 1.30;
                System.out.println("Você comprou "+ quantidade+" Bauru simples e o preço total da compra foi de "+ precoFinal);
                break;
            case 102:
                precoFinal= quantidade * 1.50;
                System.out.println("Você comprou "+ quantidade+" Bauru com ovo e o preço total da compra foi de "+ precoFinal);
                break;
            case 103 :
                precoFinal= quantidade * 1.20;
                System.out.println("Você comprou "+ quantidade+" Hamburguer e o preço total da compra foi de "+ precoFinal);
                break;
            case 104 :
                precoFinal= quantidade * 1.30;
                System.out.println("Você comprou "+ quantidade+" Cheeeseburguer  e o preço total da compra foi de "+ precoFinal);
                break;
            case 105 :
                precoFinal= quantidade * 1.00;
                System.out.println("Você comprou "+ quantidade+" Refrigerante e o preço total da compra foi de "+ precoFinal);
                break;
        }

    }
}
