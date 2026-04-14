public class SimpleBlowfishDecimal {
    static final int ROUNDS = 16;

    static int[] p = {
        1,3,5,7,9,11,13,15,17,19,21,25,27,29,31,33,35,37
    };

    static int[] s1 = {101,203,305,407};
    static int[] s2 = {509,611,713,815};
    static int[] s3 = {917,1019,1121,1223};
    static int[] s4 = {1325,1427,1529,1631};

    static int F(int x) {
        int a = (x >> 24) & 3;
        int b = (x >> 16) & 3;
        int c = (x >> 8) & 3;
        int d = x & 3;

        int result = s1[a] + s2[b];
        result = result ^ s3[c];
        result = result + s4[d];
        return result;
    }

    static void encrypt(int[] data) {
        int L = data[0];
        int R = data[1];

        for (int i = 0; i < ROUNDS; i++) {
            L = L ^ p[i];
            R = R ^ F(L);

            int temp = L;
            L = R;
            R = temp;
        }

        int temp = L;
        L = R;
        R = temp;

        R = R ^ p[16];
        L = L ^ p[17];

        data[0] = L;
        data[1] = R;
    }

    public static void main(String[] args) {
        int[] data = {10, 20};

        System.out.println("Before Encryption:");
        System.out.println("L=" + data[0] + " R=" + data[1]);

        encrypt(data);

        System.out.println("After Encryption:");
        System.out.println("L=" + data[0] + " R=" + data[1]);
    }
}
