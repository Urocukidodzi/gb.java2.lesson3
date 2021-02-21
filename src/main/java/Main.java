public class Main {

    public static void main(String[] args) {

        /**         ЗАДАНИЕ 1
         * Список слов проинициализирован в статик блоке класса */

        System.out.println(Words.getList());
        System.out.println(Words.uniqueWords());
        Words.numberWords();

        /** Задане 2 */
        PhoneBook.add("Вася", "89236661512");
        PhoneBook.add("Вася", "89236661512");
        PhoneBook.add("Вася", "89059541212");
        PhoneBook.add("Офоня", "89236661512");
        PhoneBook.get("Вася");
        PhoneBook.get("Офоня");
        PhoneBook.get("Маша");
        PhoneBook.add("Маша", "89236661512");
        PhoneBook.get("Маша");
    }
}
