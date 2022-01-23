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
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        
        double[][] result = new double[4][2];
        
        result = factorial(datos);
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("El factorial de %.0f es %.2f\t", datos[i][j],
                        result[i][j]);
            }
            System.out.println();
        }
        
    }
    public static double[][] factorial(double [][] datos){
        double factorial[][] = new double[4][2];
        
        for(int i = 0; i<datos.length;i++){
            for(int j = 0; j< datos[i].length;j++){
                factorial[i][j] = condicional(datos[i][j]);
            }
        }
        return factorial;
    }
    public static double condicional(double numero){
        if(numero<=1){
            return 1;
        }else{
            return numero * condicional(numero-1);
        }
    }
    
}
