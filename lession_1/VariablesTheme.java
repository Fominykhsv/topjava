public class VariablesTheme{    
    public static void main(String[] args)  {
        System.out.println("\n1.Вывод значений переменных на консоль");
        byte  core = 4;
        short sizeram = 15;
        int   countLogCpu = 8;
        long countHdd = 4l;
        float freqCpu = 2675.4864f;
        double freqRam = 1066.7777777765d;
        System.out.println("Ядер ЦП = " + core +"\nОбъём ОЗУ = " + sizeram + "\nКол.лог.ЦП = " 
                + countLogCpu + "\nКол.HDD = " + countHdd + "\nЧастота ЦП = " + freqCpu 
                + "\nЧастота ОЗУ = " + freqRam);  

        System.out.println("\n2.Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int book = 200;
        float discount = 0.11f;
        float sumDiscount;
        float sum;

            // сумма скидки
            sumDiscount  = ((pricePen + book)*discount);
            // Итоговая сумма
            sum = ((pricePen + book) - sumDiscount);
        System.out.println("Скидка = " + sumDiscount + "\nИтого = " + sum);        
       
        System.out.println("\n3.Вывод слова JAVA\n\n" + "   J    a  v     v  a" 
                + "\n   J   a a  v   v  a a\n" + "J  J  aaaaa  V V  aaaaa\n" 
                + " JJ  a     a  V  a     a" );

        System.out.println("\n4.Вывод min и max значений целых числовых типов" );

        byte  maxByte = 127;
        short maxShort = 32767;
        int   maxInt = 2147483647;
        long  maxLong = 9223372036854775807l;
 

        System.out.println("maxByte = " +  maxByte);
        maxByte++;
        System.out.println("maxByteI = " +  maxByte);
        maxByte--;
        System.out.println("maxByteD = " +  maxByte);

        System.out.println("maxShort = " + maxShort);
        maxShort++;
        System.out.println("maxShortI = " + maxShort);
        maxShort--;
        System.out.println("maxShortD = " + maxShort);

        System.out.println("maxInt = " + maxInt);
        maxInt++;
        System.out.println("maxIntI = " + maxInt);
        maxInt--;
        System.out.println("maxIntD = " + maxInt);

        System.out.println("maxLong = " + maxLong);
        maxLong++;
        System.out.println("maxLongI = " + maxLong);
        maxLong--;
        System.out.println("maxLongD = " + maxLong);

        System.out.println("\n5.Перестановка значений переменных.");
        int a = 2;
        int b = 5;
        int c;
        System.out.println("\ni.С помощью третьей переменной\nИсходное значение\na = " + a 
                + "\nb = " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("\nРезультат\na = " + a + "\nb = " + b);

        System.out.println("\nii.С помощью арифметических операций\nИсходное значение\na = " 
                + a + "\nb = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        //a = a + b - (b = a); 
        System.out.println("Результат\na = " + a + "\nb = " + b);

        System.out.println("\niii.C помощью побитовой операции\nИсходное значение\na = " + a 
                + "\nb = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b; 
        System.out.println("Результат\na = " + a + "\nb = " + b);

        System.out.println("\n6.Вывод символов и их кодов" );
        char num35 = '#';
        char num38 = '&';
        char num64 = '@';
        char num94 = '^';
        char num95 = '_';
        System.out.println("Код = " + (int)num35 + " Символ = " +(char)num35);
        System.out.println("Код = " + (int)num38 + " Символ = " + (char)num38 + "\nКод = " 
                + (int)num64 + " Символ = " + (char)num64); 
        System.out.println("Код = " + (int)num94 + " Символ = " + (char)num94 + "\nКод = " 
                + (int)num95 + " Символ = " + (char)num95); 

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка" );
        char sl = '/';     
        char osl = '\\';
        char pod = '_';
        char sk  = '(';
        char osk = ')';        
        System.out.println("    "+ sl + osl + "\n   " + sl + "  " + osl 
                + "\n  " + sl + pod + sk + " " + osk + osl
                + "\n " + sl + "      " + osl
                + "\n" + sl + pod +pod +pod +pod + sl + osl + pod + pod + osl);

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа" );
        int n = 123;
        System.out.println("Число N содержит: " + n + "\n" +n/ 100 +"-сотен");
        System.out.println(n / 10 % 10 + "-десятков");
        System.out.println(n % 10 + "-единиц" );
        System.out.println("Сумма его цифр = " + (n/ 100 + n / 10 % 10 + n % 10) );
        System.out.println("Произведение = " + ((n/ 100 )* (n / 10 % 10) * (n % 10)));

        System.out.println("\n9.Вывод времени" );
        int time =86399;
        System.out.println(time/60/60 + ":" + time/60%60 + ":" + time%60 + "\n");
    }
}