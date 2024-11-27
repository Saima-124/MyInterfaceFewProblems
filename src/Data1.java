public class Data1 {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Alice", 165.5),
                new Person("Bob", 180.0),
                new Person("Charlie", 175.3),
                new Person("Diana", 160.2),
                new Person("Edward", 190.0)
        };
        double totalHeight = 0;
        for(Person person:persons){
            totalHeight+= person.getHeight();
        }
        double averageHeight = totalHeight/ persons.length;
        Person highestPerson = (Person) Measurable1.largest(persons);
        System.out.printf("Average Height: %.2f cm%n", averageHeight);
        System.out.printf("Tallest Person: %s (%.2f cm)%n", highestPerson.getName(), highestPerson.getMeasure());

    }
}
