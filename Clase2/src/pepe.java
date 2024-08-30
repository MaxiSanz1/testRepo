public class pepe {

    public static boolean estaOrdenadoDeMenorAmayor(int[] v) {
        for (int i = 0; i < v.length - 1; i++)
            if (v[i] > v[i + 1]) {
                return false;
            }
        return true;
    }
}