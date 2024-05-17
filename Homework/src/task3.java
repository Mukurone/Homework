public class task3 {
    public void printColor(){
        int value = 15;

        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100){
            System.out.println("Зеленый");
        }
    }
}
