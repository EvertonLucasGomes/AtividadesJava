public class TestMain {
    public static void main(String[] args) {
        Person[] persons = new Person[2];
        persons[0] = new Student("João", "123 São Pedro Belo Jardim", "Computer Science", 2022, 14508);
        persons[1] = new Staff("Maria", "248 Pontilhão Pesqueira", "Computer Science", 2000);
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
