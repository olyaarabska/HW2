public class HW3 {
    public HW3() {
    }

    public static void main(String[] args1) {
        System.out.println("task1");
        int[] arr1 = new int[5];
        int x = 0;
        int i = 0;

        while(i <= 8) {
            i += 2;
            arr1[x] = i;
            ++x;
            System.out.println(i);
        }

        int k = arr1[2];
        System.out.println(k);
        System.out.println("task2");
        int b = 10;
        int ran1 = (int)(Math.random() * (double)b);
        int ran2 = (int)(Math.random() * (double)b);
        int ran3 = (int)(Math.random() * (double)b);
        int ran4 = (int)(Math.random() * (double)b);
        int ran5 = (int)(Math.random() * (double)b);
        int ran6 = (int)(Math.random() * (double)b);
        int ran7 = (int)(Math.random() * (double)b);
        System.out.println(ran1);
        int[] arr2 = new int[]{ran1, ran2, ran3, ran4, ran5, ran6, ran7};
        System.out.println("task3");
        int f = (ran1 + ran2 + ran3 + ran4 + ran5 + ran6 + ran7) / 7;
        System.out.println(f);
        System.out.println("task4,5");
        int min = arr2[0];
        int max = arr2[0];

        int h;
        for(h = 0; h != arr2.length; ++h) {
            if (arr2[h] < min) {
                min = arr2[h];
            }

            if (arr2[h] > max) {
                max = arr2[h];
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("task6");
        System.out.println(ran3);
        System.out.println(ran5);
        System.out.println(ran7);
        System.out.println("task7");

        for(h = 0; h != 20; ++h) {
            System.out.println(Integer.toHexString(h));
        }

    }
}
