package Task_30_01_2026.LinearSearch;

public class SearchSentence {
    public static String searchSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }
    public static void main(String[] args) {

        String[] sentences = {
                "Java is a programming language",
                "Linear search is simple",
                "Data structures are important",
                "Searching algorithms are useful"
        };
        String word = "search";
        String result = searchSentence(sentences, word);
        System.out.println(result);
    }
}
