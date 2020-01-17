public class TestClass {
    public static void main(String[] args) {
        SpecificSweetBox box = new SpecificSweetBox();

        box.removeByIndex(1); //Тесты на невалидные запросы
        box.removeLast();

        box.add(new Lollipop("red"));
        box.add(new Lollipop("green"));
        box.add(new Chocolate(45));
        box.add(new MAndMs(true));

        box.printInfo();
        box.printWeight();
        box.printPrice();

        box.reduceWeight(0.41);
        box.reducePrice(3.9);
        System.out.println();
        box.printInfo();
    }
}
