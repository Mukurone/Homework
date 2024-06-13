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



        Shape circle = new Circle(5, "red", "black");
        Shape rectangle = new Rectangle(2, 3, "red", "black;");
        Shape triangle = new Triangle(1, 2, 3, "red", "black");

        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);

    }

    public static void printShapeInfo(Shape shape){
        if (shape instanceof Color){
            Color color = (Color) shape;
            System.out.println("Периметр: " + shape.getPerimeter());
            System.out.println("Площадь: " + shape.getArea());
            System.out.println("Цвет заливки: " + color.getFillColor());
            System.out.println("Цвет границы: " + color.getBorderColor());
            System.out.println();
        }
    }
}