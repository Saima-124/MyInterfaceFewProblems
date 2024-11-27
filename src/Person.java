public class Person implements Measurable1{
    private String name;
    private double height;

    public Person(String name, double height) {
        this.name = name;
        this.height = height;
    }
    @Override
    public double getMeasure(){
        return height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
}
