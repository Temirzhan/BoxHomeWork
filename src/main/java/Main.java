public class Main {
    public static void main(String[] args) {
        Box<Apple> firstBox = new Box<>(new Apple());
        Box<Orange> secondBox = new Box<>(new Orange());
        Apple a = new Apple();
        System.out.println(firstBox.compare(secondBox));

           secondBox.addFruit(secondBox);



    }
}
