package studios.collections;
import java.util.HashMap;
import java.util.Map;

public class numsOfCharacters {
    public static void main(String [] args) {
        HashMap<Character, Integer> storage = new HashMap<>();
        String phrase = "I like pie";
        char[] charactersInString = phrase.toCharArray();

        for (char character: charactersInString) {

            Integer integer = storage.get(character);

            if(!storage.containsKey(character)){
              storage.put(character, 1);

            } else {
                storage.put(character, integer + 1);

           }

            for (Map.Entry<Character, Integer> store : storage.entrySet()) {
                System.out.println(store.getKey() + ":" + ( store.getValue() ));
            }

        }
    }
}
