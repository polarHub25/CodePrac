
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class coderbyte_math {

    /**
   * Longest Word
    Have the function LongestWord(sen) take the sen parameter 
    being passed and return the longest word in the string. => 
    If there are two or more words that are the same length, 
    return the first word from the string with that length. 
    Ignore punctuation and assume sen will not be empty. 
    Words may also contain numbers, for example "Hello world123 567"
    Examples => 가장 긴 단어를 출력 / 만약 길이가 똑같으면 첫번째 단어 출력
    Input: "fun&!! time"
    Output: time 

    Input: "I love dogs"
    Output: love
    공백으로 나누라는건가
    "a confusing /:sentence:/[ this is not!!!!!!!~"

      confusing
   * 
   */
    public static String LongestWord(String sen) {
        String[] words = sen.split(" ");
        Map<Integer, List<String>> lengthMap = new HashMap<>();

        for (String word : words) {
            // word에 문장부호가 있으면.. 제거... => 
            System.out.println("매핑: "+ word +" ::: " + word.replaceAll("[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z]", ""));
            //ㄱ-ㅎㅏ-ㅣa-zA-Z
            int length = word.replaceAll("[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z]", "").length();

            lengthMap.putIfAbsent(length, new ArrayList<>());
            lengthMap.get(length).add(word);

        }

        // 같은 길이를 가진 단어들을 출력하기 위해 Map을 순회
        for (Map.Entry<Integer, List<String>> entry : lengthMap.entrySet()) {
            System.out.println("Length " + entry.getKey() + ": " + entry.getValue());

        }

        //map entry는 map에서 반복문이 필요할때 사용 

        // Entry<Integer, Integer> maxEntry = null;         
        // Set<Entry<Integer, Integer>> entrySet = map.entrySet();        

        // for (Entry<Integer, Integer> entry : entrySet) {    
        //     if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
        //          maxEntry = entry;            
        //         }        
        // }        
     
        int maxLength = Collections.max(lengthMap.keySet()); // 이거는 반복문으로 할수는 있긴함
        System.out.println("최대 :"+ maxLength);

        // 해당 길이를 가진 단어들 중 첫 번째 단어 가져오기
        String longestWord = lengthMap.get(maxLength).get(0);
        System.out.println("longestWord:"+longestWord);
        
        return longestWord;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String result = LongestWord("a confusing /:sentence:/[ this is not!!!!!!!~");
        // a confusing /:sentence:/[ this is not!!!!!!!~
        //I like dogs
        System.out.println("Result: " + result);
    }
  
   
}
