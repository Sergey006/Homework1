import java.sql.SQLOutput;
import java.util.ArrayList;

public class SpecificSweetBox implements SweetBox {
    private ArrayList<Sweet> sweets = new ArrayList<>();
    @Override
    public void add(Sweet sweet) {
        sweets.add(sweet);
    }

    @Override
    public void removeByIndex(int index) {
        if (index >= 0 && index < sweets.size()) {
            sweets.remove(index);
        } else {
            System.out.println("Нет элемента по введённому индексу");
        }
    }

    @Override
    public void removeLast() {
        if (sweets.size() > 0) {
            sweets.remove(sweets.size() - 1);
        } else {
            System.out.println("Действие невозможно - коробка пуста");
        }
    }

    @Override
    public void printWeight() {
        System.out.println("Weight of this sweetbox: " + getWeight() + " kg");
    }

    @Override
    public void printPrice() {
        System.out.println("Price of this sweetbox: " + getPrice() + " kg");
    }

    @Override
    public void printInfo() {
        for (Sweet sweet:sweets){
            System.out.println(sweet);
        }
    }

    private double getWeight() {
        double sum = 0;
        for (Sweet sweet:sweets){
            sum += sweet.getWeight();
        }
        return sum;
    }

    private double getPrice() {
        double sum = 0;
        for (Sweet sweet:sweets){
            sum += sweet.getPrice();
        }
        return sum;
    }

    @Override
    public void reduceWeight(double weight){
        while (getWeight() >= weight && sweets.size() > 0){
            Sweet minWeightSweet = sweets.get(0);
            for (Sweet sweet:sweets){
                if (sweet.getWeight() < minWeightSweet.getWeight()){
                    minWeightSweet = sweet;
                }
            }
            sweets.remove(minWeightSweet);
        }
    }

    @Override
    public void reducePrice(double price){
        while (getPrice() >= price && sweets.size() > 0){
            Sweet cheapestSweet = sweets.get(0);
            for (Sweet sweet:sweets){
                if (sweet.getPrice() < cheapestSweet.getPrice()){
                    cheapestSweet = sweet;
                }
            }
            sweets.remove(cheapestSweet);
        }
    }
}
