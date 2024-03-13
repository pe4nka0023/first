public class Main {
    public static void main(String[] args) {
        //task 1
        byte b = 12;
        short s = 2525;
        int i = 19200393;
        long l = 181283283232L;
        float f = 123.3f;
        double d = 28.1;
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        //task 2
        double a = 27.12;
        long c = 987_678_965_549L;
        float e = 2.786f;
        short r = 569;
        short m = -159;
        int k = 27897;
        byte q = 67;

        //task 3
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short total = 480;
        System.out.println(total / (lp + as + ea));
        int totallist = total / (lp + as + ea);
        System.out.println("На каждого ученика рассчитано " + totallist + " листов бумаги");

        //task 4
        byte performanceIn2Minutes = 16;
        short perf20min = (short) (performanceIn2Minutes * 10);
        int perf24hour = performanceIn2Minutes * 720;
        int perf3days = perf24hour * 3;
        int perfMonth = perf24hour * 30;
        System.out.println("За 20 минут машина произвела " + perf20min + "штук бутылок");
        System.out.println("За 24 часа машина произвела " + perf24hour + "штук бутылок");
        System.out.println("За 72 часа машина произвела " + perf3days + "штук бутылок");
        System.out.println("За 1 месяц машина произвела " + perfMonth + "штук бутылок");

        //task 5
        byte totalJar = 120;
        byte white = 2;
        byte brown = 4;
        byte classCount = (byte) (totalJar / (white + brown));
        byte totalwhite = (byte) (classCount * white);
        byte totalbrown = (byte) (classCount * brown);
        System.out.println("В школе, где " + classCount + " классов, нужно " + totalwhite + " банок белой краски и " + totalbrown +
                " банок коричневой краски");

        //task 6
        int bananas = 5 * 80;
        int milk = 210;
        int iceCream = 2 * 100;
        int eags = 4 * 70;
        int totalGrams = bananas + milk + iceCream + eags;
        float totalKilograms = (float) totalGrams / 1000;
        System.out.println("Общий вес продуктов в граммах: " + totalGrams + " грамм");
        System.out.println("Общий вес продуктов в килограммах: " + totalKilograms + " килограмм");

        //task 7
        byte totalKg = 7;
        int totalsGram = totalKg * 1000;
        System.out.println(totalsGram / 250);
        System.out.println(totalsGram / 500);

        //task 8
        double masha = 67.760;
        double denis = 83.690;
        double kristina = 76.230;

        double mashaInc = 67.760 * 1.1;
        double denisInc = 83.690 * 1.1;
        double kristinaInc = 76.230 * 1.1;

        double mashaInkForYear = mashaInc * 12;
        double denisInkForYear = denisInc * 12;
        double kristinaInkForYear = kristinaInc * 12;

        double mashaForYear = masha * 12;
        double denisForYear = denis * 12;
        double kristinaForYear = kristina * 12;

        double difMasha = mashaInkForYear - mashaForYear;
        double difDenis = denisInkForYear - denisForYear;
        double difKristina = kristinaInkForYear - kristinaForYear;
        System.out.println("Маша теперь получает " + mashaInc + " рублей. Годовой доход вырос на " + difMasha +
                " рублей");
        System.out.println("Денис теперь получает " + denisInc + " рублей. Годовой доход вырос на " + difDenis +
                " рублей");
        System.out.println("Кристина теперь получает " + kristinaInc + " рублей. Годовой доход вырос на " + difKristina +
                " рублей");


    }
}