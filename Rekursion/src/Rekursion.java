public class Rekursion {
    public void fakuliter(int a) {
        int result = 1;
        for (int i = a; i>0; i--) {
            result *= i;
        }
        System.out.println(result);
    }

    public int fakulrek(int n) {
        if (n>1) {
            return n * fakulrek(n-1);
        } else {
            return 1;
        }
    }

    public int potenzrek(int n) {
        if (n>0) {
            return 2 * potenzrek(n-1);
        } else {
            return 1;
        }
    }
}