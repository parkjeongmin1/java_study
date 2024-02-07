package ch03.sec01;

public class IncDecOperEnxample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        //값 자체는 전위, 후위상관없이 증가와 감소를 한다.
        x++;
        System.out.println("x=" + x);
        ++x;
        System.out.println("x=" + x);

        y--;
        System.out.println("y=" + y);
        --y;
        System.out.println("y=" + y);

        System.out.println("==========================");

        
        //선대입 후 증가
        z = x++;
        System.out.println("z=" +z);
        System.out.println("x=" +x);

        z = ++x;
        System.out.println("z=" +z);
        System.out.println("x=" +x);

        z = ++x + y++;

        System.out.println("z=" + z);
    }
}
