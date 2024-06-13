public class Main {
    public static void main(String[] args) {

        Bowl bowl = new Bowl(50);

        Cat[] cats = {new Cat("Чернушка"), new Cat("Буся"), new Cat("Василий")};

        for (Cat cat : cats){
            cat.eat(bowl, 20);
        }

        for (Cat cat : cats){
            System.out.println(cat.name + " сыт: " + cat.isSatiety());
        }

        bowl.addFood(30);

        for (Cat cat : cats){
            if (!cat.isSatiety()){
                cat.eat(bowl, 20);
            }
        }

        for (Cat cat : cats){
            System.out.println(cat.name + " сыт: " + cat.isSatiety());
        }

        Dog dogSharik = new Dog("Шарик");
        dogSharik.run(200);
        dogSharik.swim(5);

        Cat catBeluga = new Cat("Белуга");
        catBeluga.run(150);
        catBeluga.swim(5);


        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
    }
}