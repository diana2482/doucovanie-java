package cvicenie1;

public class ForCykly {
    public void nekonecnyCyklus() {
        for (; ; ) {
            System.out.println("Toto je nekonecny cyklus");
        }
    }

    public void ohranicenyCyklus(int start, int end) {
        if (jeStartMensi(start, end)) {
            for (int i = start; i <= end; i++) {
                System.out.printf("Ohraniceny rastuci cyklus, i=%d\n", i);
            }
        } else {
            for (int i = start; i >= end; i--) {
                System.out.printf("Ohraniceny klesajuci cyklus, i=%d\n", i);
            }
        }
    }

    private boolean jeStartMensi(int start, int end) {
        return start < end;
    }

//    private boolean jeStartMensi(int start, int end){
//        if (start < end)
//            return true;
//        else
//            return false;
//    }

    public int suma(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public int faktorial(int n) {
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result *= i;
        }
        return result;
    }


    public int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }


    public int maximum(int[] cisla) {
        int maximum = cisla[0];
        for (int cislo : cisla) {
            if (cislo > maximum) {
                maximum = cislo;
            }
        }
        return maximum;
    }

    public void hviezdicky(int vyska, int sirka, int variacia) {
        if (variacia == 6) {
            for (int i = 1; i <= vyska; i++) {
                for (int j = 1; j <= vyska - i; j++) {
                    System.out.print(" ");
                }
                for (int k=i; k>1; k--){
                    System.out.print(k);
                }
                for (int k = 1; k < i+1; k++) {
                    System.out.print(k);
                }
                for (int j = 1; j <= vyska - i; j++) {
                    System.out.print(' ');
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}