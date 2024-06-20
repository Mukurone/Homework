public class Main {
    public static void main(String[] args){
        //WordArray.wordArray();

        PhoneDirectory directory = new PhoneDirectory();
        directory.add("Пронин", "893028372893");
        directory.add("Пронин", "89283931927389");

        directory.get("Пронин");
    }
}
