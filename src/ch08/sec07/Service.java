package ch08.sec07;

public interface Service {
    default void defaltMethod1(){
        System.out.println("defaultCommon1() 메소드");
        defaultCommon();
    }
    default void defaltMethod2(){
        System.out.println("defaultCommon2() 메소드");
        defaultCommon();
        
    }

    //인터페이스에 private 메소드 작성
    //인터페이스 안 다른 메소드에서 가져다 쓰기 위해 많이 사용

    private void defaultCommon(){
        System.out.println("defaultCommon");
    }
    
    //정적 메소드
    static void staticMethod1(){
        System.out.println("staticMethod1() 메소드");
        staticCommon();
    }
    static void staticMethod2(){
        System.out.println("staticMethod2() 메소드");
        staticCommon();
    }

    //인터페이스 안 다른 메소드에서 가져다 쓰기 위해 많이 사용(중복된 코드 줄임)
    //static메소드 안에서는 static메소드만 호출 가능하므로 static 키워드 사용
    private static void staticCommon(){
        System.out.println("staticCommon() 메소드");
    }
}
