package superM;

import org.junit.Test;

public class SupermercadoTest {
    @Test
    public void seraLiquido(){
        Producto magistral = new Detergente();
        Producto almamora = new Vino("Alma", "Tinto", 37.5, 5000);
        System.out.println(almamora.toString());

    }
}
