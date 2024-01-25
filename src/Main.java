public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal is sleeping");
        System.out.println(animal.isSleeping);

        Dog dog = new Dog("Dog is sleeping");
        System.out.println(dog.isSleeping);
    }
}
