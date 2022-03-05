/*
    This class finds the exponential value of any number.
 */
public class PowerFinder {
    /*
        The method findPower takes the base number and power number as parameters
        It returns the base number raised to the power.
     */
    public static int findPower(int base, int power) {

        int sqNumber = 1;

        for (int i = 1; i<=power; i++) {
            sqNumber *= base;
        }
        return sqNumber;
    }


}
