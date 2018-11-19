package hello;


public class WordService{
	public Word getWordResponseForWord(String word){
		Word wordResponse = new Word();
		wordResponse.setPalindrome(isPalindrome(word));
		wordResponse.setAnagramOfPalindrome(isAnagram(word));
		return wordResponse;
	}
	
    private static boolean isPalindrome(String word)
	{
	    String reverseWord=null;
	    StringBuffer a = new StringBuffer(word);
        reverseWord=a.reverse().toString();
        return reverseWord.equals(word);
	}
	
	private static boolean isAnagram(String word)
	{
	    
	    Map<Character, Integer> charsCountMap = new HashMap<>();
		
		for(char c: word.toCharArray())
			if(charsCountMap.containsKey(c))
				charsCountMap.put(c, charsCountMap.get(c) + 1);
		
			else
				charsCountMap.put(c, 1);
			
		int wordLength=word.length();
		boolean isAnagram = false;
		boolean isMaxOneOdd = false;
	     for (Map.Entry<Character,Integer> entry : charsCountMap.entrySet())  
            if (wordLength % 2 == 0){
                if(entry.getValue()% 2 == 0)
                    isAnagram = true;
                else
                    isAnagram = false;
                    break;
            }else {
                System.out.println("odd length"+ entry.getValue());
                if( !isMaxOneOdd && entry.getValue()% 2 != 0){
                    System.out.println( "in if"+ entry.getValue());
                    isMaxOneOdd=true;
                }
                else if(entry.getValue()% 2 == 0){
                    System.out.println( "in else if"+ entry.getValue());
                    isAnagram = true;
                }
                else{
                    System.out.println("in else"+ entry.getValue());
                    isAnagram = false;
                    break;
                }
            }
	return isAnagram;
	}
}
