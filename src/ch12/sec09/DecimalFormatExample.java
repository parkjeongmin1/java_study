package ch12.sec09;

import java.text.DecimalFormat;

public class DecimalFormatExample {
    public static void main(String[] args) {
        double num = 12.3456789;
        DecimalFormat df;

        //정수 자리까지 표시
        df = new DecimalFormat("#,###");
        System.out.println(df.format(num));

        //소수 첫째자리까지 표시
        df = new DecimalFormat("#,###,0");
        System.out.println(df.format(num));
    }
}
