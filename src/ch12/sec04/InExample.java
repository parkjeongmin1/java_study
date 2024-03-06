package ch12.sec04;

import java.io.IOException;

public class InExample {
    public static void main(String[] args) throws IOException {
        int speed = 0;
        int keycode = 0;

        while (true){
            //enter키를 읽지 않았을때
            if (keycode != 13 && keycode != 10) {
                if (keycode == 49) speed++; //숫자 1키를 읽었을때
                else if (keycode == 50) speed--; //숫자 2키를 읽었을때
                else if (keycode == 51) break; // 숫자 3키를 읽었을떄
            }
            System.out.println("---------------");
            System.out.println("1.증속 | 2.감속 | 3.중지");
            System.out.println("---------------");
            System.out.println("현재속도: " + speed);
            System.out.println("선택: ");
            keycode = System.in.read(); // 키를 하나씩 읽음
        }

        System.out.println("프로그램 종료");
    }
}
