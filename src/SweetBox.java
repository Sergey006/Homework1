public interface SweetBox {
    void add(Sweet sweet);
    void removeByIndex(int index);
    void removeLast();
    void printWeight();
    void printPrice();
    void printInfo();
    void reducePrice(double price);
    void reduceWeight(double weight);
}
