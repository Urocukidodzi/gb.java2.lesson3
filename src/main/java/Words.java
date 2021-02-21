import java.util.ArrayList;
import java.util.List;

public class Words {

    private static List<String> list = new ArrayList<>();

    static {

        list.add("кокос");
        list.add("кокос1");
        list.add("кокос2");
        list.add("кокос3");
        list.add("кокос4");
        list.add("кокос5");
        list.add("кокос");
        list.add("кокос6");
        list.add("кокос7");
        list.add("кокос2");
        list.add("кокос");
        list.add("кокос8");
        list.add("кокос8");
        list.add("кокос9");
        list.add("кокос7");
        list.add("кокос7");
        list.add("кокос7");
        list.add("кокос7");

    }

    public static List<String> getList() {
        return list;
    }

    static List<String> uniqueWords() {

        List<String> uniqueWords = new ArrayList<>();

/*        boolean isUnique = true;

        uniqueWords.add(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            isUnique = true;
            for (int j = 0; j < i; j++) {
                if (list.get(i).equals(list.get(j))) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
               // System.out.println(list.get(i));
                uniqueWords.add(list.get(i));
            }
        }*/

        for (String ln: list) {
            if(!uniqueWords.contains(ln)) {
                uniqueWords.add(ln);
            }
        }

        return uniqueWords;
    }

    public static void numberWords() {
        List<String> unique = uniqueWords();
            int cost = 0;
        for (String ln: unique) {
            cost = 0;
            for (String tmp:list) {
                if(ln.equals(tmp)){
                    cost++;
                }
            }
            System.out.printf("слово %s встречается %d раз(а)\n", ln, cost);
        }

    }
}
