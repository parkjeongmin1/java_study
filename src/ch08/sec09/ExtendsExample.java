package ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();

        InterfaceA ia = impl; //상속을 하지않아서 A만 나타낼수 있음.
        ia.methodA();
//        ia.methodB();
//        ia.methodC();

        InterfaceB ib = impl; //상속을 하지않아서 B만 나타낼수 있음.
//        ib.methodA();
        ib.methodB();
//        ib.methodC();

        InterfaceC ic = impl; //interface로 복수 상속을 하여 A,B,C를 나타낼수 있음.
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
