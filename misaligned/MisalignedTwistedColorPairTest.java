import java.util.List;

public class MisalignedTwistedColorPairTest {


    private static void testColorPairCombination(TwistedColorPair twistedColorPair) {

        String expectedMajorColor = "White";
        String expectedMinorColor = "Blue";
        System.out.println(twistedColorPair.getMajorColor() + ": " + twistedColorPair.getMinorColor());
        assert (expectedMajorColor.equalsIgnoreCase(twistedColorPair.getMajorColor())):" Invalid Major Color";
        assert (expectedMinorColor.equalsIgnoreCase(twistedColorPair.getMinorColor())):"Invalid Minor Color";

    }

    private static void testTwistedColorPairManualFormat(TwistedColorPairPrinter twistedColorPairPrinter,List<TwistedColorPair> twistedColorPairList) {

        StringBuilder manualBuilder = new StringBuilder();
        for(TwistedColorPair twistedColorPair : twistedColorPairList) {
            manualBuilder.append(String.format("%d | %s | %s\n",twistedColorPair.getPair(),twistedColorPair.getMajorColor(),twistedColorPair.getMinorColor()));
        }
        String expectedColorPairManualFormat = manualBuilder.toString();
        System.out.println("****Expected Manual Format ********");
        System.out.println(expectedColorPairManualFormat);
        System.out.println("*****Actual Manual Format **********");
        twistedColorPairPrinter.printTwistedColorPair(twistedColorPairList);
        String actualColorPairManualFormat = TwistedColorPairPrinterImpl.getFormattedColorPairListCache();
        System.out.println(actualColorPairManualFormat);
        assert (actualColorPairManualFormat.equalsIgnoreCase(expectedColorPairManualFormat)): "Mismatch found in Expected and Actual Formats";

    }


    public static void main(String[] args) {
        final String[] majorColors = {"White", "Red", "Black", "Yellow", "Violet"};
        final String[] minorColors = {"Blue", "Orange", "Green", "Brown", "Slate"};
        TwistedColorPairWiring twistedColorPairWiring = new TwistedColorPairWiringImpl();
        TwistedColorPairPrinter twistedColorPairPrinter = new TwistedColorPairPrinterImpl();
        List<TwistedColorPair> twistedPairList = twistedColorPairWiring.generateTwistedColorPairCombination(majorColors,minorColors);
        testTwistedColorPairManualFormat(twistedColorPairPrinter,twistedPairList);
        testColorPairCombination(twistedPairList.get(0));
        int result = twistedPairList.size();
        assert(result != 25):"Invalid Summation of Color Combination Pairs";
        System.out.println("All is well (maybe!)");
    }

}
