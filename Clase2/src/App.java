public class App {
    public static void main(String[] args) throws Exception {
        int v[] = { 1, 2, 3 };
        System.out.println("Hello World!");
        System.out.println(estaOrdenadoDeMenorAmayor(v));
    }

    public static boolean estaOrdenadoDeMenorAmayor(int[] v) {
        for (int i = 0; i < v.length - 1; i++)
            if (v[i] > v[i + 1]) {
                return false;
            }
        return true;
    }
}
// Esta es la modificacion para Git