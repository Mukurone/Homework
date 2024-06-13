public class Bowl {
    private int food;

    public Bowl(int food){
        this.food = food;
    }

    public int getFood(){
        return food;
    }

    public void decrFood(int amount){
        if (amount <= food){
            food -= amount;
        } else {
            food = 0;
        }
    }

    public void addFood(int amount){
        food += amount;
        System.out.println("В миску добавили " + amount + " еды, теперь в миске " + food + " еды");
    }
}
