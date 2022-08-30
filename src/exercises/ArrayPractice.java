package exercises;

public class ArrayPractice {
    public static void main(String [] args) {
    int [] numbersArray = {1, 1, 2, 3, 5, 8};
    for (int oneInt : numbersArray) {
        if (oneInt == 1 || oneInt == 3 || oneInt == 5) {
            System.out.println(oneInt);
          //  continue;
        }
       // System.out.println("Odd ones only");
    }
   }

}
