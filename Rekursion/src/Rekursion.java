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

    public int berechneggt(int a, int b) {
        int ggT = 1;
        for (int i = 1; i <= Math.min(a,b); i++) {
            if ((a%i==0) && (b%i==0)) {
                ggT = i;
            }
        }
        return ggT;
    }

    public int ggtrekursiv(int a, int b) {
        int neu = Math.max(a, b) - Math.min(a, b);
        if (neu == Math.min(a, b)) {
            return neu;
        } else {
            return ggtrekursiv (Math.min(a, b), neu);
        }
    }
}