package jrevilla.pruebas;

import java.io.IOException;

/**
 *
 * @author jrevilla
 */
public class Prueba01 {

    
    public static void main(String[] args) {
        try {
            //abrir la calculadora
            Runtime.getRuntime().exec("calc");
            //saber la cantidad de Procesadores
            System.out.println(Runtime.getRuntime().availableProcessors());
        } catch (IOException e) {
            System.out.println("El comando no es el esperado");
        }
    }
    
}
