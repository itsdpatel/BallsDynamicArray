// Java Program to Create a Dynamic Array
public class ballsArray {
 
    // Member variables of this class and Private access modifier
    private int arr[];
    private int count;
 
 
    // Method 1
    // Inside helper class
    // to compute length of an array
    public ballsArray(int length) { arr = new int[length]; }
 
    // Method 2
    // Inside helper class
    // To print array
    public void printArray()
    {
 
        // Iterating over array using for loop
        for (int i = 0; i < count; i++) {
 
            // Print the elements of an array
            System.out.print(arr[i] + " ");
        }
    }
    
 // Method 3
    // Inside Helper class
    public void insert(int element)
    {
 
        if (arr.length == count) {
 
            // Creating a new array double the size
            // of array declared above
            int newArr[] = new int[2 * count];
 
            // Iterating over new array using for loop
            for (int i = 0; i < count; i++) {
                newArr[i] = arr[i];
            }
 
            // Assigning new array to original array
            // created above
            arr = newArr;
        }
 
        arr[count++] = element;
    }

//Main class
 public static void main(String[] args)
 {

     // Creating object of Array(user-defined) class
     ballsArray balls = new ballsArray(3);

     //we will use the insert() method to Add elements more than size specified above
     //input Ball elements
     balls.insert(8);
     balls.insert(2);
     balls.insert(3);
     balls.insert(10);

     // Calling the printArray() method to print
     // Now the new array been dynamically created
     balls.printArray();
 }
}