package ch08.sec07;

public class ServiceExample {
    public static void main(String[] args) {
        Service service = new ServiceImpl();
        service.defaltMethod1();
        System.out.println();

        service.defaltMethod2();
        System.out.println();

        Service.staticMethod1();
        System.out.println();

        Service.staticMethod2();

    }

}
