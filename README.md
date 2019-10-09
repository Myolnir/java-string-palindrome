# Palindrome string

Program that checks if a given string is whether a palindrome or not.

To check this instead of check the hole string I do not have to loop over the hole string
but only the first half of it.

We only have one for loop so the complexity of the solution is a O(n)

I do two different algorithms:

* The first one checks the first half of the original string versus the second half starting from the end of the string.
* The second one just use the reverse method from StringBuilder for java.

## Installation

1. Download/Clone this repository.
2. Import the downloaded Java Project into some IDE (e.g., IntelliJ, Eclipse, etc.)
3. Run the [Palindrome.java](src/com/myolnir/Palindrome.java) file for Palindrome Logic.
4. Run the [PalindromeTest.java](test/com/myolnir/PalindromeTest.java) file for JUnit Test Cases.

If you run the program itself the command line should ask you for a string, after you enter the string hits enter and 
the program returns to you if the string is palindrome or not.


