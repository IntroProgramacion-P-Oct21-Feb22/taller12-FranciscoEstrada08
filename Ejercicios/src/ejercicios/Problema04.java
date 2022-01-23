/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] bases = {100, 90, 80, 70, 60};
        
        double[] potencias = {2, 3, 2, 2, 1};
        
        double[] resultado = new double[5];
        
        for(int i = 0; i<bases.length;i++){
            resultado[i] = obtenerPotencia(bases[i],potencias[i]);
            System.out.printf("La potencia en la posicion %d es %.2f\n",i,resultado[i]);
        }
        System.out.printf("La suma total de las potencias es: "
                + "%.0f\n", obtenerSuma(resultado, resultado.length));
    }
    public static double obtenerPotencia(double a,double b){
        if(b==1){
            return a;
        }else{
            return a * obtenerPotencia(a, b - 1);
        }
    }
     public static double obtenerSuma(double[] resultado, int tamaño) {

        if (tamaño == 1) {
            return resultado[0];
        } else {
            return resultado[tamaño - 1] + obtenerSuma(resultado, tamaño - 1);
        }
    }
}
