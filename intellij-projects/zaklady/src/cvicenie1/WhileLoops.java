package cvicenie1;

public class WhileLoops {
    public int nulaNaIndexe(int[] list){
        int idx = 0;
        while (list[idx] != 0){
            if (idx == list.length-1){
                return -1;
            }
            idx++;
        }
        return idx;
    }

    // TODO: 2.
    public static int pocetCifier(int cislo) {
        int pocet = 0;
        while (cislo > 0) {
            cislo = cislo / 10;
            pocet++;
        }
        System.out.println("Pocet cifier je " + pocet);
        return pocet;
    }

    // TODO: 3.
    public static void fibonacci (int postuponostCisel){
        int first = 0;
        int second = 1;

        System.out.println("Fibonacciho postupnosť: ");
        int i=0;
        while (i<postuponostCisel)
        {
            System.out.println(first);
            int sum = first + second;
            first = second;
            second = sum;
            i++;
        }
        System.out.println();
    }
}