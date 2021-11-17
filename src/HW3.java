
import java.util.Random;

public class HW3 {
    final Random random = new Random();

    public static void main(String[] args) {
        System.out.println("task1");
        int[] arr0 = new int[5];
        int x = 0;
        int i = 0;

        while (i <= 8) {
            i += 2;
            arr0[x] = i;
            x++;
            System.out.println(i);
        }
        HW3 hw3 = new HW3();
        System.out.println("task2");
        int[] arr1 = new int[5];
        x = 0;
        i = 0;

        while (i < 10) {
            i += 2;
            arr1[x] = i;
            ++x;
            System.out.println(i);
        }

        int k = arr1[2];
        System.out.println(k);

        hw3.createRandomArray(10);

        System.out.println("task7");
        for (int p = 0; p < 20; p++) {
            System.out.println(Integer.toHexString(p));
        }

    }
    public void createRandomArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + ",");
        }
        arr[arr.length - 1] = random.nextInt(100);
        System.out.print(arr[arr.length - 1] + ".");
        System.out.println();
        System.out.println("Minimal value is: " + findMin(arr));
        System.out.println("Maximum value is: " + findMax(arr));
        System.out.println("Average value is: " + findAverage(arr));
        System.out.println("Значення парних індексів: ");
        findEven(arr);
    }

    public int findMin(int[] intArr) {
        System.out.println("task4,5");
        int min = 100;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < min) {
                min = intArr[i];
            }
        }
        return min;
    }

    public int findMax(int[] intArr) {
        int max = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] > max) {
                max = intArr[i];
            }
        }
        return max;
    }

    public int findAverage(int[] intArr) {
        System.out.println("task3");
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum = sum + intArr[i];
        }
        int f = sum / intArr.length;
        return f;
    }
    public void findEven(int[] intArr) {
        System.out.println("task6");
        for (int i = 0; i < intArr.length; i = i + 2) {
            System.out.println(intArr[i]);
        }
    }
}


