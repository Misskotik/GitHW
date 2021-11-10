package lesson5.HW5;

public class Manager {
    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan Ivanovich", "Engineer", "ivivan@mailbox.com", "892312312", 80000, 30);
        persArray[1] = new Employee("Petrov Ivan Ivanovich", "QA Engineer", "Petrivivan@mailbox.com", "892302312", 60000, 35);
        persArray[2] = new Employee("Sokolova Irina Petrovna", "Manager", "sokolova@mailbox.com", "892302300", 70000, 41);
        persArray[3] = new Employee("Anina Anna Petrovna", "Web Developer", "anina@mailbox.com", "892302301", 75000, 28);
        persArray[4] = new Employee("Alekseev Adrey Vasilyevich", "Product Manager", "alekseev@mailbox.com", "8923023610", 80000, 42);

       for (int i = 0; i < 5; i++) {
           if (persArray[i].getAge() > 40) {
               persArray[i].printEmployees();
           }

        }
    }
}














