package com.sdacademy.core;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double investitie = input.nextInt();
        input.nextLine();
        int nrAni = input.nextInt();
        input.nextLine();
        double dobanda = input.nextDouble();
        input.nextLine();

        double sumaDobandaSimpla = calculeazaDobandaSimpla(investitie,nrAni,dobanda);
        double sumaDobandaCompusa = calculeazaDobandaCompusa(investitie,nrAni,dobanda);
        System.out.printf("Diferenta: %.2f",(sumaDobandaSimpla-sumaDobandaCompusa));
    }

    private static double calculeazaDobandaCompusa(double investitie, int nrAni, double dobanda){
        for (int i=0;i<nrAni;i++){
            investitie*=(1+dobanda/100);
        }
        System.out.printf("Dobanda compusa: %.2f ",investitie);
        return investitie;
    }
    private static double calculeazaDobandaSimpla(double investitie, int nrAni, double dobanda){
        investitie=investitie*(1+nrAni*dobanda/100);
        System.out.printf("Dobanda simpla: %.2f ",investitie);
        return investitie;

    }

}
