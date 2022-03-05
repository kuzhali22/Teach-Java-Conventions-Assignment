import org.junit.jupiter.api.Test;

/*
    Test class for the PowerFinder class
 */
public class PowerFinderTest {

    @Test
    public void one_raised_to_one_is_one() {
        assert PowerFinder.findPower(1,1) == 1;
    }

    @Test
    public void two_raised_to_one_is_two() {
        assert  PowerFinder.findPower(2,1) == 2;
    }

    @Test
    public void two_raised_two_is_four() {
        assert  PowerFinder.findPower(2, 2) == 4;
    }

    @Test
    public void three_raised_two_is_nine() {
        assert  PowerFinder.findPower(3, 2) == 3*3;
    }
}
