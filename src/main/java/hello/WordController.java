package hello;

import org.springframework.web.bind.annotation.RestController;
import hello.Word;
import hello.WordService;

@RestController
public class WordController {
    // TODO Implement the /words/{word} endpoint
	@GetMapping(path = "/words/{word}", produces = "application/json;charset=UTF-8") 
	@ResponseBody
	public WordResponse getWordResponse(@PathVariable String word) {
		WordResponse wordResponse = null;
		if(word.length() > 0 ){
		private WordService wordService = new WordService();
		wordResponse=wordService.getWordResponse()
		return wordResponse;
		}
		return wordResponse;
	}
}
