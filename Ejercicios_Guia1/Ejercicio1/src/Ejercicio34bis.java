public class Ejercicio34bis {
    static int[] mezcla(int[] a, int[] b) {
        int[] resultado = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                resultado[k] = a[i];
                i++;

            } else {
                resultado[k] = b[j];
                j++;

            }
            k++;

        }
        if (i == a.length) {
            for (int l = i; l < resultado.length; l++) {
                resultado[l] = b[j];
            }
        }
        return resultado;
    }

    public static void main(String[] args) {

    }
}
