//2. Write a program to create an object of an class which contain a method and call that class method in main method.
import java.util.*;

public class Problem2 {
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
      }
    
      // Create a speed() method and add a parameter
      public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
      }
    
      // Inside main, call the methods on the myCar object
      public static void main(String[] args) {
        Problem2  myCar = new Problem2();   // Create a myCar object
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);          // Call the speed() method
      }
    }

