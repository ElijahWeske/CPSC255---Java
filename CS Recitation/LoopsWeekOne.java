/** Second week of CPSC 255
* Quick solution for my recitation group with comments
* 
* This method will find the number of words ending in y or z in a given String...
* It assumes all words given are valid (and that stand-alone Y/Z do not exist).
*/
public class Solution{
  public int countYZ(String str) {
    int i, count = 0;
 
    for (i = 0; i < str.length(); i++){
 
     // if the current character is a Y or Z 
      if (Character.toUpperCase(str.charAt(i)) == 'Y' || Character.toUpperCase(str.charAt(i)) == 'Z'){

        // if at the end of the string
        if (i + 1 == str.length()){
          count++;
        }

        // if not a character
        else if (!Character.isLetter(str.charAt(i+1))){
          count++;
        }
      }
    }

    return count;
  }
}
