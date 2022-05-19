public class Homeworks {
    public static void main(String[] args) {//es fill arecinq 1-100 tver@ zangvaci mej
        int[] y = new int[100];
        y[0] = 1;
        y[99] = 100;
        int a = y[0], b = y[99];
        for (; a < b ; a++) {
            y[a]=a+1;
        }
    }
}




