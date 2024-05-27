public class Park {
    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price){
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public String getName(){
            return name;
        }

        public String getWorkingHours (){
            return workingHours;
        }

        public double getPrice(){
            return price;
        }

        public void informationDisplay(){
            System.out.println("Аттракцион " + name);
            System.out.println("Время работы " + workingHours);
            System.out.println("Цена " + price);
        }
    }

    public static void main(String[] args){
        Park park = new Park();
        Park.Attraction carousel = park.new Attraction("Карусель", "11:00 - 20:00", 200);
        carousel.informationDisplay();
    }
}
