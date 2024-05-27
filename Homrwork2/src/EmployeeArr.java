public class EmployeeArr {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public EmployeeArr(String fullName, String position, String email, String phone, double salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }
    public void informationDisplay(){
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public static void main(String[] args){
        EmployeeArr[] employees = new EmployeeArr[5];

        employees[0] = new EmployeeArr("Шакаров Тимур Маратович", "Тестировщик", "srmv4334@gmail.com", "89302778782", 123.21, 26);
        employees[1] = new EmployeeArr("Иванов Иван Иванович", "Программист", "ivan123@gmail.com", "89736364987", 1300, 12);
        employees[2] = new EmployeeArr("Андреев Андрей Андреевич", "Менеджер", "andrew1293@gmail.com", "89978621673", 40000.01, 245);
        employees[3] = new EmployeeArr("Сидоров Михаил Степанович", "Аналитик", "misha121@gmail.com", "89943343958", 782382.001, 34);
        employees[4] = new EmployeeArr("Прокопенко Алексей Николаевич", "Инженер", "alex1212@gmail.com", "89473748988", 100, 22);

        for (EmployeeArr i : employees){
            i.informationDisplay();
            System.out.println();
        }
    }
}
