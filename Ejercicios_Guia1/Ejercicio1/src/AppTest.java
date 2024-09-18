import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    public AppTest() {

    }

    public static void main(String[] args) throws Exception {
        App sumador = new App(1, 2);
        App probador = new App(1);
        System.out.println("Hello, World!");
        System.out.println(sumador.suma(5, 10));
        System.out.println(probador.esPar(6));
    }

    public int suma(int a, int b) {
        return a + b;
    }

    public boolean esPar(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }

  
    @Test
    public void verSiFunciona() {
        double esperado = 10;
        assertEquals(esperado, suma(6, 6), 15);

    }
}
