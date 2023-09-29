import java.util.*;

public class Main {
    public static void main(String[] args) {
        play();

    }

    public static int randomKey(HashMap<Integer, String> randomKey) {
        // случайный ключ
        Random random = new Random();
        List<Integer> keys = new ArrayList<>(randomKey.keySet());
        int indexKey = keys.get(random.nextInt(randomKey.size()));
        return indexKey;
    }

    public static String returnKeyWord(int key, HashMap<Integer, String> dictionary) {
        // получения элемента по ключу
        return dictionary.get(key);
    }

    public static boolean check(String userAnswer, String keyWord) {
        // Проверка
        return userAnswer.equals(keyWord);
    }

    public static void play() {

        HashMap useddd = userDictionary();

        System.out.println("Сейчас будет игра, где мы проверим вашу память^^");
        System.out.println("Надеюсь, что вы запомнили название слов, котоыре вводили под нумирацию цифр");

        int cont = 0;
        Scanner scanner = new Scanner(System.in);

        int trueAnswerUser = 0;
        int falseAnswerUser = 0;
        while (true) {

            int keyIndex = randomKey(useddd);
            System.out.println("Слово под номером: " + keyIndex);
            String userAnswer = scanner.nextLine();

            if (check(userAnswer, returnKeyWord(keyIndex, useddd))) trueAnswerUser++;
            else falseAnswerUser++;
            if (cont == 10) break;

            cont++;
        }
        theFinal(trueAnswerUser, falseAnswerUser);
    }

    public static HashMap userDictionary() {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> dictionary = new HashMap<Integer, String>();
        int cont = 0;
        System.out.println("Ввидите десять слов");
        while (cont < 11) {
            System.out.println("Ввидите слово под номером " + cont + ": ");
            String userWord = scanner.nextLine();
            dictionary.put(cont, userWord);
            cont++;
        }
        return dictionary;
    }
        public static void theFinal(int trueAnswerUser, int falseAnswerUser){
            System.out.println("Верно названных эллементов: " + trueAnswerUser);
            System.out.println("Неверно названных эллементов: " + falseAnswerUser);
        }
}
