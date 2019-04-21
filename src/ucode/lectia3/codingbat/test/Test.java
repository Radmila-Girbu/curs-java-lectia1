package ucode.lectia3.codingbat.test;

import java.time.format.TextStyle;

public class Test {
    public static void main(String[] args) {


    }
    public String withoutX(String str) {
        if (str.startsWith("x") ){
            return str.substring(1) ;
        }
        if(str.endsWith("x")) {
            return str.substring(0, str.length() - 1);

        }else{
                return str;
            }

    }
//    You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
public int caughtSpeeding(int speed, boolean isBirthday) {
    if(isBirthday){
        speed = speed -5;
    }
    if( speed <= 60 ) {
        return 0;
    }else if  (speed > 60 && speed <= 80 ) {
        return 1;
    } else{
        return 2;
    }
}
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
//https://codingbat.com/prob/p140272
                }
    }






