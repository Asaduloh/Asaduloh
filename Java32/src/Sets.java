import java.util.*;

public class Sets {
    public static void main(String[] args) {
        String str = "Lorem Ipsum asadbek asadbek asadbek asadbek asadbek is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum" .toLowerCase();

        var string = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        Set<String> words = new HashSet<>(Arrays.asList(string));
        int a = 0;
        for (String word : words) {
            for (String text : string) {
                if (word.equals(text)) {
                    ++a;
                    System.out.print(map);
                }
            }
            map.put(word, a);
            a = 0;
        }

           /// System.out.print(map);

    }
}