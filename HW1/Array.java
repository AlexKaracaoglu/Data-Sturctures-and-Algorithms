/*Alex Karacaoglu
 * CSCI 1102 
 * Assignment 1: Number 4
 * [Arrays; Methods]
 * Due September 14
 * 
 * This program takes in an integer array, sorts the array to order it and then iterates through the array using a for
 * loop to count the number of instances of each element. It then displays this on screen.
 * 
 * I made use of the Arrays class
*/



import java.util.Arrays;


public class Array {
 public static void getRunLength (int[] a){
    Arrays.sort(a);
    int counter = 1;
    for (int i = 0; i < a.length; i++) {
        if (i < a.length - 1) {
            if (a[i] == a[i + 1]) {
                counter++;
            }
        } else {
            System.out.println(a[i] + " " + counter); 
        }

        if (i < a.length - 1 && a[i] != a[i + 1]) {
            System.out.println(a[i] + " " + counter); 
            counter = 1;
        }

    }

}
public static void main(String[] args)
{
  int[] arr = {1,2,1,1,3,4,5}; 
  getRunLength(arr);}}

