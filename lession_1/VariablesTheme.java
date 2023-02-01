public class VariablesTheme {    
    public static void main(String[] args)  {
        System.out.println("\n1.Вывод значений переменных на консоль");
        byte core = 4;
        short sizeRam = 15;
        int countLogCpu = 8;
        long countHdd = 4l;
        float freqCpu = 2675.4864f;
        double freqRam = 1066.7777777765d;
        char nameCpu = 'i';
        boolean startComputer = true;
        System.out.println("Ядер ЦП = " + core + "\nОбъём ОЗУ = " + sizeRam + "\nКол.лог.ЦП = " 
                + countLogCpu + "\nКол.HDD = " + countHdd + "\nЧастота ЦП = " + freqCpu 
                + "\nЧастота ОЗУ = " + freqRam + "\nИмя ЦП = " + nameCpu + "\nПК включён ? " 
                + startComputer );  

        System.out.println("\n2.Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        float discount = 0.11f;
        // сумма скидки
        float discountSum = ((penPrice + bookPrice) * discount);
        // Итоговая сумма
        float discountPrice = ((penPrice + bookPrice) - discountSum);

        System.out.println("Скидка = " + discountSum  + "\nИтого = " + discountPrice);        

        System.out.println("\n3.Вывод слова JAVA\n"); 
        System.out.println("   J    a  v     v  a" + "\n   J   a a  v   v  a a\n" + 
                "J  J  aaaaa  V V  aaaaa\n" + " JJ  a     a  V  a     a" );

        System.out.println("\n4.Вывод min и max значений целых числовых типов");

        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807l; 

        System.out.println("maxByte = " + maxByte++ + "\nmaxByteI = "  + maxByte-- 
                +"\nmaxByteD = " + maxByte);
        System.out.println("maxShort = " + maxShort++ + "\nmaxShortI = " + maxShort-- 
                +"\nmaxShortD = " + maxShort);
        System.out.println("maxInt = " + maxInt++ + "\nmaxIntI = " + maxInt-- 
                +"\nmaxIntD = " + maxInt);
        System.out.println("maxLong = " + maxLong ++ + "\nmaxLongI = " + maxLong-- 
                +"\nnmaxLongD = " + maxLong);

        System.out.println("\n5.Перестановка значений переменных.");
        int a = 2;
        int b = 5;
        int c = a;
        System.out.println("\ni.С помощью третьей переменной\nИсходное значение\na = " 
                + a + "\nb = " + b);        
        a = b;
        b = c;
        System.out.println("Результат\na = " + a + "\nb = " + b);
        System.out.println("\nii.С помощью арифметических операций\nИсходное значение\na = " 
                + a + "\nb = " + b);
        a += b;
        b = a - b;
        a -= b;
        //a = a + b - (b = a); 
        System.out.println("Результат\na = " + a + "\nb = " + b);

        System.out.println("\niii.C помощью побитовой операции\nИсходное значение\na = " + a 
                + "\nb = " + b);
        a ^= b;
        b ^= a;
        a ^= b; 
        System.out.println("Результат\na = " + a + "\nb = " + b);

        System.out.println("\n6.Вывод символов и их кодов");
        char num35 = '#';
        char num38 = '&';
        char num64 = '@';
        char num94 = '^';
        char num95 = '_';
        System.out.println("Код = " + (int) num35 + " Символ = " + num35);
        System.out.println("Код = " + (int) num38 + " Символ = " + num38 + 
                "\nКод = " + (int) num64 + " Символ = " + num64); 
        System.out.println("Код = " + (int) num94 + " Символ = " + num94 + 
                "\nКод = " + (int) num95 + " Символ = " + num95); 

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка" );
        char slash = '/';     
        char backSlash = '\\';
        char underScore = '_';
        char leftParentheses  = '(';
        char rightParentheses = ')';        
        System.out.println("    " + slash + backSlash + "\n   " + slash + "  " + backSlash +
                "\n  " + slash + underScore + leftParentheses + " " + rightParentheses + backSlash +
                "\n " + slash + "      " + backSlash +
                 "\n" + slash + underScore + underScore + underScore + underScore + slash +
                backSlash + underScore + underScore + backSlash);

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа" );
        int number = 123;
        int numberHundreds = number/ 100; 
        int numberDecimals = number / 10 % 10; 
        int numberUnits = number % 10;
        System.out.println("Число N содержит: " + number + "\n" + numberHundreds + "-сотен");
        System.out.println(numberDecimals + "-десятков");
        System.out.println(numberUnits + "-единиц" );
        System.out.println("Сумма его цифр = " + (numberHundreds + numberDecimals + numberUnits) );
        System.out.println("Произведение = " + (numberHundreds  * numberDecimals * numberUnits));

        System.out.println("\n9.Вывод времени" );
        int time = 86399;
        System.out.println(time / 60 / 60 + ":" + time / 60 % 60 + ":" + time % 60 + "\n");
    }
}