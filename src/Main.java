import java.util.*;

public class Main {
    public static void main(String[] args) {
        play();

    }

    public static boolean check(String userAnswer, String keyWord) {
        // Проверка
        return userAnswer.equals(keyWord);
    }
    public static void play() {
        UserDictionary userDictionary = new UserDictionary();
        HashMap useddd = (HashMap) userDictionary();

        System.out.println("Сейчас будет игра, где мы проверим вашу память^^");
        System.out.println("Надеюсь, что вы запомнили название слов, котоыре вводили под нумирацию цифр");

        int cont = 0;
        Scanner scanner = new Scanner(System.in);

        int trueAnswerUser = 0;
        int falseAnswerUser = 0;
        while (true) {

            int keyIndex = userDictionary.randomKey(useddd);
            System.out.println("Слово под номером: " + keyIndex);
            String userAnswer = scanner.nextLine();

            if (check(userAnswer, userDictionary.returnKeyWord(keyIndex, useddd))) trueAnswerUser++;
            else falseAnswerUser++;
            if (cont == 10) break;

            cont++;
        }
        theFinal(trueAnswerUser, falseAnswerUser);
    }

    public static Map userDictionary() {
        Scanner scanner = new Scanner(System.in);
        UserDictionary userDictionary = new UserDictionary();
        int cont = 0;
        System.out.println("Ввидите десять слов");
        while (cont < 3) {
            System.out.println("Ввидите слово под номером " + cont + ": ");
            String userWord = scanner.nextLine();
            userDictionary.addToDictionary(cont,userWord);
            cont++;
        }
            Map<Integer, String>  dictionary = userDictionary.getDictionary();
        return dictionary;
    }
        public static void theFinal(int trueAnswerUser, int falseAnswerUser){
            System.out.println("Верно названных эллементов: " + trueAnswerUser);
            System.out.println("Неверно названных эллементов: " + falseAnswerUser);
        }
}
