import java.util.List;

public class TwistedColorPairPrinterImpl implements TwistedColorPairPrinter{


    @Override
    public void printTwistedColorPair(List<TwistedColorPair> twistedColorPairList) {

        for (TwistedColorPair twistedColorPair : twistedColorPairList) {
            System.out.printf("%d | %s | %s\n", twistedColorPair.getPair(), twistedColorPair.getMajorColor(), twistedColorPair.getMinorColor());
        }
    }
 }


