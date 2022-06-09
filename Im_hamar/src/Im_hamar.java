public class Im_hamar {

    public static void main(String[] args) {
        int[] array = {11, 5, 2, 6, 7};

        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }

        }
        for (int x : array) {
            System.out.println(x + " ");
        }
    }
}