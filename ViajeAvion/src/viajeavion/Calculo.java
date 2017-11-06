/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viajeavion;

import java.util.Scanner;


public class Calculo {
    private int KM = 523;
    private double Costo;
    private int niño;
    private int adulto;
    private int terceraEdad;
    private int pasajero;
    private double distancia;
    private int edad;
    
    
    public void Menu (){
        IngresarPasajero();
        IngresarEdad();
        Ingresardistancia();
        Costo ();
        System.out.println("El costo final es : "+ Descuentos ());
    }
        public void IngresarPasajero (){
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese el numero de pasajeros");
        pasajero = intro.nextInt();
    }
    public void Ingresardistancia (){
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese la distancia del viaje");
        distancia = intro.nextInt();
    }
    public void IngresarEdad (){
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese la edad de los pasajeros");
        for (int i = 1; i <= pasajero; i++) {  
            System.out.println("Pasajero numero "+ i);
            edad = intro.nextInt();
            if (edad <= 16){
                niño++;
            }else{
                if (edad > 16 ){
                    adulto++;
                }
                if (edad > 65){
                    terceraEdad++;
                }
            }
        }
    }
    
    public void Costo (){
        Costo = (distancia * KM)* pasajero;
    }
    public double Descuentos (){
        if (distancia > 1030 ){
            if (adulto == 3){
                Costo = Costo - (Costo * 0.1);
                if (terceraEdad >= 1){
                    Costo = Costo - (Costo * 0.25);
                }
            }else{
                if ( adulto == 2 && niño ==1){
                    Costo = Costo - (Costo * 0.08);
                    if (terceraEdad >= 1){
                    Costo = Costo - (Costo * 0.25);
                    }
                }
            }     
        }
        if (terceraEdad >= 1){
            Costo = Costo -(Costo * 0.5);
        }
        if ( Costo > 550000){
            Costo = Costo - (Costo * 0.2);
        }
        return Costo;

        }
    
}
