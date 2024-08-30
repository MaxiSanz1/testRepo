public class Ejercicio31 {
    public static void main(String[] args) {
        int[] a = { 3, 6, 7, 9, 2, 4 };
        int[] b = new int[10];
        System.out.println(sumaDeElementosEnPosPares(a));
    }

    static int sumaDeElementosEnPosPares(int[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i += 2) {
            suma += a[i];
        }
        return suma;
    }
}
