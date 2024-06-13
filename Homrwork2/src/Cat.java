public class Cat extends Animal{
    private static int catCount = 0;
    private static final int maxRunDist = 200;
    private boolean satiety;

    public Cat(String name){
        super(name);
        catCount++;
        this.satiety = false;
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
        System.out.println(name + " не умеет плавать");
    }

    public void eat(Bowl bowl, int amount){
        if (bowl.getFood() >= amount){
            bowl.decrFood(amount);
            this.satiety = true;
            System.out.println(name + " покушал и сытый");
        } else {
            System.out.println(name + " не хватило еды");
        }
    }

    public boolean isSatiety(){
        return satiety;
    }

    public static int getCatCount(){
        return catCount;
    }
}
