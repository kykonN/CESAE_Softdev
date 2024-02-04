package Ficha_Pratica_02;

import java.util.Scanner;

public class Ex_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horas,minutos;

        System.out.println("Introduza o horario no sistema 24h");
        // ler horas
        System.out.println("horas:");

        horas = input.nextInt();


        //ler minutos
        System.out.println("Minutos");
minutos = input.nextInt();

if (horas <= 12){ //AM
    System.out.println(horas+ " "  + minutos + " AM");




    }else{ // PM
    horas=horas-12;
    System.out.println(horas + " : " + minutos + "PM");
}}}
