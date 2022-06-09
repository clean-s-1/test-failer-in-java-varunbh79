import java.util.List;

public class MisalignedTwistedColorPairTest {


    private static void testColorPairCombination(TwistedColorPair twistedColorpair) {

        String expectedMajorColor = "White";
        String expectedMinorColor = "Blue";
        System.out.println(twistedColorpair.getMajorColor() + ": " + twistedColorpair.getMinorColor());
        assert (expectedMajorColor.equalsIgnoreCase(twistedColorpair.getMajorColor())):" Invalid Major Color";
        assert (expectedMinorColor.equalsIgnoreCase(twistedColorpair.getMinorColor())):"Invalid Minor Color";

    }

    private static void testTwistedColorPairManualFormat(TwistedColorPairPrinter twistedColorPairPrinter,List<TwistedColorPair> twistedColorPairList) {

        String expectedColorpairNoManualFormat = twistedColorPairPrinter.getFormattedColorPairString(twistedColorPairList);
        System.out.println("****Expected Manual Format ********");
        System.out.println(expectedColorpairNoManualFormat);
        System.out.println("*****Actual Manual Format **********");
        twistedColorPairPrinter.printTwistedColorPair(twistedColorPairList);
        String actualColorpairNoManualFormat = TwistedColorPairPrinterImpl.getFormattedColorPairListCache();
        System.out.println(actualColorpairNoManualFormat);
        assert (actualColorpairNoManualFormat.equalsIgnoreCase(expectedColorpairNoManualFormat)): "Mismatch found in Expected and Actual Formats";
    }

    private static void testTwistedColorPairListSize(List<TwistedColorPair> twistedColorPairList) {
        int result = twistedColorPairList.size();
        System.out.println(result);
        assert(result == 25):"Invalid Summation of Color Combination pairNos";
    }


    public static void main(String[] args) {
        final String[] majorColors = {"White", "Red", "Black", "Yellow", "Violet"};
        final String[] minorColors = {"Blue", "Orange", "Green", "Brown", "Slate"};
        TwistedColorPairWiring twistedColorpairWiring = new TwistedColorPairWiringImpl();
        TwistedColorPairPrinter twistedColorPairPrinter = new TwistedColorPairPrinterImpl();
        List<TwistedColorPair> twistedColorPairList = twistedColorpairWiring.generateTwistedColorPairCombination(majorColors,minorColors);
        testTwistedColorPairManualFormat(twistedColorPairPrinter,twistedColorPairList);
        testColorPairCombination(twistedColorPairList.get(0));
        testTwistedColorPairListSize(twistedColorPairList);
        System.out.println("All is well (maybe!)");
    }

}
