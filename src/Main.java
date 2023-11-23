// homework 7
public class Main {
    public static void main(String[] args) {
        // Task 1
        int a = 25;
        int b = 37;
        int c = 28;

        System.out.println("Наименьшее значение: " + getMinNumber(a, b, c));
        System.out.println("...............");

        // Task 2
        int x = 25;
        int y = 45;
        int z = 65;

        System.out.println("Среднее значение: " + getAverageValue(x, y, z));
        System.out.println("...............");

        // Task 3
        String str = "DarTech123";

        System.out.println("Количество гласных в строке: " + countVowels(str));
        System.out.println("...............");

        // Task 4
        String s = "Java is good to learn Object Oriented programming";

        System.out.println("Количество слов в строке: " + countWords(s));
        System.out.println("...............");

        // Task 5
        int r = 1254212;
        int f = 2;

        System.out.println(findNumber(r, f));
        System.out.println("...............");

        // Task 6
        String strVowels = "AIEEE";

        System.out.println(checkAllVowels(strVowels));
        System.out.println("...............");

        // Task 7
        int side = 5;
        double l = 6;

        System.out.println(getPentagonArea(l, side));
        System.out.println("...............");

        // Task 8
        int digit = 252;

        System.out.println(getSumOfDigits(digit));
        System.out.println("...............");

        // Task 1 add 1
        int[] arr = {5, 9, 7, 2, 4, 8};

        System.out.println(findMax(arr));
        System.out.println("...............");

        // Task 2 add 1
        int sec = 3601;

        System.out.println(timeToString(sec));
        System.out.println("...............");

        // Task 3 add 1
        String strPalindrome = "trert";

        System.out.println(isPalindrome(strPalindrome));
        System.out.println("...............");

        // Task 4 add 1
        int n1 = 18;
        int n2 = 12;

        System.out.println(findGCD(n1, n2));
        System.out.println("...............");

        // Task 5 add 1
        int[] intArray = {5, 2, 6, 8, 3};
        double[] doubleArray = {5.4, 1.2, 9.1, 7.9, 6.6};
        char[] charArray = {'f', 'c', 'w', 'u', 'z'};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
        System.out.println("...............");

        // Task 6 add 1
        int year = 2023;
        int month = 2;

        System.out.println(getDaysInMonth(month, year));
        System.out.println("...............");

        // Task 7 add 1
        double x1 = 2;
        double y1 = 5;
        double x2 = 5;
        double y2 = 2;

        System.out.println(calculateDistance(x1, y1, x2, y2));
        System.out.println("...............");

        // Task 1 add 2
        int n = 10;

        System.out.println(recursionFucn(n));
        System.out.println("...............");

        // Task 2 add 2
        int k = 6;

        System.out.println(fib(k));
        System.out.println("...............");

        // Task 3 add 2
        int d = 5;
        int m = 5;

        System.out.println(pow(d, m));
        System.out.println("...............");

        // Task 4 add 2
        int[] array = {5, 8, 3, 5, 6, 9, 4};
        int index = 0;

        System.out.println(findMax(array, index));
        System.out.println("...............");

        // Task 5 add 2
        int[] myArray = {5, 6, 8};
        int length = myArray.length;

        System.out.println(sumArray(myArray, length));
    }

    static int getMinNumber(int a, int b, int c) {
        int ret;
        ret = a > b ? b : a;
        ret = ret > c ? c : ret;
        return ret;
    }

    static double getAverageValue(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    static int countVowels(String s) {
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (s.charAt(i) == vowels[j]) {
                    count++;
                }
            }
        }

        return count;
    }

    static int countWords(String str) {
        int count = 0;

        if (str.length() != 0) {
            count++;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }

    static int findNumber(int numOrig, int numFind) {
        if (numFind < 0 || numFind > 9) {
            System.out.println("Цифра должна быть от 0 до 9");
        }
        String strOrig = String.valueOf(numOrig);
        char charFind = Integer.toString(numFind).charAt(0);
        int count = 0;

        for (int i = 0; i < strOrig.length(); i++) {
            if (strOrig.charAt(i) == charFind) {
                count++;
            }
        }
        return count;
    }

    static boolean checkAllVowels(String s) {
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                //System.out.println(j);
                if (s.charAt(i) == vowels[j]) {
                    count++;
                }
            }
        }
        return count == s.length();
    }

    static double getPentagonArea(double a, int n) {
        return (n * (a * a)) / (4 * Math.tan(Math.PI / n));
    }

    static int getSumOfDigits(int digit) {
        int sum = 0;

        for (int i = 0; i < digit; digit /= 10) {
            sum += (digit % 10);
        }
        return sum;
    }

    static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static String timeToString(int sec) {
        long hour = sec / 3600;
        long min = sec / 60 % 60;
        long s = sec / 1 % 60;

        return String.format("%02d:%02d:%02d", hour, min, s);
    }

    static boolean isPalindrome(String str) {
        String revStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }

        return str.equals(revStr);
    }

    static int findGCD(int n1, int n2) {
        int gcd = 0;

        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static int getDaysInMonth(int month, int year) {
        int daysInMonth;
        boolean leap = false;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            leap = true;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        } else {
            if (month == 2) {
                daysInMonth = leap ? 29 : 28;
            } else {
                daysInMonth = 31;
            }
        }
        return daysInMonth;
    }

    static double calculateDistance(double x1, double y1, double x2, double y2) {
        double a = (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return Math.sqrt(a);
    }

    static String recursionFucn(int n) {

        if (n <= 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        }

        return recursionFucn(n - 1) + " " + n;
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public static int pow(int x, int n)
    {
        if (n==0) {
            return 1;
        }
        return pow(x,n-1) * x;
    }

    public static int findMax(int[] n, int max) {
        if (n.length > max) {
            int next = findMax(n, max + 1);
            return (n[max] > next) ? n[max] : next;
        } else {
            return n[0];
        }
    }

    static int sumArray(int[] array,int lenghAr){
        if (lenghAr <= 0) {
            return 0;
        } else {
            int numberSum = array[lenghAr-1];
            return numberSum +  sumArray(array, lenghAr - 1);
        }
    }
}

