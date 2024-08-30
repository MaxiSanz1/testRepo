public class App {
    public App(int k, int l) {

    }

    public App(int a) {

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
}