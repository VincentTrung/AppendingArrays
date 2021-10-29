import java.util.Scanner;
import java.util.Arrays; //import array class

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //array we are resizing and input variable
    int nums [] = {1,2,3,4,5};
    int nextNum;

    while (true){
      //prompt user for input to the array
      System.out.println("");
      System.out.println("Enter a negative number to exit");
      System.out.print("What comes after "+nums[nums.length-1]+": ");
      nextNum = input.nextInt();
      //exit if negative
      if (nextNum <0 ){
        break;
      }

      //copy the nums array, make it one element longer
      //and reassign
      nums = Arrays.copyOf(nums,nums.length +1);
      //add the new element at the end
      nums[nums.length-1] = nextNum;


      //output teh information to ensure everything is working
      System.out.println("This is the new array");
      for (int i = 0; i < nums.length; i++){
        System.out.print(nums[i]+", ");
      }
      //empty line to separate from next loop
      System.out.println("");
    }
  }
}