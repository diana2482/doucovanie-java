package cvicenie1;

public class IfPodmienky {
    public boolean jeKladne(int cislo){
        if (cislo < 0)
            return false;
        return true;
    }
    public boolean jeDelitelne(int cislo, int delitel){
        if (cislo % delitel == 0){
            return true;
        }
        return false;
    }

//    public boolean jeDelitelne(int cislo, int delitel){
//        return cislo % delitel == 0;
//    }
    public boolean jeCislo(char znak){
        if (Character.isDigit(znak))
            return true;
        return false;
    }

    public void vypisZnamku(int pocetPercent){
        if (pocetPercent > 90)
            System.out.printf("Student presiel so znamkou A a poctom percent %d\n", pocetPercent);
        else if (pocetPercent > 80)
            System.out.printf("Student presiel so znamkou B a poctom percent %d\n", pocetPercent);
        else if (pocetPercent > 70)
            System.out.printf("Student presiel so znamkou C a poctom percent %d\n", pocetPercent);
        else if (pocetPercent > 60)
            System.out.printf("Student presiel so znamkou D a poctom percent %d\n", pocetPercent);
        else if (pocetPercent > 50)
            System.out.printf("Student presiel so znamkou E a poctom percent %d\n", pocetPercent);
        else if (pocetPercent > 0)
            System.out.printf("Student nepresiel. Pre minimalnu znamku chybalo %d%c\n", 51-pocetPercent, '%');
        else
            System.out.println("Pocet percent je invalidny.");
    }
    public int najvacsieCisloZTroch(int cislo1, int cislo2, int cislo3) {
        if (cislo1 >= cislo2 && cislo1 >= cislo3) {
            return cislo1;
        } else if (cislo2 >= cislo1 && cislo2 >= cislo3) {
            return cislo2;
        } else {
            return cislo3;
        }
    }

    public double najvacsieCisloZTroch(double cislo1, double cislo2, double cislo3) {
        if (cislo1 >= cislo2 && cislo1 >= cislo3) {
            return cislo1;
        } else if (cislo2 >= cislo1 && cislo2 >= cislo3) {
            return cislo2;
        } else {
            return cislo3;
        }
    }
}