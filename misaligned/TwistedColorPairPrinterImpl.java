import java.util.List;

public class TwistedColorPairPrinterImpl implements TwistedColorPairPrinter{

    private static String formattedColorPairListCache ;

    public static String getFormattedColorPairListCache() {
        return formattedColorPairListCache;
    }

    @Override
    public String getFormattedColorPairString(List<TwistedColorPair> twistedColorPairList) {
        StringBuilder colorPairManualBuilder = new StringBuilder();
        for (TwistedColorPair twistedColorPair : twistedColorPairList) {
            colorPairManualBuilder.append(String.format("%d | %s | %s\n",twistedColorPair.getpairNo(),twistedColorPair.getMajorColor(),twistedColorPair.getMinorColor()));
        }
        return colorPairManualBuilder.toString();
    }

    @Override
    public void printTwistedColorPair(List<TwistedColorPair> twistedColorPairList) {
        formattedColorPairListCache = getFormattedColorPairString(twistedColorPairList);
        System.out.println(formattedColorPairListCache);
    }
 }


