public class Main {

    public static void main(String[] args) {
        //First task
        int a, b, w, q, r, l, z, c, v, i, y, x = 0;
        a = 5;
        b = 3;
        c = 2;
        w = 6;
        q = 10;
        r = 4;
        v = 15;
        i = 60;
        z = 2;
        l = 30;
        y = 50;
        x = 21;
        int result1 = a + b * (w / q) * r + l;
        int result2 = b + v - i * z;
        int result3 = x + y + z * c;

        System.out.println("a + b * (w / q) * r = " + result1);
        System.out.println("b + v - i * z = " + result2);
        System.out.println("x + y + z * c = " + result3);

        //Second task
        char letterH = 72;
        char letterE = 101;
        char letterL = 108;
        char letterO = 111;
        char letterW = 119;
        char letterR = 114;
        char letterD = 100;

        System.out.println("" + letterH + letterE + letterL + letterL + letterO
                + ' ' + letterW + letterO + letterR + letterL + letterD);

        //Third task
        boolean result;
        result = 10 < 9;
        System.out.println("10 < 9 -> " + result);
        result = 3 == 4;
        System.out.println("3 == 4 -> " + result);
        result = 2 != 2;
        System.out.println("2 != 2 -> " + result);
        result = 9 >= 8;
        System.out.println("9 >= 8 -> " + result);
    }
}

