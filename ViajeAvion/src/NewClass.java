
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dci
 */
public class NewClass {
    private int KM = 523;
    private int edad;
    private int pasajero;
    private double distancia;
    private double Costo;
    private int niño;
    private int adulto;
    private int terceraEdad;
    public void IngresarPasajero (){
        Scanner intro = new Scanner(System.in);
        System.out.println("ingrese el numero de pasajeros");
        pasajero = intro.nextInt();
    }
    public void IngresarKM (){
        Scanner intro = new Scanner(System.in);
        System.out.println("ingrese la distancia del viaje");
        distancia = intro.nextInt();
    }
    public void IngresarEdad (){
        Scanner intro = new Scanner(System.in);
        System.out.println("ingrese la edad de los pasajeros");
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
        Costo = distancia * KM;
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
            Costo = Costo -(Costo *0.5);
        }
        if ( Costo > 550000){
            Costo = Costo - (Costo *0.2);
        }
        return Costo;

        }
        
}
