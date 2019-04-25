package ucode.lectia4;

public class Codingbat {
    public static void main(String[] args) {
        Codingbat codingbat = new Codingbat();
        boolean c;
        c = codingbat.parrotTrouble(true, 6);
        c = codingbat.nearHundred(78);
        codingbat.missingChar("Adeovat", 3);
        codingbat.frontBack("adf");
        codingbat.front3("man");
        codingbat.backAround("ade");
        codingbat.front22("acf");
        boolean x;
        x = codingbat.icyHot(60, 3);
        x = codingbat.in1020(4, 6);
        codingbat.helloName("Roxana");
        codingbat.makeOutWord("<<>>", "fjdrg");
        codingbat.firstHalf("WooHolf");
        codingbat.nonStart("Trad", "gradbhf");
        codingbat.seeColor("Fericire");
        codingbat.withoutEnd("rabdare");
        codingbat.nTwice("narst", 2);
        codingbat.hasBad("Ariana");
        codingbat.conCat("iepure", "gaina");
        codingbat.frontAgain("ardeut");
        codingbat.without2("Sarbatoare");
        codingbat.withoutX("xxdax");
        codingbat.firstTwo("adevar");
        codingbat.comboString("Dan", "Laura");
        codingbat.right2("Laura");
        int[] a = new int[]{4, 6, 8};
        int[] b = new int[]{5, 6};
        x = codingbat.commonEnd(a, b);
        int[] nums = new int[]{6, 5, 3};
        x = codingbat.firstLast6(nums);
        nums = new int[]{0, 4, 6};
        nums = codingbat.reverse3(nums);
        nums = codingbat.middleWay(a, b);
        x = codingbat.no23(nums);
        a = codingbat.makeEnds(nums);

    }

    //    https://codingbat.com/prob/p140449
    /*We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
     *We are in trouble if the parrot is talking and the hour is before 7 or after 20.
     *Return true if we are in trouble.
     */
    public boolean parrotTrouble(boolean talking, int hour) {
        if ((hour < 7 || hour > 20) && talking) {
            return true;
        } else {
            return false;
        }
    }

    //    https://codingbat.com/prob/p184004
    /*Given an int n, return true if it is within 10 of 100 or 200.
     *Note: Math.abs(num) computes the absolute value of a number.
     */
    public boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }

    /* public String notString(String str) {
         String otherStr = "not";
         if(str.contains("not")){
             return "not" + " " + otherStr + str;
         }
         return otherStr + " " + str;
     }*/
//https://codingbat.com/prob/p190570
    /*Given a non-empty string and an int n, return a new string where the char at index n has been removed.
     *The value of n will be a valid index of a char in the original string
     *(i.e. n will be in the range 0..str.length()-1 inclusive).
     */
    public String missingChar(String str, int n) {
        return str.substring(0, n).concat(str.substring(n + 1, str.length() - 1));
    }

    //    https://codingbat.com/prob/p123384
    /*Given a string, return a new string where the first and last chars have been exchanged.*/
    public String frontBack(String str) {
        if (str.length() <= 1)
            return str;
        String a = str.substring(1, str.length() - 1);
        return str.charAt(str.length() - 1) + a + str.charAt(0);
    }

    //https://codingbat.com/prob/p136351
    /*Given a string, we'll say that the front is the first 3 chars of the string.
     *If the string length is less than 3, the front is whatever is there.
     *Return a new string which is 3 copies of the front.
     */
    public String front3(String str) {
        if (str.length() > 2) {
            return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
        } else {
            return str + str + str;
        }
    }

    //https://codingbat.com/prob/p161642
    /*Given a string, take the last char and return a new string with the last char added at the front and back,
     *so "cat" yields "tcatt". The original string will be length 1 or more.
     */
    public String backAround(String str) {
        return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
    }

    //    https://codingbat.com/prob/p112564
    /*
     *Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
     */
    public boolean or35(int n) {
        return ((n % 3) == 0 || (n % 5) == 0);
    }

    //https://codingbat.com/prob/p183592
    /*Given a string, take the first 2 chars and return the string
     *with the 2 chars added at both the front and back,
     * so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
     */
    public String front22(String str) {

        if (str.length() <= 2) {
            return str.concat(str).concat(str);
        } else {
            return str.substring(0, 2) + str + str.substring(0, 2);
        }
    }

    //    https://codingbat.com/prob/p19208/*
    /*Given two temperatures, return true if one is less than 0 and the other is greater than 100.*/
    public boolean icyHot(int temp1, int temp2) {
        if (((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0))) {
            return true;
        } else {
            return false;
        }
    }

    //    https://codingbat.com/prob/p144535
    /*Given 2 int values, return true if either of them is in the range 10..20 inclusive.*/
    public boolean in1020(int a, int b) {
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    //    https://codingbat.com/prob/p171896
    /*Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".*/
    public String helloName(String name) {
        return "Hello" + " ".concat(name).concat("!");
    }

    //    https://codingbat.com/prob/p184030
    /*Given an "out" string length 4, such as "<<>>", and a word,
     *return a new string where the word is in the middle of the out string, e.g. "<<word>>".
     *Note: use str.substring(i, j) to extract the String starting
     *at index i and going up to but not including index j.
     */
    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(out.length() - 2, out.length());
    }

    //    https://codingbat.com/prob/p172267
    /*Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".*/
    public String firstHalf(String str) {
        int n = str.length() / 2;

        return str.substring(0, n);
    }

    //    https://codingbat.com/prob/p143825
    /*Given 2 strings, return their concatenation, except omit the first char of each.
     *The strings will be at least length 1.
     */
    public String nonStart(String a, String b) {
        return a.substring(1).concat(b.substring(1));
    }

    //https://codingbat.com/prob/p199216
    /*Given a string, if the string begins with "red" or "blue" return that color string,
     *otherwise return the empty string.*/
    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }
        if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    //https://codingbat.com/prob/p130896
    /*Given a string, return a version without the first and last char,
     *so "Hello" yields "ell". The string length will be at least 2.
     */
    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    //    https://codingbat.com/prob/p174148
    /*Given a string and an int n, return a string made of the first
     *and last n chars from the string. The string length will be at least n.
     */
    public String nTwice(String str, int n) {
        return str.substring(0, n).concat(str.substring(str.length() - n));
    }

    //    https://codingbat.com/prob/p139075
    /*Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
     *such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
     */
    public boolean hasBad(String str) {
        if (str.length() <= 3 && !str.substring(0).equals("bad")) {
            return false;
        }
        if (str.startsWith("bad") || str.substring(1, 4).equals("bad")) {
            return true;
        } else {
            return false;
        }
    }

    //https://codingbat.com/prob/p132118
    /*Given two strings, append them together (known as "concatenation") and return the result.
     *However, if the concatenation creates a double-char, then omit one of the chars,
     *  so "abc" and "cat" yields "abcat".
     */
    public String conCat(String a, String b) {
        if (a.isEmpty()) {
            return b;
        }
        if (b.isEmpty()) {
            return a;
        }
        if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
            return a.substring(0, a.length() - 1).concat(b.substring(0));
        } else {
            return a.concat(b);
        }
    }

    //https://codingbat.com/prob/p196652
    /*Given a string, return true if the first 2 chars in the string also appear at the end of the string,
     *such as with "edited".
     */
    public boolean frontAgain(String str) {
        if (str.length() >= 2) {
            if (str.endsWith(str.substring(0, 2))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //    https://codingbat.com/prob/p142247
    /*Given a string, if a length 2 substring appears at both its beginning and end,
     *return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
     *The substring may overlap with itself, so "Hi" yields "".
     *Otherwise, return the original string unchanged
     */
    public String without2(String str) {
        if (str.length() == 2) {
            return "";
        }
        if (str.length() < 2) {
            return str;
        }
        if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
            return str.substring(2);
        } else {
            return str;
        }
    }
//    https://codingbat.com/prob/p151940
    /*Given a string, if the first or last chars are 'x',
     *return the string without those 'x' chars,
     *and otherwise return the string unchanged.
     */
//withoutX("x") → ""	StringIndexOutOfBoundsException: String index out of range: -1 (line:3)	X

    public String withoutX(String str) {
        if (str.startsWith("x") && str.endsWith("x")) {
            return str.substring(1, str.length() - 1);
        }
        if (str.equals("x")) {
            return "";
        }
        if (str.startsWith("x") && !str.endsWith("x")) {
            return str.substring(1, str.length());
        } else if (!str.startsWith("x") && str.endsWith("x")) {
            return str.substring(0, str.length() - 1);

        } else {
            return str;
        }
    }

    //    https://codingbat.com/prob/p163411
    /*Given a string, return the string made of its first two chars,
     *so the String "Hello" yields "He". If the string is shorter than length 2,
     *  return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
     */
    public String firstTwo(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return str.substring(0, 2);
        }
    }

    //    https://codingbat.com/prob/p168564
    /*Given 2 strings, a and b, return a string of the form short+long+short,
     *with the shorter string on the outside and the longer string on the inside.
     *  The strings will not be the same length, but they may be empty (length 0).
     */
    public String comboString(String a, String b) {
        if (a.isEmpty()) {
            return b;
        } else if (b.isEmpty()) {
            return a;
        }
        if (a.length() > b.length()) {
            return b.concat(a).concat(b);
        } else {
            return a.concat(b).concat(a);
        }
    }

    //https://codingbat.com/prob/p130781
    /*Given a string, return a "rotated right 2" version
     *where the last 2 chars are moved to the start. The string length will be at least 2.
     */
    public String right2(String str) {
        if (str.length() <= 2) {
            return str;
        } else {
            return str.substring(str.length() - 2).concat(str.substring(0, str.length() - 2));
        }
    }

    //https://codingbat.com/prob/p185685
    /*Given an array of ints, return true if 6 appears
     *as either the first or last element in the array. The array will be length 1 or more.
     */
    public boolean firstLast6(int[] nums) {
        int n = nums.length - 1;
        if (nums[0] == 6 || nums[n] == 6) {
            return true;
        } else {
            return false;
        }
    }

    //    https://codingbat.com/prob/p191991
    /*Given 2 arrays of ints, a and b, return true if they have the same first element
     *or they have the same last element. Both arrays will be length 1 or more.
     */
    public boolean commonEnd(int[] a, int[] b) {
        int l = a.length - 1;
        int n = b.length - 1;
        return a[0] == b[0] || a[l] == b[n];
    }

    //    https://codingbat.com/prob/p112409
    /*Given an array of ints length 3,
     *return a new array with the elements in reverse order,
     *so {1, 2, 3} becomes {3, 2, 1}.
     */
    public int[] reverse3(int[] nums) {
        nums = new int[]{nums[2], nums[1], nums[0]};
        return nums;
    }

    //    https://codingbat.com/prob/p146449
    /*Given 2 int arrays, a and b, each length 3,
     *return a new array length 2 containing their middle elements.
     */
    public int[] middleWay(int[] a, int[] b) {
        int[] newArray = new int[]{a[1], b[1]};
        return newArray;
    }

    //    https://codingbat.com/prob/p175689
    /*Given an int array length 2, return true if it does not contain a 2 or 3.
     */
    public boolean no23(int[] nums) {
        if ((nums[0] != 2) && (nums[1] != 2) && (nums[0] != 3) && (nums[1] != 3)) {
            return true;
        } else {
            return false;
        }
    }

    //https://codingbat.com/prob/p101230
    /*Given an array of ints, return a new array length 2 containing the first and last elements
     *from the original array. The original array will be length 1 or more.
     */
    public int[] makeEnds(int[] nums) {
        int n = nums.length - 1;
        nums = new int[]{nums[0], nums[n]};
        return nums;
    }
}





