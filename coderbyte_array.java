import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class coderbyte_array {

  public static String FindIntersection(String[] strArr) {
    // code goes here
    String[] firstArr = strArr[0].split(", ");
    String[] secondArr = strArr[1].split(", ");

    Set<String> str = new HashSet<>();
    Set<Integer> result = new HashSet<>();

    for(String first : firstArr){
      str.add(first);
    }
    System.out.println("str::" + str);

    for(String second : secondArr){
      if(str.contains(second)){
          result.add(Integer.parseInt(second));
      }
    }
    System.out.println("result::" + result);
    return result.toString().replace("[", "").replace("]", "");

  }

  public static void main (String[] args) {  
   
    String[] strArr = {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};

    String result = FindIntersection(strArr);

    System.out.println("result : " + result);

  }
    
}
