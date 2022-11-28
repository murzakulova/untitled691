public class Main {

    public static void main(String[] args) {
        //Dog
        Dog dog = new Dog();
        dog.setName("Лайка");
        dog.setAge(2);
        dog.setColor("черный");
        dog.run();
        System.out.println(dog.getName() + "\n" + dog.getAge() + "\n" + dog.getColor());
        //Parrot
        Parrot parrot = new Parrot();
        parrot.setColor("синий");
        parrot.setName("Куку");
        parrot.repeater();
        System.out.println(parrot.getName() + "\n" + parrot.getColor());
        //Cat
        Cat cat = new Cat();
        cat.setName("Мурька");
        cat.setAge(1);
        cat.setColor("белый");
        cat.fish();
        System.out.println(cat.getName() + "\n" + cat.getAge() + "\n" + cat.getColor());
        //Fish
        Fish fish = new Fish();
        fish.setName("сом");
        fish.setColor("черный");
        fish.water();
        System.out.println(fish.getName() + "\n" + fish.getColor());

    }
}