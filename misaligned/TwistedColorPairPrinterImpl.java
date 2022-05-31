import java.util.List;

public class TwistedColorPairPrinterImpl implements TwistedColorPairPrinter{


    @Override
    public void printTwistedColorPair(List<TwistedColorPair> twistedPairList) {

        for (TwistedColorPair twistedPair : twistedPairList) {
            System.out.printf("%d | %s | %s\n", twistedPair.getPair(), twistedPair.getMajorColor(), twistedPair.getMinorColor());
        }
    }
 }


