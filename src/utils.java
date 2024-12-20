import java.util.ArrayList;

public final class utils {

    static public String parcourirTab(ArrayList<String> countries) {
        String phrase = "";
        for (int i =0; i < countries.size(); i++) {
            phrase += countries.get(i) + ", ";
        }
        return phrase;
    }

}
