//Team Members:
//        Mamta Pednekar                  CSULB ID: 026909816
//        Vidyadhari Raghunadha Naidu     CSULB ID: 027957174
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class OddFilterTest extends OddFilter{
    @Test
    void getOddNumberTest() {
        OddFilter of = new OddFilter();
        System.out.println(getOddNumberTesting());
        assertEquals(getOddNumberTesting(),null);
    }
}
