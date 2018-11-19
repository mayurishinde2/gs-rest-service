package hello;

public class Word {
	private boolean palindrome;
	private boolean anagramOfPalindrome;
	
	public Word() {
    }
	public boolean getPalindrome() {
        return palindrome;
    }

    public void setPalindrome(boolean palindrome) {
        this.palindrome = palindrome;
    }
	
	public boolean getAnagramOfPalindrome() {
        return anagramOfPalindrome;
    }

    public void setAnagramOfPalindrome(boolean anagramOfPalindrome) {
        this.anagramOfPalindrome = anagramOfPalindrome;
    }
	 @Override
    public String toString() {
        return "Word{" + "palindrome=" + palindrome + ", anagramOfPalindrome=" + anagramOfPalindrome
                +  '}';
    }
	
}