package util;

public class RandomSixDigitNumber {
    public static int getSixDigitNumber() {
        return (int) (Math.random() * 900000) + 100000;
    }
}
