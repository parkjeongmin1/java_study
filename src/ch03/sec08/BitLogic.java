package ch03.sec08;
public class BitLogic {
    public static void main(String[] args) {
        System.out.println(45 & 25);
        System.out.println(45 | 25);
        System.out.println(45 ^ 25);
        System.out.println(~45);

        //실제로 136 이지만 java의 음수부호 때문에 10진수 변환시 -120으로 보임
        byte receiveData = -120; // 온도측정기에서 받은 데이터(가정)

        int unsignInt1 = receiveData & 255;
        System.out.println(unsignInt1);

        //java 에서 이러한 기능을 제공해주는 메소드가 존재함.

//        int unsignInt2 = byte.toUnsignedInt(receiveData);
//        System.out.println(unsignInt2);
    }
}
