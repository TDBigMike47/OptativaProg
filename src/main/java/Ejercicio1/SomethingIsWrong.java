package Ejercicio1;

import java.awt.*;

public class SomethingIsWrong {


    public static void main(String[] args) {
        /*
        Rectangle myRect;
        Esto nunca genera un rectangulo, se tiene que generar el rectangulo
        Para esto hay 2 posibles soluciones:
        1.- Creas una clase Rectangulo y este programa lo mueves a un main
        y llamas al objeto rectangulo
        2.- puedes crear el objeto directamente con el new Rectangle()
        el cual nos importara una clase de java el cual nos permite
        construir el rectangulo, así como lo tengo a continuación
         */
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        /*
        System.out.println("myRect's area is " + myRect.area());
        En segundo esta parte nos iba a mandar a imprimir el valor de la funcion
        area dentro de rectangulo, el cual no existe y a parte no se le estaban
        enviando ningun parametro.
        Para solucionar esto, genere la variable area la cual hace la multiplicación
        de lo largo y ancho del rectangulo para obtener el area, y en el print
        en vez de utilizar el myRect.area() utilice el area que genere a continuación
         */
        double area = myRect.height * myRect.width;
        System.out.println("myRect's area is " + area);
    }

}
