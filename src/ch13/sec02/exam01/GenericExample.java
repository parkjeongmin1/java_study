package ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();
        product1.setKind(new Tv()); //K타입을 tv타입으로 지정했기 때문에 tv객체 set
        product1.setModel("스마트 Tv");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("SUV 자동차");
        String carModel = product2.getModel();
    }
}
