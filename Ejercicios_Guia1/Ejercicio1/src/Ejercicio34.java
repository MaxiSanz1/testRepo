public class Ejercicio34 {
    public static void main(String[] args) {
        int[] a1 = { -5, 0, 0, 1, 6 };
        int[] a2 = { -10, 0, 7 };
        int[] resultado = devolverSuma(a1, a2);
        for (int i = 0; i < resultado.length - 1; i++) {
            resultado[i] = resultado[i];
            System.out.println(resultado[i]);
        }
    }

    public static int[] devolverSuma(int[] a1, int[] a2) {
        int[] resultado = new int[a1.length + a2.length];
        int i = 0;
        for (i = 0; i < a1.length; i++) {
            resultado[i] = a1[i];
        }
        for (i = a2.length; i < resultado.length - 1; i++) {
            resultado[i] = a2[i];
        }
        return resultado;
    }
}
