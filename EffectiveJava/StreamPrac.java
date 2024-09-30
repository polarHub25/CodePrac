import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPrac {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Tom", "Jerry");

        names.stream()
            .filter(name -> {
                System.out.println("filter: " + name); // 필터링 단계에서 출력
                return name.startsWith("J");
            })
            .map(name -> {
                System.out.println("map: " + name); // 맵핑 단계에서 출력
                return name.toUpperCase();
            })
            .forEach(name -> System.out.println("forEach: " + name)); // 최종 처리 단계에서 출력




            List<String> names2 = Arrays.asList("John", "Jane", "Tom", "Jerry");
            List<String> processedNames = names2.stream()
                    .filter(name -> name.startsWith("J"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList()); // 스트림의 결과를 리스트로 수집
    
            // 한꺼번에 출력
            System.out.println(processedNames);



    }

}
