package ucode.lectia4;

public class Codingbat2 {
    public static void main(String[] args) {
        Codingbat2 codingbat2 = new Codingbat2();
        boolean c;
        c = codingbat2.love6(2, 8);
        c = codingbat2.more20(10);
        c = codingbat2.nearTen(7);
        int x;
        x = codingbat2.teaParty(8, 6);
        c = codingbat2.twoAsOne(6, 9, 1);
        c = codingbat2.lastDigit(3, 2, 5);
        x = codingbat2.maxMod5(5, 3);
        x = codingbat2.blueTicket(6, 7, 3);
        x = codingbat2.dateFashion(2, 10);
        x = codingbat2.sortaSum(8, 12);
        c = codingbat2.in1To10(6, true);
        c = codingbat2.old35(31);
        x = codingbat2.teenSum(5, 8);
        codingbat2.fizzString("brad");
        c = codingbat2.inOrder(9, 6, 3, true);
        c = codingbat2.lessBy10(7, 1, 4);
        c = codingbat2.squirrelPlay(92, false);
        codingbat2.alarmClock(4, true);
    }

    //    https://codingbat.com/prob/p137742
    /*
     *The number 6 is a truly great number. Given two int values, a and b,
     *return true if either one is 6. Or if their sum or difference is 6.
     *Note: the function Math.abs(num) computes the absolute value of a number.
     */
//    Nu am reusit sa rezolv problema prin Math.abs(num)
    public boolean love6(int a, int b) {
        if (a == 6 || b == 6 || a + b == 6 || a - b == 6 || b - a == 6) {
            return true;
        } else {
            return false;
        }
    }

    //    https://codingbat.com/prob/p118290
    /*Return true if the given non-negative number is 1 or 2 more than a multiple of 20.*/
    public boolean more20(int n) {
        if (n % 20 == 1 || n % 20 == 2) {
            return true;
        } else {
            return false;
        }
    }

    //    https://codingbat.com/prob/p193613
    /*Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
     */

    public boolean nearTen(int num) {
        if (num % 10 <= 2 || num % 10 >= 8) {
            return true;
        } else {
            return false;
        }
    }

    //    https://codingbat.com/prob/p177181
    /*We are having a party with amounts of tea and candy.
     *Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great.
     * A party is good (1) if both tea and candy are at least 5.
     *However, if either tea or candy is at least double the amount of the other one, the party is great (2).
     *However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
     */
//    teaParty(20, 6) → 2	1	X
    public int teaParty(int tea, int candy) {
        if ((tea >= 5 && candy >= 5) && (tea >= candy * 2 || candy >= tea * 2)) {
            return 2;
        }
        if (tea >= 5 && candy >= 5) {
            return 1;
        }
        if (tea < 5 || candy < 5) {
            return 0;
        } else {
            return -1;
        }
    }

    //    https://codingbat.com/prob/p113261
    /*Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
     */
    public boolean twoAsOne(int a, int b, int c) {
        if (a + b == c || a + c == b || b + c == a) {
            return true;
        } else {
            return false;
        }
    }

    //    https://codingbat.com/prob/p169213
    /*Given three ints, a b c, return true if two or more of them have the same rightmost digit.
     *The ints are non-negative.
     */
    public boolean lastDigit(int a, int b, int c) {
        if (a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10) {
            return true;
        } else {
            return false;
        }
    }

    //https://codingbat.com/prob/p115384
    /*Given two int values, return whichever value is larger.
     *However if the two values have the same remainder when divided by 5,
     *then the return the smaller value. However, in all cases,
     *if the two values are the same, return 0.
     */
    public int maxMod5(int a, int b) {
        if ((a < b) && !(a % 5 == b % 5)) {
            return b;
        }
        if ((a > b) && !(a % 5 == b % 5)) {
            return a;
        } else if ((a % 5 == b % 5) && a > b) {
            return b;
        } else if ((a % 5 == b % 5) && a < b) {
            return a;
        }
        if (a == b) {
            return 0;
        } else {
            return -1;
        }
    }

    //https://codingbat.com/prob/p192267
    /*You have a blue lottery ticket, with ints a, b, and c on it.
     *This makes three pairs, which we'll call ab, bc, and ac.
     *Consider the sum of the numbers in each pair. If any pair sums to exactly 10,
     *the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums,
     *the result is 5. Otherwise the result is 0.
     */
    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab == 10 || bc == 10 || ac == 10) {
            return 10;
        } else if (ab - 10 == bc || ab - 10 == ac) {
            return 5;
        } else {
            return 0;
        }
    }

    //    https://codingbat.com/prob/p103360
    /*You and your date are trying to get a table at a restaurant.
     *The parameter "you" is the stylishness of your clothes, in the range 0..10,
     *and "date" is the stylishness of your date's clothes.
     *The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
     *If either of you is very stylish, 8 or more, then the result is 2 (yes).
     *With the exception that if either of you has style of 2 or less, then the result is 0 (no).
     *Otherwise the result is 1 (maybe).
     */
    public int dateFashion(int you, int date) {
        if ((you >= 8 || date >= 8) && !(you <= 2 || date <= 2)) {
            return 2;
        } else if (you <= 2 || date <= 2) {
            return 0;
        } else {
            return 1;
        }
    }

    //    https://codingbat.com/prob/p183071
    /*Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive,
     *are forbidden, so in that case just return 20.
     */
    public int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) {
            return 20;
        } else {
            return a + b;
        }
    }

    //https://codingbat.com/prob/p137365
    /*Given a number n, return true if n is in the range 1..10, inclusive.
     *Unless outsideMode is true, in which case return true if the number is less or equal to 1,
     *or greater or equal to 10.
     */
    public boolean in1To10(int n, boolean outsideMode) {
        if (n >= 1 && n <= 10 && outsideMode == false) {
            return true;
        }
        if (outsideMode == true && (n <= 1 || n >= 10)) {
            return true;
        } else {
            return false;
        }
    }

    //    https://codingbat.com/prob/p159612
//    Return true if the given non-negative number is a multiple of 3 or 5, but not both.
    public boolean old35(int n) {
        if ((n % 3 == 0 || n % 5 == 0) && !(n % 3 == 0 && n % 5 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    //https://codingbat.com/prob/p178728
    /*Given 2 ints, a and b, return their sum. However,
     *"teen" values in the range 13..19 inclusive, are extra lucky.
     *So if either value is a teen, just return 19.
     */
    public int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            return a + b;
        }
    }

    //https://codingbat.com/prob/p137136
    /*Given a string str, if the string starts with "f" return "Fizz".
     *If the string ends with "b" return "Buzz".
     *If both the "f" and "b" conditions are true,
     * return "FizzBuzz". In all other cases, return the string unchanged.
     */
    public String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        }
        if (str.startsWith("f")) {
            return "Fizz";
        }
        if (str.endsWith("b")) {
            return "Buzz";
        } else {
            return str;
        }
    }

    //    https://codingbat.com/prob/p154188
    /*Given three ints, a b c, return true if b is greater than a, and c is greater than b.
     *However, with the exception that if "bOk" is true, b does not need to be greater than a.
     */
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (b > a && c > b) {
            return true;
        }
        if (bOk == true && c > b) {
            return true;
        } else {
            return false;
        }
    }

    //    https://codingbat.com/prob/p179196
//    Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
    public boolean lessBy10(int a, int b, int c) {
        if (a >= b + 10 || a >= c + 10 || b >= a + 10 || b >= c + 10 || c >= a + 10 || c >= b + 10) {
            return true;
        } else {
            return false;
        }
    }

    //    https://codingbat.com/prob/p141061
    /*
     *The squirrels in Palo Alto spend most of the day playing.
     *In particular, they play if the temperature is between 60 and 90 (inclusive).
     * Unless it is summer, then the upper limit is 100 instead of 90.
     *  Given an int temperature and a boolean isSummer,
     * return true if the squirrels play and false otherwise.
     */
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer == true && (temp >= 60 && temp <= 100)) {
            return true;
        }
        if (isSummer == false && (temp >= 60 && temp <= 90)) {
            return true;
        } else {
            return false;
        }
    }

    //    https://codingbat.com/prob/p160543
    /*
     *Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
     *and a boolean indicating if we are on vacation,
     *  return a string of the form "7:00" indicating when the alarm clock should ring.
     *  Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
     * Unless we are on vacation -- then on weekdays it should be "10:00"
     * and weekends it should be "off".
     */
    public String alarmClock(int day, boolean vacation) {
        if (vacation == true && (day > 0 && day < 6)) {
            return "10:00";
        }
        if (vacation == true && (day == 0 || day == 6)) {
            return "off";
        }
        if (day > 0 && day < 6 && vacation == false) {
            return "7:00";
        } else {
            return "10:00";
        }
    }

    //https://codingbat.com/prob/p100962
    /*   We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
     *Return true if the given non-negative number is special.
     */
    public boolean specialEleven(int n) {
        if (n % 11 == 0 || (n - 1) % 11 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //https://codingbat.com/prob/p115243
    /*Given an int n, return the string form of the number followed by "!".
     *So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number,
     *  and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5,
     *  use "FizzBuzz".
     */
    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz!";
        }
        if (n % 3 == 0) {
            return "Fizz!";
        }
        if (n % 5 == 0) {
            return "Buzz!";
        } else {
            return n + "!";
        }
    }
//    https://codingbat.com/prob/p142270

    /*Given a string and a non-negative int n,
     *return a larger string that is n copies of the original string.
     */
    public String stringTimes(String str, int n) {
        String strResult = "";
        for (int iterator = 0; iterator < n; iterator++) {
            strResult = strResult + str;
        }
        return strResult;
    }


}





