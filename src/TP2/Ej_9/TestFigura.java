package src.TP2.Ej_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestFigura {
    @Test
    public void area2D(){
        Cuadrado cuadrado = new Cuadrado(3);
        double esperadoCuadrado = 9;
        Assertions.assertEquals(cuadrado.getArea(), esperadoCuadrado);

        Circulo circulo=new Circulo(2);
        double esperadoCirculo = Math.PI*4;
        Assertions.assertEquals(circulo.getArea(),esperadoCirculo);

        Rectangulo rectangulo=new Rectangulo(3,4);
        double esperadoRectangulo=12;
        Assertions.assertEquals(rectangulo.getArea(),esperadoRectangulo);

        Triangulo triangulo = new Triangulo(2, 3);
        double esperadoTriangulo = 3;
        Assertions.assertEquals(triangulo.getArea(), esperadoTriangulo);
    }

    @Test
    public void area3D(){

        Esfera esfera = new Esfera(2);
        double esperadoEsfera = 4*Math.PI*4;
        Assertions.assertEquals(esfera.getArea(), esperadoEsfera);

        Cubo cubo = new Cubo(2);
        double esperadoCubo = 24;
        Assertions.assertEquals(cubo.getArea(), esperadoCubo);

        Paralelepipedo paralelepipedo = new Paralelepipedo(2, 3 , 4);
        double esperadoParalelepipedo = 52;
        Assertions.assertEquals(paralelepipedo.getArea(), esperadoParalelepipedo);

        Tetraedro tetraedro = new Tetraedro(5);
        double esperadoTetraedro = 25 * Math.sqrt(3);
        Assertions.assertEquals(tetraedro.getArea(), esperadoTetraedro);
    }

    @Test
    public void volumen3D(){
        Esfera esfera = new Esfera(2);
        double esperadoEsfera = ((double) 4 /3)*Math.PI*(8);
        Assertions.assertEquals(esfera.getVolumen(), esperadoEsfera);

        Cubo cubo = new Cubo(2);
        double esperadoCubo = 8;
        Assertions.assertEquals(cubo.getVolumen(), esperadoCubo);

        Paralelepipedo paralelepipedo = new Paralelepipedo(2, 3 , 4);
        double esperadoParalelepipedo = 24;
        Assertions.assertEquals(paralelepipedo.getVolumen(), esperadoParalelepipedo);

        Tetraedro tetraedro = new Tetraedro(5);
        double esperadoTetraedro = 125 * (Math.sqrt(2)/12);
        Assertions.assertEquals(tetraedro.getVolumen(), esperadoTetraedro);
    }

    @Test
    public void testApp(){
        App app = new App();
        Cuadrado cuadrado = new Cuadrado(3);
        Esfera esfera = new Esfera(2);
        Cubo cubo = new Cubo(4);
        app.agregarFigura(cuadrado);
        app.agregarFigura(esfera);
        app.agregarFigura(cubo);
        ArrayList<Figura> lista1 = new ArrayList<>();
        ArrayList<Figura> lista2 = new ArrayList<>();
        lista1.add(cuadrado);
        lista2.add(esfera);
        lista2.add(cubo);
        Assertions.assertEquals(app.getLista2D(), lista1);
        Assertions.assertEquals(app.getLista3D(), lista2);

        app.eliminarFigura(1, false);
        lista2.remove(1);
        Assertions.assertEquals(app.getLista3D(), lista2);
    }
}
