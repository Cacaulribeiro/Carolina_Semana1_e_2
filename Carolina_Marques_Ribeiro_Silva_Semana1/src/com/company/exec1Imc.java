package com.company;

import java.util.Scanner;

public class exec1Imc {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in); //entrada de dados

        System.out.println("Informe seu peso: "); // exibe o pedido
        float peso= entrada.nextFloat(); //colta 4

        System.out.println("Informe sua altura em metros: ");
        float altura = entrada.nextFloat();

        float imc = peso/(altura * altura);

        System.out.println("Seu IMC é:  " + imc);





    }

}
