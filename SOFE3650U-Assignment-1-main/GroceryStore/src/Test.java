public class Test {
    public static void main(String[] args) {
        RedProduceFactory redfactory = new RedProduceFactory();
        YellowProduceFactory yellowfactory = new YellowProduceFactory();

        Fruit apple1 = redfactory.createFruit();
        System.out.println(apple1.getPrice());

        Vegetable redpepper1 = redfactory.createVegetable();
        System.out.println(redpepper1.getPrice());

        Fruit banana1 = yellowfactory.createFruit();
        System.out.println(banana1.getPrice());

        Fruit banana2 = yellowfactory.createFruit();
        System.out.println(banana2.getPrice());

    }
}
