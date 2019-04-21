package ucode.lectia3.codingbat;

public class Codingbat {
    public static void main(String args[]) {
        Codingbat codingbat = new Codingbat();
        int vv = codingbat.sumDouble(2, 6);
        vv = codingbat.diff21(19);
        boolean x = codingbat.hasTeen(15,7,4);
        x = codingbat.sleepIn(false, true);
        x = codingbat.monkeyTrouble(true, true);
        x = codingbat.makes10(8,6);
        x = codingbat.posNeg(6, 3, false);
        codingbat.makeAbba("Hey", "Be");
        x = codingbat.endsLy("ly");
        codingbat.middleThree("roe") ;
        codingbat.atFirst("Da");
        codingbat.middleTwo("DKart");
        codingbat.extraEnd("aeg");
        x = codingbat.cigarParty(8, true);
        x = codingbat.answerCell(true, false, true);
        vv = codingbat.greenTicket(6,3,3);
        vv = codingbat.caughtSpeeding(80, false);
        vv = codingbat.redTicket(7,7, 8);
        int[] a = new int[]{4, 6, 8};
        int [] b = new int[] {5, 6};
        int [] c = new int [2] ;
        c = codingbat.middleWay(a, b);

        codingbat.withouEnd2("ADcLyr");
        codingbat.theEnd("Adc", true );
    }

    //    https://codingbat.com/prob/p154485
//    Given two int values, return their sum. Unless the two values are the same,
//    then return double their sum.
/*Expected	Run
sumDouble(1, 2) → 3	3	OK
sumDouble(3, 2) → 5	5	OK
sumDouble(2, 2) → 8	8	OK
sumDouble(-1, 0) → -1	-1	OK
sumDouble(3, 3) → 12	12	OK
sumDouble(0, 0) → 0	0	OK
sumDouble(0, 1) → 1	1	OK
sumDouble(3, 4) → 7	7	OK
*/
    public int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {

            return sum = sum * 2;
        }
        return sum;
    }

//https://codingbat.com/prob/p116624
//Given an int n, return the absolute difference between n and 21,
// except return double the absolute difference if n is over 21.

    public int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        }
        return (n - 21);
    }
//    https://codingbat.com/prob/p178986
//    We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values,
//    return true if 1 or more of them are teen.
/*Expected	Run
hasTeen(13, 20, 10) → true	true	OK
hasTeen(20, 19, 10) → true	true	OK
hasTeen(20, 10, 13) → true	true	OK
hasTeen(1, 20, 12) → false	false	OK
hasTeen(19, 20, 12) → true	true	OK
hasTeen(12, 20, 19) → true	true	OK
hasTeen(12, 9, 20) → false	false	OK
hasTeen(12, 18, 20) → true	true	OK
hasTeen(14, 2, 20) → true	true	OK
hasTeen(4, 2, 20) → false	false	OK
hasTeen(11, 22, 22) → false	false	OK
*/

    public boolean hasTeen(int a, int b, int c) {
        return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19));
    }
//   https://codingbat.com/prob/p187868
/*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
 We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

 Expected	Run
sleepIn(false, false) → true	true	OK
sleepIn(true, false) → false	false	OK
sleepIn(false, true) → true	true	OK
sleepIn(true, true) → true	true	OK
*/

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return ((!weekday) || vacation);

    }

    //    https://codingbat.com/prob/p181646
    /*We have two monkeys, a and b, and the parameters aSmile and bSmile
     *indicate if each is smiling. We are in trouble if they are both smiling or
     *if neither of them is smiling. Return true if we are in trouble.
     * Expected	Run
     *monkeyTrouble(true, true) → true	true	OK
     *monkeyTrouble(false, false) → true	true	OK
     *monkeyTrouble(true, false) → false	false	OK
     *monkeyTrouble(false, true) → false	false	OK
     * Initial faceam asa ((aSmile && bSmile) || !(aSmile && bSmile)), am corectat incercand
     * la intamplare mai multe variante.

     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return ((aSmile && bSmile) || (!aSmile && !bSmile));
    }

    //    https://codingbat.com/prob/p182873
//    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    /*
    * Expected	Run
makes10(9, 10) → true	true	OK
makes10(9, 9) → false	false	OK
makes10(1, 9) → true	true	OK
makes10(10, 1) → true	true	OK
makes10(10, 10) → true	true	OK
makes10(8, 2) → true	true	OK
makes10(8, 3) → false	false	OK
makes10(10, 42) → true	true	OK
makes10(12, -2) → true	true	OK
*/
    public boolean makes10(int a, int b) {
        int sum = a + b;
        return (a == 10 || b == 10 || sum == 10);
    }

    //https://codingbat.com/prob/p159227
    /*Given 2 int values, return true if one is negative and one is positive.
     *Except if the parameter "negative" is true, then return true only if both are negative.
     * Expected	Run
     *posNeg(1, -1, false) → true	true	OK
     *posNeg(-1, 1, false) → true	true	OK
     *posNeg(-4, -5, true) → true	true	OK
     *posNeg(-4, -5, false) → false	true	X
     *posNeg(-4, 5, false) → true	true	OK
     *posNeg(-4, 5, true) → false	true	X
     *posNeg(1, 1, false) → false	false	OK
     *posNeg(-1, -1, false) → false	true	X
     *posNeg(1, -1, true) → false	true	X
     *posNeg(-1, 1, true) → false	true	X
     *posNeg(1, 1, true) → false	false	OK
     *posNeg(-1, -1, true) → true	true	OK
     *posNeg(5, -5, false) → true	true	OK
     *posNeg(-6, 6, false) → true	true	OK
     *posNeg(-5, -6, false) → false	true	X
     *posNeg(-2, -1, false) → false	true	X
     *posNeg(1, 2, false) → false	false	OK
     *posNeg(-5, 6, true) → false	true	X
     *posNeg(-5, -5, true) → true	true	OK

     */
    public boolean posNeg(int a, int b, boolean negative) {
        if ((a >= 0 && b < 0) || a < 0 && b >= 0) {
            return true;
        }
        if (a < 0 && b < 0) {
            return true;
        } else {
            return false;
        }
    }

    public String makeAbba(String a, String b) {
        return (a.concat(b).concat(b).concat(a));
    }

    //https://codingbat.com/prob/p191914
//Given a string, return a new string where "not " has been added to the front. However,
// if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings./*Expected	Run
    /*notString("candy") → "not candy"	"not candy"	OK
     *notString("x") → "not x"	"not x"	OK
     *notString("not bad") → "not bad"	"not bad"	OK
     *notString("bad") → "not bad"	"not bad"	OK
     *notString("not") → "not"	"not"	OK
     *notString("is not") → "not is not"	"not is not"	OK
     *notString("no") → "not no"	"not no"	OK
     */
//   https://codingbat.com/prob/p103895
// Given a string, return true if it ends in "ly".
    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }
//https://codingbat.com/prob/p115863

// Given a string of odd length, return the string length 3 from its middle,
// so "Candy" yields "and". The string length will be at least 3.
// Problem[ rezolvata de mine, dar cu sugestii in ce priveste algoritmul


    public String middleThree(String str) {
        int n = str.length();
        int i = ((n - 3) / 2);
        str = str.substring(i, i + 3);
        return str;

    }

    //    https://codingbat.com/prob/p139076
//Given a string, return a string length 2 made of its first 2 chars.
// If the string length is less than 2, use '@' for the missing chars.
//    Am scris singura codul si eram tare mandra de mine.
//    isEmpty e sugestia sotului spre sfarsit, cand i-am arata mandra ce am facut
    public String atFirst(String str) {

        if (str.length() == 1) {
            return str.concat("@");
        }
        if (str.length() == 0 || str.isEmpty()) {
            return str.concat("@@");
        }
        str = str.substring(0, 2);

        return str;


    }

    //    Given a string of even length, return a string made of the middle two chars,
//    so the string "string" yields "ri". The string length will be at least 2.
//    https://codingbat.com/prob/p137729
    public String middleTwo(String str) {
        int n = str.length();
        int i = (n - 2) / 2;
        str = str.substring(i, i + 2);
        return str;
    }

    //    https://codingbat.com/prob/p108853
//Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
// The string length will be at least 2.
    public String extraEnd(String str) {
        str = str.substring(str.length() - 2);
        return (str.concat(str).concat(str));
    }

    //    https://codingbat.com/prob/p159531
    /*When squirrels get together for a party, they like to have cigars. A squirrel party is successful when
     *the number of cigars is between 40 and 60, inclusive. Unless it is the weekend,
     *in which case there is no upper bound on the number of cigars. Return true if the party with
     * the given values is successful, or false otherwise.*/

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40) {
            return true;
        } else {
            return ((cigars >= 40 && cigars <= 60));
        }
    }

    //    https://codingbat.com/prob/p110973
/*Your cell phone rings. Return true if you should answer it. Normally you answer,
 except in the morning you only answer if it is your mom calling. In all cases,
 if you are asleep, you do not answer.*/
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep || (isMorning && !isMom)) {
            return false;
        } else {
            return true;
        }
    }
//    https://codingbat.com/prob/p120633
    /*You have a green lottery ticket, with ints a, b, and c on it.
     *If the numbers are all different from each other, the result is 0.
     *If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.
     */


    public int greenTicket(int a, int b, int c) {
        if (a != b && b != c && c != a) {
            return 0;
        }
        if (a == b && b == c) {
            return 20;
        }
        if ((a == b && b != c) || (a != b && b == c) || (a == c && a != b)) {
            return 10;
        } else {
            return -1;
        }
    }

    //    https://codingbat.com/prob/p157733
    /*You are driving a little too fast, and a police officer stops you.
     Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket,
     2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1.
     If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day,
     your speed can be 5 high er in all cases.
*/
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            return speed - 5;
        }
        if (speed <= 60) {
            return 0;
        }
        if (speed > 60 && speed <= 80) {
            return 1;
        }
        if (speed >= 81) {
            return 2;
        } else {
            return -1;
        }
    }

    //https://codingbat.com/prob/p170833
    /*You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2.
     *If they are all the value 2, the result is 10. Otherwise if they are all the same,
     *the result is 5. Otherwise so long as both b and c are different from a, the result is 1.
     *Otherwise the result is 0.
     */
    public int redTicket(int a, int b, int c) {
        if (a == b && b == c && a == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a != b && c != a) {
            return 1;
        } else {
            return 0;
        }

    }


    public int[] middleWay(int[] a, int[] b) {
        int[] c = new int[]{a[1], b[1]};
        return c;
    }

    //https://codingbat.com/prob/p175689
//Given an int array length 2, return true if it does not contain a 2 or 3.
    public boolean no23(int[] nums) {
        if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) {
            return false;
        } else {
            return true;
        }
    }


    /* public boolean stringE(String str) {

        if(str.charAt(0) == 'e' || str.charAt(1) == 'e' || str.charAt(2) == 'e'  ){
            return true;
        }else{
            return false;
        }
    }
*/
    public String withouEnd2(String str) {

        return str.substring(1, str.length() - 1);


    }

    public String theEnd(String str, boolean front) {
        int n = str.length() - 1;
        str = str.substring(0, 1);

        if (str.startsWith("H")) {
            return str;
        } else {
            return str.substring(n);
        }
    }
}










