public interface Measurable1 {
    double getMeasure();
    static Measurable1 largest(Measurable1[] objects) {
        if (objects == null || objects.length == 0) {
            return null; // or throw IllegalArgumentException
        }
        Measurable1 largest = objects[0];
        for (Measurable1 obj : objects) {
            if (obj.getMeasure() > largest.getMeasure()) {
                largest = obj;
            }
        }
        return largest;
    }
}
