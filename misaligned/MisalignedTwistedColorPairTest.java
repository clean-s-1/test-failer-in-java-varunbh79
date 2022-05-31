import java.util.List;

public class MisalignedTwistedColorPairTest {

    private static void testColorPairCombination(TwistedColorPair twistedColorPair) {

        String expectedMajorColor = "White";
        String expectedMinorColor = "Blue";
        System.out.println(twistedColorPair.getMajorColor() + ": " + twistedColorPair.getMinorColor());
        assert (expectedMajorColor.equalsIgnoreCase(twistedColorPair.getMajorColor())):" Invalid Major Color";
        assert (expectedMinorColor.equalsIgnoreCase(twistedColorPair.getMinorColor())):"Invalid Minor Color";

    }

    public static void main(String[] args) {
        final String[] majorColors = {"White", "Red", "Black", "Yellow", "Violet"};
        final String[] minorColors = {"Blue", "Orange", "Green", "Brown", "Slate"};
        TwistedColorPairWiring twistedColorPairWiring = new TwistedColorPairWiringImpl();
        TwistedColorPairPrinter twistedColorPairPrinter = new TwistedColorPairPrinterImpl();
        List<TwistedColorPair> twistedPairList = twistedColorPairWiring.generateTwistedColorPairWiring(majorColors,minorColors);
        printTwistedPairColorCode(twistedColorPairPrinter,twistedPairList);
        testColorPairCombination(twistedPairList.get(0));
        int result = twistedPairList.size();
        assert(result != 25):"Invalid Summation of Color Combination Pairs";
        System.out.println("All is well (maybe!)");
    }

    private static void printTwistedPairColorCode(TwistedColorPairPrinter twistedPairPrinter,List<TwistedColorPair> twistedPairList) {
        twistedPairPrinter.printTwistedColorPair(twistedPairList);
    }
}
