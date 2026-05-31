public class MathUtils {
    static void min(int[] arr){
        if (arr == null || arr.length == 0) {
            System.out.println("Массив пуст");
            return;
        }

        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("Минимальное значение: " + minValue);
    }
    static void max(int[] arr){
        if (arr == null || arr.length == 0) {
            System.out.println("Массив пуст");
            return;
        }

        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.println("Максимальное значение: " + maxValue);
    }
    static void average(int[] arr){
        if (arr == null || arr.length == 0) {
            System.out.println("Массив пуст");
            return;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double averageValue = (double) sum / arr.length;
        System.out.println("Среднее значение: " + averageValue);
    }
}
