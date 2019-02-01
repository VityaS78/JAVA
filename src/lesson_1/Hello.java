package lesson_1;

public class Hello {

    byte aByte = 23;
    short aShort = 158;
    int anInt = 5548;
    long aLong = 1254785456225L;

    float aFloat = 22.55F;
    double aDouble = 3.145;

    boolean aBoolean = true;

    char aChar = 'd';

    String string = "Изучаем Java";




    public static void main(String[] args) {

        float res1 = result(5,56, 32,25);
        System.out.println(res1);


        if(gap1020(14, 21)) {
            System.out.println("Да");
        }else System.out.println("Нет");


        positiveNegative(-25);

        if (negative(25)) {
            System.out.println("отрицательное");
        }else System.out.println("положительное");


        hello ("Виктор");

        leapYear(2400);

        if(falseTrue(true, false)) {  //меняем значения переменных a и b,
            System.out.println("True");      //всегда получаем True
        }else System.out.println("False");   //False никогда. Доказано что выражение всегда True


        // ДЗ из HT-1/9 выражение (!(a < b) && !(a > b)) упрщается до a==b


        int x = 4;
        int y = 6;
        if(division(x,y)) {
            System.out.println("Деление без остатка!");
        } else  System.out.println("Деление с остатком!");

        if (trigon(25, 31, 8)) {
            System.out.println("Одно из чисел больше суммы двух других(не треугольник)");
        }else System.out.println("Ни одно из чисел не больше суммы двух других(треугольник!)");

        randomNumber(25,12);

        rollTheDice();


        sumSin(54.0);


        data(3, 25);

        threeNumEqually(5,5,5);

        gap0To1(-0.2145, 5.02154);


        rgbToCmyk(150,90,245);

    }


    public static float result(float a,float b, float c, float d) {
        float res = a*(b+(c/d));
        return res;
    }


    public static boolean gap1020(int a, int b) {
        return (a+b>=10 && a+b<=20);
    }


    public static void positiveNegative(int a) {
        if (a>=0){
            System.out.println("Данное число положительное!");
        } else System.out.println("Данное число отрицательное!");
    }


    public static boolean negative(int a) {
        return (a < 0);
    }



    public static void hello(String name) {
        System.out.println("Привет, "+name+" !");
    }



    public static void leapYear(int a) {
        if(a%400==0) {
            System.out.println("Год " + a + " высокосный!");
        }else if(a%100==0) {
            System.out.println("Год " + a+ " не высокосный!");
        }else if(a%4==0) {
            System.out.println("Год " + a+ " высокосный!");
        }else System.out.println("Год " + a+ " не высокосный!");
    }



    public static boolean falseTrue(boolean a, boolean b) {
        return ((!(a && b) && (a || b)) ||((a && b) || !(a || b)));
    }



    public static boolean division(int a, int b) {
        return (a%b==0 || b%a==0);
    }



    public static boolean trigon(int a, int b, int c) {
        if (a > b && a > c) {
            if (a > b + c) {
                return true;
            }
        }
        if (b > a && b > c) {
            if (b > a + c) {
                return true;
            }
        }
        if (c > b && a < c) {
            if (c > b + a) {
                return true;
            }
        }
        return false;
    }



    public static void randomNumber(int a, int b) {
        int max;
        if (a < b) {
            max = b;
            b = a;
            a = max;
        }
        int randomNum = b + (int)(Math.random()*(a-b+1));
        System.out.println("Случайное число в дипазоне от "+b+ " до "+a+ " = "+randomNum);
    }



    public  static void rollTheDice() {
        int sum = (1+(int)(Math.random()*6)) + (1+(int)(Math.random()*6));
        System.out.println("Выпало "+ sum);
    }


    public static void sumSin(double t) {
        double rad1 = Math.toRadians(2*t);
        double rad2 = Math.toRadians(3*t);
        System.out.format("Сумма синусов %.1f градусов и %.1f градусов равна %.4f%n", 2*t, 3*t, (Math.sin(rad1)+Math.sin(rad2)));
    }


    public static void data(int m, int d) {
        if (m < 3 && m > 6) {
            System.out.println("Введенная дата "+d+"."+m+" не лежит в заданном диапазоне от 20.03 до 20.06");
        }
        if ((m == 3 && d >= 20) || (m == 6 && d <= 20)) {
            System.out.println("Введенная дата "+d+"."+m+" лежит в заданном диапазоне от 20.03 до 20.06");
        }else System.out.println("Введенная дата "+d+"."+m+" не лежит в заданном диапазоне от 20.03 до 20.06");
    }


    public static void threeNumEqually(int a, int b, int c) {
        if (a == b && a == c) {
            System.out.println("Все три числа равны");
        } else System.out.println("Числа не равны");
    }

    public static void gap0To1(double x, double y) {
        if (x > 0 && x < 1 && y > 0 && y < 1) {
            System.out.println("Данные переменные лежат в пределах от 0 до 1");
        }else  if ((x > 0 && x < 1) || (y > 0 && y < 1)) {
            System.out.println("Одна из переменных лежит в пределах от 0 до 1");
        }else System.out.println("Данные переменные не лежат в пределах от 0 до 1");
    }

    private static void rgbToCmyk(double r,double g, double b) {
        double c = 1-r/255;
        double m = 1-g/255;
        double y = 1-b/255;
        double k = Math.min(c,(Math.min(m,y)));
        c = (c - k)/(1 - k);
        m = (m - k)/(1 - k);
        y = (y - k)/(1 - k);
        System.out.println("Данный цвет в формате RGB, в фщрмате CMYK выглядит следующим образом: ");
        System.out.println("R: "+ r+", G: "+g+", B: "+b+" = C: "+c+", M: "+m+", Y: "+y+", K: "+k);
    }
}

