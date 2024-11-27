public class PMTest {
    public static void main(String[] args) {
        // Question 4
        Sequence multipleOfThree1 = Sequence.multiplesOf(3);
        System.out.println("Sequence of multiple 3 : ");
        for (int i=0;i<5;i++){
            System.out.println(multipleOfThree1.next());
        }
        Sequence powerOfTwo1 = Sequence.powerOf(2);
        System.out.println("Sequence of power 2 : ");
        for (int i=0;i<5;i++){
            System.out.println(powerOfTwo1.next());
        }
        //Question 5
        Sequence multipleOfThree = Sequence.multiplesOf(3);
        int[] multiplesArray = multipleOfThree.values(5);
        System.out.println("5 first value of multiples 3 : ");
        for(int value : multiplesArray){
            System.out.println(value);
        }
        Sequence powerOfTwo = Sequence.powerOf(2);
        int[] powerArray = powerOfTwo.values(5);
        System.out.println("5 first value of power 3 : ");
        for(int value : powerArray){
            System.out.println(value);
        }


    }
}
