package util;

public class RandomSixDigitNumber {
    public int getSixDigitNumber() {
        return (int)(Math.random() * 900000) + 100000;
    }
}
