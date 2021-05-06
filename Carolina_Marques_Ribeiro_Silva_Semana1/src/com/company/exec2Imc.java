package com.company;

import java.util.Scanner;

public class exec2Imc {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in); //entrada de dados

        System.out.println("Informe seu peso: "); // exibe o pedido
        float peso= entrada.nextFloat(); //coleta o peso

        System.out.println("Informe sua altura em metros: ");
        float altura = entrada.nextFloat();

        float imc = peso/(altura * altura);

        System.out.println("Seu IMC é:  " + imc);

        if(imc<18.5){
            System.out.println("Você está abaixo do peso");
        } else if(imc>18.5 && imc<=24.9){
            System.out.println("Você está no seu peso ideal");
        } else if(imc>24.9 && imc<=29.9){
            System.out.println("Você está com sobrepeso");
        } else if(imc>29.9 && imc<39.9){
            System.out.println("Você está com obesidade");
        } else {
            System.out.println("Você está com obesidade grave");
        }

    }
}
