// Zane Mikula
// October 29th, 2023
//COP-3330C-14834
// The program objective is display knowledge of generics by manipulating two objects
//The program will produce an output of whether class is larger than the other numerically...

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {2, 4, 6, 8};
        String[] stringArray = {"Hailey", "Zane", "Michelle", "Jonathan"}; // sets the values for three different types
        Double[] doubleArray = {2.1, 4.1, 6.1, 8.1};

        int intValue = 6;
        String stringValue = "Michelle"; //sets the values from all three arrays
        double doubleValue = 6.1;
        int intPosition = ArraySearchGeneric.findValue(intArray, intValue);
        int stringPosition = ArraySearchGeneric.findValue(stringArray, stringValue); //uses findValue method in other class to set the position
        int doublePosition = ArraySearchGeneric.findValue(doubleArray, doubleArray);

        System.out.println("The position of " + intValue + " in the first array: " + intPosition);
        System.out.println("The position of " + stringValue + " in the second array: " + stringPosition); //prints out the intended value and position it was found
        System.out.println("The position of " + doubleValue + " in the third array: " + doublePosition);

    }
}