package ch07.sec07.exam01;

class A {}

class B extends A{}

class C extends A {}

class D extends B {}

class E extends C {}

public class PromotionExample {
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();

    //자동타입변환
    A a1 = b;
    A a2 = c;
    A a3 = d;
    A a4 = e;

    B b1 = d;
    C c1 = e;
    
//    B b3 = e;  직접 상속과는 전혀 관계없는 코드라 에러
//    C c2 = d;
    
}
