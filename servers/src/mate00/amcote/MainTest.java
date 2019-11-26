package mate00.amcote;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class MainTest {

    private Main subject = new Main();

    @Test
    public void t1() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(1, 0, 0, 0, 0),
                Arrays.asList(0, 1, 0, 0, 0),
                Arrays.asList(0, 0, 0, 1, 0),
                Arrays.asList(0, 0, 0, 0, 1)
        );

        int result = subject.minimumDays(5, 5, grid);

        assertEquals(4, result);
    }

    @Test
    public void t2() {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(0, 0, 1, 0, 0, 0),
                Arrays.asList(0, 0, 0, 0, 0, 0),
                Arrays.asList(0, 0, 0, 0, 0, 1),
                Arrays.asList(0, 0, 0, 0, 0, 0),
                Arrays.asList(0, 1, 0, 0, 0, 0)
        );

        int result = subject.minimumDays(5, 6, grid);

        assertEquals(3, result);
    }
}