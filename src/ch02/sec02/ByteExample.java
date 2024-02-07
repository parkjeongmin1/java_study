package ch02.sec02;

public class ByteExample {
    public static void main(String[] args) {
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
//        byte var6 = 128; byte 타입의 그릇의 크기가 127까지기 때문에 오류가 뜸.
//        2진수: 1000 0000  => 맨 앞자리는 부호를 나타내므로 128이 byte에 담기지 않음.

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);

    }
}
