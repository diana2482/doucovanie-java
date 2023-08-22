package cvicenie1;

public class WhileCykly {
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
    // Napiste while cyklus, ktory vypocita pocet cifier cisla. Metoda sa bude volat pocetCifier,
    // vraciat bude pocet cifier a bude mat jeden argument – cislo, ktoreho cifry chceme spocitat.
    // Tuto metodu spravne pouzite v triede Main.

    // TODO: 3.
    // Fibonacciho postupnost: Napiste metodu s nazvom fibonacci, ktora bude vypisovat
    // postupnost fibonacciho cisel. Bude mat jeden argument – kolko cisel ma postupnost
    // vypisovat. Pre 10 cisel vypise tuto postupnost: 0,1,1,2,3,5,8,13,21,34.
    // Tuto metodu spravne pouzite v triede Main.
}