import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Main {
        public static void ukol1() {
       System.out.println("Hello world!"); //metoda vypise text v zátvorkách ten musí byt v uvodzovkach
    }
    public static void ukol2() {
       String uzivatel = "Karel"; //pri datovom type String je nutne pouzit uvodzovky
       System.out.println(uzivatel);
    }

    public static void ukol3() {
        int pocetLekci = 10; // potreba zmeny datoveho typu zo String napriklad na int
        System.out.println(pocetLekci);
    }

    public static void ukol4() {
        double cena = 10.0; // nameisto desatinnej ciarky bolo nutne pouzit bodku. (BigDecimal cena = BigDecimal.valueOf(10.0);)
        System.out.println(cena);
    }

    public static void ukol5() {
            DecimalFormat df = new DecimalFormat("0.0");
        float cena = 0; // pouzijeme datovy typ float a na pocet desatinnych miest naimportujeme a pouzijeme DecimalFormat
        for (float i = 0; i < 10; i++) {
            cena += 0.1;
        }
         System.out.println(df.format(cena));
    }


    public static void ukol6() {
        BigDecimal cena = BigDecimal.valueOf(0); // Zle zapísanie + potrebny import
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }

    public static void ukol7() {
        int vykonMotoru = 120; // datovy typ int nevyuziva na zapis cisel uvodzovky
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }

    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: " +velikostKosile+ "."); //zle zapisana hodnota do System.out.println (zmena , na +)
    }
    public static void ukol9() { //chýbalo STATIC (oznacenie ze metoda je spojena s class)
        System.out.println("Metoda *skoro* bez chybičky!");
    }
    public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou zkratkou <Ctrl>+</> - použij lomítko na numerické klávesnici.");
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();
    }
}