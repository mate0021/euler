package rnd.mate00.codewars

import org.junit.Assert
import org.junit.Test

class MeetingTest {

    private void testing(String s, String exp) {
        String ans = Meeting.meeting(s)
        Assert.assertEquals(exp, ans)
    }

    @Test
    void basicTests() {
        testing("Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn",
                "(ARNO, ANN)(BELL, JOHN)(CORNWELL, ALEX)(DORNY, ABBA)(KERN, LEWIS)(KORN, ALEX)(META, GRACE)(SCHWARZ, VICTORIA)(STAN, MADISON)(STAN, MEGAN)(WAHL, ALEXIS)")

        testing("John:Gates;Michael:Wahl;Megan:Bell;Paul:Dorries;James:Dorny;Lewis:Steve;Alex:Meta;Elizabeth:Russel;Anna:Korn;Ann:Kern;Amber:Cornwell",
                "(BELL, MEGAN)(CORNWELL, AMBER)(DORNY, JAMES)(DORRIES, PAUL)(GATES, JOHN)(KERN, ANN)(KORN, ANNA)(META, ALEX)(RUSSEL, ELIZABETH)(STEVE, LEWIS)(WAHL, MICHAEL)")

    }

    @Test
    void "When last names are the same, sort by first" () {
        testing("Alexis:Wahl;John:Bell;Chris:Bell", "(BELL, CHRIS)(BELL, JOHN)(WAHL, ALEXIS)")
    }
}
