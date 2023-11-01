package FinalAssement;
import java.util.*;
import java.util.stream.Collectors;

public class StringListOperations {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "avocado", "apricot", "cherry","anu");
        List<String> filteredList = stringList.stream()
                .filter(s -> s.startsWith("a") && s.length() == 3)
                .collect(Collectors.toList());
        System.out.println("Task A: " + filteredList);
        
        List<Integer> integerList = Arrays.asList(3, 44, 5, 12);
        String result = integerList.stream()
                .map(n -> (n % 2 == 0 ? "e" : "o") + n)
                .collect(Collectors.joining(","));
        System.out.println("Task B: '" + result + "'");
        
        List<Integer> List1 = Arrays.asList(10, 30, 15, 20, 50, 5);
        List<Integer> List2 = Arrays.asList(1, 2, 3);
        List<Integer> List3 = Arrays.asList(20, 30);
        LargestNumbers(List1);
        LargestNumbers(List2);
        LargestNumbers(List3);
    }
    
    public static void LargestNumbers(List<Integer> numbers) {
        List<Integer> sortedList = numbers.stream()
                .sorted(Collections.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Task C: " + sortedList);
    }
}