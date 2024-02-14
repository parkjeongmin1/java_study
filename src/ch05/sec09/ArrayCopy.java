package ch05.sec09;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] oldIntArray = {1, 2, 3};
        //oldIntArray[3] = 4; //에러발생

        int[] newIntArray = new int[5];

        //배열 항목 복사
        for (int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }

        //배열 항목 출력
        newIntArray[3] = 4;
        for (int i = 0; i < oldIntArray.length; i++) {
            System.out.println(newIntArray[i]);
        }
    }
}
