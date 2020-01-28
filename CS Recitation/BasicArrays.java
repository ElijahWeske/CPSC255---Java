/**
* Array method for second recitation section.
* 
* Per Dr. Lambert: the problem this week that I would like you to solve is ---
* Method: countMatches(item, array, start, end). 
* countMatches(4, {5, 6, 7}, 0, 3) would return 0. 
* countMatches(7, {5, 6, 7}, 0, 3) would return 1. 
* countMatches(7, {5, 6, 7}, 0, 2) would return 0. 
* Start is inclusive. End is exclusive.
*/

public class Solution{
  public int countMatches(int item, int[] array, int start, int end){
    int count = 0;
  
    for (int i = start; i < end; i++){
      if (array[i] == item) count++;
    }
    
    return count;
  }
}
