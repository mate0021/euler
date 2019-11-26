package mate00.amcote;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {

    // is repository sorted?
    // numProducts duplicates repository.size() ?
    List<List<String>> threeProducutSuggestions(int numProducts, List<String> repository, String customerQuery) {
        List<List<String>> result = new ArrayList<>();

        for (int x = 0; x < customerQuery.length(); x++) {
            String substring = customerQuery.substring(0, x + 1);
            List<String> subSearches = new ArrayList<>();
            if (substring.length() > 1) {
                System.out.println(substring);
                subSearches.addAll(repository.stream()
                        .filter(prod -> prod.toUpperCase().startsWith(substring.trim().toUpperCase()))
                        .sorted()
                        .limit(3)
                        .collect(toList()));
                result.add(subSearches);
            }
        }

        return result;
    }
}
