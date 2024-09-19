package Repaso;

import org.junit.Test;

public class AppTest {

    public AppTest() {

    }
  
    public static void main(String[] args) throws Exception {
         AppTest sumador = new AppTest();
        AppTest probador = new AppTest();
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
   public void DePrueba(){
    
   }
}
