import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionTest {
    //Lorenzo Devia y Kianush Atighi-Moghaddam(Diseño)
    private Funcion a;
    String p_prueba;
    boolean resultado_esperado;
    @BeforeEach
    void setUp() {
        a = new Funcion();
    }

    @AfterEach
    void tearDown() {
        a = null;
    }

    @Test
    void esPalindromo1() {
        p_prueba = "adanada";
        resultado_esperado = true;
        assertEquals(resultado_esperado,a.esPalindromo(p_prueba));
    }
    @Test
    void esPalindromo2() {
        p_prueba = "abcdefg";
        resultado_esperado = false;
        assertEquals(resultado_esperado,a.esPalindromo(p_prueba));
    }

    @Test
        // Kianush Atighi-Moghaddam
    void esPalindromo3(){
        p_prueba = "";
        resultado_esperado = false;
        assertEquals(resultado_esperado,a.esPalindromo(p_prueba));
    }

    @Test
        // Kianush Atighi-Moghaddam
    void esPalindromo4(){
        p_prueba = "a";
        resultado_esperado = false;
        assertEquals(resultado_esperado,a.esPalindromo(p_prueba));
    }

    @Test
        // Kianush Atighi-Moghaddam
    void esPalindromo5(){
        int n_prueba = 101;
        resultado_esperado = true;
        assertEquals(resultado_esperado,a.esPalindromo(n_prueba));
    }

    @Test
    void esPalindromo6(){
        p_prueba = "aca";
        resultado_esperado = true;
        assertEquals(resultado_esperado,a.esPalindromo(p_prueba));
    }
    @Test
    void esPalindromo7(){
        p_prueba = "acas";
        resultado_esperado = false;
        assertEquals(resultado_esperado,a.esPalindromo(p_prueba));
    }
    @Test
        // Kianush Atighi-Moghaddam
    void esPalindromo8(){
        p_prueba = "h";
        resultado_esperado = false;
        assertEquals(resultado_esperado,a.esPalindromo(p_prueba));
    }
    @Test
        // Lorenzo Devia
    void esPalindromo9(){
        p_prueba = "la tele letal";
        resultado_esperado = true;
        assertEquals(resultado_esperado,a.esPalindromo(p_prueba));
    }

    @Test
        // Lorenzo Devia
    void esPalindromo10(){
        p_prueba = "ABcdcba";
        resultado_esperado = true;
        assertEquals(resultado_esperado,a.esPalindromo(p_prueba));
    }

}