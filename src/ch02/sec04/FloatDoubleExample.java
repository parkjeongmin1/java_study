package ch02.sec04;

public class FloatDoubleExample {
    public static void main(String[] args) {
        //정밀도 (double > float)
        float var1 = 0.1234567890123456789F; //실수형의 기본 리터럴은 double 타입 이므로 뒤에 F를 붙여사용함
        double var2 = 0.1234567890123456789;

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);

        //가수와 지수 나눠서 작성하기
        double var3 = 3e6;   //3 X 10^6
        System.out.println("var3: " + var3);

        float var4 = 3e6F;
        System.out.println("var4: " + var4);
    }
}
