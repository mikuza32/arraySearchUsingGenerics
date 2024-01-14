// Zane Mikula
// October 29th, 2023
//COP-3330C-14834
// The program objective is display knowledge of generics by manipulating two objects
//The program will produce an output of whether class is larger than the other numerically...
public class ArraySearchGeneric {
    public static <T> int findValue(T[] array, T value) { // sets generic method to order and find the array and the value in the array
        for (int i = 0; i < array.length; i++) { //for loop in order increase in order while finding value from 0 + 1
            if (array[i].equals(value)) { //if the array value is the value then return i
                return i;
            }
        }
        return -1; // else it will return negative one
    }
}
