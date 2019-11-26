package mate00.amcote;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class MainTest {

    private Main subject = new Main();

    @Test
    public void t1() {
        List<String> repository = Arrays.asList("mobile", "mouse", "moneypot", "monitor", "mousepad");
        String query = "mouse";
        List<List<String>> result = subject.threeProducutSuggestions(5, repository, query);

        for (List<String> sug : result) {
            System.out.println(sug);
        }
    }

    @Test
    public void t2() {
        List<String> repository = Arrays.asList("bags", "baggage", "banner", "box", "cloths");
        String query = "bags";

        List<List<String>> result = subject.threeProducutSuggestions(5, repository, query);

        for(List<String> sug : result) {
            System.out.println(sug);
        }
    }

    @Test
    public void t3() {
        List<String> repository = Arrays.asList("code", "codePhone", "coddle", "coddles", "codes");
        String query = "coddle";

        List<List<String>> result = subject.threeProducutSuggestions(5, repository, query);

        for(List<String> sug : result) {
            System.out.println(sug);
        }
    }

    @Test
    public void t4() {
        List<String> repository = Collections.emptyList();
        String query = "coddle";

        List<List<String>> result = subject.threeProducutSuggestions(5, repository, query);

        for (List<String> sug : result) {
            System.out.println(sug);
        }
    }

    @Test
    public void t5() {
        List<String> repository = Arrays.asList("code", "codePhone", "coddle", "coddles", "codes");
        String query = "";

        List<List<String>> result = subject.threeProducutSuggestions(5, repository, query);

        for(List<String> sug : result) {
            System.out.println(sug);
        }
    }
}




