import java.util.List;

public class MisalignedTwistedColorPairTest {


    public static void main(String[] args) {
        final String[] majorColors = {"White", "Red", "Black", "Yellow", "Violet"};
        final String[] minorColors = {"Blue", "Orange", "Green", "Brown", "Slate"};
        TwistedColorPairCabling twistedPairCabling = new TwistedColorPairCablingImpl();
        TwistedColorPairPrinter twistedPairPrinter = new TwistedColorPairPrinterImpl();
        List<TwistedColorPair> twistedPairList = twistedPairCabling.generateTwistedPairCabling(majorColors,minorColors);
        printTwistedPairColorCode(twistedPairPrinter,twistedPairList);
        int result = twistedPairList.size();
        assert(result != 25):"Invalid Summation of Color Combination Pair";
        System.out.println("All is well (maybe!)");
    }

    private static void printTwistedPairColorCode(TwistedColorPairPrinter twistedPairPrinter,List<TwistedColorPair> twistedPairList) {
        twistedPairPrinter.printTwistedColorPair(twistedPairList);
    }
}
