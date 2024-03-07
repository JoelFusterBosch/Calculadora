/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumno
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    @BeforeAll
    public void setUp() {
        Calculadora calc=new Calculadora();
    }
    @AfterAll
    public void setDown(){
        Calculadora calc=new Calculadora();
        calc.restablecer();
    }
    @Test
    /**
     * Aquesta funcio de floats te com a parametre altres 2 floats
     * que es sumen (n1+n2)
     */
    public void suma(){
        Calculadora calc=new Calculadora();
        float resultado= calc.suma(2,2);
        assertEquals(4, resultado);
    }
        /**
     * Aquesta funcio de floats te com a parametre altres 2 floats
     * que es resten (n1-n2)
     */
    public void resta(){
        Calculadora calc=new Calculadora();
        float resultado= calc.resta(2,2);
        assertEquals(0, resultado);
    }
    /**
     * Aquesta funcio de floats te com a parametre altres 2 floats
     * que es multipliquen (n1*n2)
     */
    public void multiplicacion(){
        Calculadora calc=new Calculadora();
        float resultado= calc.multiplica(2,2);
        assertEquals(4, resultado);
    }
    /**
     * Aquesta funcio de floats te com a parametre altres 2 floats
     * que es divideixen (n1/n2)
     */
    public void division(){
        Calculadora calc=new Calculadora();
        float resultado= calc.divideix(2,2);
        assertEquals(1, resultado);
    }
    /**
     * Aquesta funcio de booleans te com a parametres 2 floats
     * que es comparen per a saber quin es major que el 
     * altre i retorna un true o un false (n1>n2)
     */
    public void majorQue(){
        Calculadora calc=new Calculadora();
        boolean resultado= calc.majorQue(2,2);
        assertEquals(false, resultado);
    }
}
