package hello;

public class WordResponse {
	private String word;
	private boolean palindrome;
	private boolean anagramOfPalindrome;
	
	public WordResponse() {
    }
	public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word= word;
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
        return "WordResponse{" + "word="+ word + "palindrome=" + palindrome + ", anagramOfPalindrome=" + anagramOfPalindrome
                +  '}';
    }
	
}