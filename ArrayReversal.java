import java.util.Scanner; //we use scanner objects

public class ArrayReversal { //class named the right thing
    public static void main(String[] args) { //main method
        Scanner sc = new Scanner(System.in); //new scanner object
        System.out.println("Enter values (-1 to stop):"); //print prompt line
        int[] values = new int[100]; //initialize values array with length 100
        int newValue = sc.nextInt(); //initialize place to store the inputted integer, save next inputted integer to it
        sc.nextLine(); //clear out anything left on the line
        int i = 0; //initialize index integer
        while (newValue != -1) { //loop until the user enters -1
            values[i] = newValue; //save the new value to the array at index i
            i++; //advance i
            newValue = sc.nextInt(); //save next user input to newValue
            sc.nextLine(); //clear out any garbage
        }
        System.out.println("Your values, reversed:"); //print example message
        while (i > 0) { //until we run out of spots in the array
            System.out.println(values[(i - 1)]); //print number stored at index i - 1 (we advanced i after the last entry)
            i--; //reduce i
        }
    }
}
