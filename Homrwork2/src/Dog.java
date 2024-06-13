public class Dog extends Animal{
    private static int dogCount = 0;
    private static final int maxRunDist = 500;
    private static final int maxSwimDist = 10;

    public Dog(String name){
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDist){
            System.out.println(name + " пробежал " + distance + " метров");
        } else {
            System.out.println(name + " не может пробежать " + distance + " метров");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDist){
            System.out.println(name + " проплыл " + distance + " метров");
        } else {
            System.out.println(name + " не может проплыть " + distance + " метров");
        }
    }

    public static int getDogCount(){
        return dogCount;
    }
}
