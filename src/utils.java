import java.util.ArrayList;
import java.util.HashMap;

public final class utils {

    static public String parcourirList(ArrayList<String> countries) {
        String phrase = "";
        for (int i =0; i < countries.size(); i++) {
            phrase += countries.get(i) + ", ";
        }
        return phrase;
    }



}
