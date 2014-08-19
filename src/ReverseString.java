class ReverseString
{  //@param Passed string from main class. User input.
   public static java.lang.String mirrorString(java.lang.String original) 
   {
	   java.lang.String reverse = ""; //Variable to hold the reversed string.
      int length = ((CharSequence) original).length(); //Converts the string to readable int length. 
      for ( int i = length - 1 ; i >= 0 ; i-- ) 
         reverse = reverse + ((CharSequence) original).charAt(i); //Step by step inverts the given string by using the int characters.
 
      return reverse; //@return Returning original string that has been reversed.
   }
}