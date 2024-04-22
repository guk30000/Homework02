public class Main {
    public static void main(String[] args) {

        byte pen = 2;
        short apple = 10;
        int ant = 1500;
        long people = 9_769_234L;
        float leg = 1.5f;
        double iq = 0.57;
        System.out.println("Значение переменной pen с типом byte равно " + pen);
        System.out.println("Значение переменной apple с типом short равно " + apple);
        System.out.println("Значение переменной ant с типом int равно " + ant);
        System.out.println("Значение переменной people с типом long равно " + people);
        System.out.println("Значение переменной leg с типом float равно " + leg);
        System.out.println("Значение переменной iq с типом double равно " + iq);

        float first = 27.12f;
        long second = 987_678_965_549L;
        float third = 2.786f;
        short fourth = 569;
        short fifth = -159;
        short sixth = 27897;
        byte seventh = 67;

        byte classLudmilaPavlovna = 23;
        byte classAnnaSergeevna = 27;
        byte classEkaterinaAndreevna = 30;
        byte pupils = (byte) (classEkaterinaAndreevna + classAnnaSergeevna + classLudmilaPavlovna);
        short sheets = 480;
        int sheetPerPupil = sheets / pupils;
        System.out.println("На каждого ученика рассчитано " + sheetPerPupil + " листов бумаги");

        byte bottles = 16;
        int timeInMinutes = 2;
        int efficiency = bottles / timeInMinutes;
        timeInMinutes = 20;
        int bottlesProduced = efficiency * timeInMinutes;
        System.out.println("За " + timeInMinutes + " минут машина произвела " + bottlesProduced + " штук бутылок");
        timeInMinutes = 24 * 60;
        bottlesProduced = timeInMinutes * efficiency;
        System.out.println("За " + timeInMinutes + " минут машина произвела " + bottlesProduced + " штук бутылок");
        timeInMinutes = 3 * 24 * 60;
        bottlesProduced = timeInMinutes * efficiency;
        System.out.println("За " + timeInMinutes + " минут машина произвела " + bottlesProduced + " штук бутылок");
        timeInMinutes = 30 * 24 * 60;
        bottlesProduced = timeInMinutes * efficiency;
        System.out.println("За " + timeInMinutes + " минут машина произвела " + bottlesProduced + " штук бутылок");

        byte canOfPaint = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        int classes = canOfPaint / (whitePaintPerClass + brownPaintPerClass);
        int whitePaintAtAll = classes * whitePaintPerClass;
        int brownPaintAtAll = classes * brownPaintPerClass;
        System.out.println("В школе, где " + classes + " классов, нужно " + whitePaintAtAll + " банок белой краски и " + brownPaintAtAll + " банок коричневой краски");

        byte bananas = 5;
        byte bananaWeight = 80;
        short milkInMl = 200;
        float gramsPerMl = (105 / 100f);
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        byte egg = 4;
        byte eggWeight = 70;
        int totalWeight = (int) (bananas * bananaWeight + milkInMl * gramsPerMl + iceCream * iceCreamWeight + egg * eggWeight);
        int grPerKg = 1000;
        float totalWeightInKg = totalWeight / (float)grPerKg;
        System.out.println("Вес завтрака " + totalWeight + " грамм " + " или " + totalWeightInKg + " килограмм");

        short grPerDay1 = 250;
        short grPerDay2 = 500;
        byte weightLossInKg = 7;
        short grPerKilo = 1000;
        int weightLossInGr = weightLossInKg * grPerKilo;
        int daysToLoseWeight1 = weightLossInGr / grPerDay1;
        System.out.println("Дней для похудения при потере " + grPerDay1 + " грамм в день - " + daysToLoseWeight1);
        int daysToLoseWeight2 = weightLossInGr / grPerDay2;
        System.out.println("Дней для похудения при потере " + grPerDay2 + " грамм в день - " + daysToLoseWeight2);
        int daysOnAverage = (daysToLoseWeight1 + daysToLoseWeight2) / 2;
        System.out.println("Дней для похудения в среднем - " + daysOnAverage);

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int raisePercent = 10;
        int mashaSalaryRaise = (int) ((mashaSalary / (float)100) * raisePercent);
        int denisSalaryRaise = (int) ((denisSalary / (float)100) * raisePercent);
        int kristinaSalaryRaise = (int) ((kristinaSalary / (float)100) * raisePercent);
        int mashaNewSalary = mashaSalary + mashaSalaryRaise;
        int denisNewSalary = denisSalary + denisSalaryRaise;
        int kristinaNewSalary = kristinaSalary + kristinaSalaryRaise;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaSalaryRaise + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisSalaryRaise + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaSalaryRaise + " рублей");
        //В условии не уточнили, нужно ли ЗП выдавать с копейками, поэтому оставил тип int
        //Понимаю, что если зп изначально не будет кратна 10, то код будет выдавать без них




    }
}