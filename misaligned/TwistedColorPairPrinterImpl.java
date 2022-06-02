import java.util.List;

public class TwistedColorPairPrinterImpl implements TwistedColorPairPrinter{

    private static String formattedColorPairListCache ;

    public static String getFormattedColorPairListCache() {
        return formattedColorPairListCache;
    }

    @Override
    public void printTwistedColorPair(List<TwistedColorPair> twistedColorPairList) {

        StringBuilder colorPairManualBuilder = new StringBuilder();
        for (TwistedColorPair twistedColorPair : twistedColorPairList) {
            colorPairManualBuilder.append(String.format("%d | %s | %s\n",twistedColorPair.getPair(),twistedColorPair.getMajorColor(),twistedColorPair.getMinorColor()));
            System.out.printf("%d | %s | %s\n", twistedColorPair.getPair(), twistedColorPair.getMajorColor(), twistedColorPair.getMinorColor());
        }
        formattedColorPairListCache = colorPairManualBuilder.toString();
    }
 }


