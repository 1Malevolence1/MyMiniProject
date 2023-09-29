
import java.util.*;


public class UserDictionary implements WorkingWithElements{
    private Map<Integer, String> userDictionary;

    public UserDictionary() {
        userDictionary = new HashMap<>();
    }

    public void addToDictionary(int key, String value) {
        userDictionary.put(key, value);
    }

    public Map<Integer, String> getDictionary() {
        return userDictionary;
    }

    @Override
    public int randomKey(HashMap<Integer, String> randomKey) {
        Random random = new Random();
        List<Integer> keys = new ArrayList<>(randomKey.keySet());
        int indexKey = keys.get(random.nextInt(randomKey.size()));
        return indexKey;
    }

    @Override
    public String returnKeyWord(int key, HashMap<Integer, String> dictionary) {
        return dictionary.get(key);
    }
}




