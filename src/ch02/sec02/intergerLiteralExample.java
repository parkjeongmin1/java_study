package ch02.sec02;

public class intergerLiteralExample {
    public static void main(String[] args) {
        //2진수: 1011 (0b 를 앞에 붙여 사용)
        int var1 = 0b1011;
        System.out.println(var1);

        //8진수: 0~7 사이 숫자 (0 을 앞에 붙여 사용)
        int var2 = 0206;
        System.out.println(var2);

        //16진수: 0~9 사이 숫자, a~f 까지 문자 (0x를 앞에 붙여 사용)
        int var3 = 0xB3;
        System.out.println(var3);
    }
}
