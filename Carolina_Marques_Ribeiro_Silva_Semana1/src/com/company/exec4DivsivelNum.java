package com.company;

import java.util.Scanner;

public class exec4DivsivelNum {
    public static void main (String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.print("Por qual numero vc quer dividir:  ");
        float num= entrada.nextFloat();

        System.out.print("Digite o número de começo: ");
        float incio= entrada.nextFloat();

        System.out.print("Digite o número final: ");
        float fim= entrada.nextFloat();


        for (float contador=incio; contador<=fim; contador++){
            if (contador % num == 0){
                System.out.println(contador+ " é divisível por "+num);

            }
        }
        System.out.println("Os números digitados para o incio e fim são respectivamente: "+incio+" e "+fim);

    }
}
