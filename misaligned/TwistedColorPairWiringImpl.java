import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class TwistedColorPairWiringImpl implements TwistedColorPairWiring {

    @Override
    public List<TwistedColorPair> generateTwistedColorPairCombination(String[] majorColorNames, String[] minorColorNames) {
        List<TwistedColorPair> twistedColorPairList = new ArrayList<>();
        AtomicInteger pairNo = new AtomicInteger(0);
        for (String majorColor : majorColorNames) {
            for (String minorColor: minorColorNames) {
                twistedColorPairList.add(new TwistedColorPair(pairNo.getAndIncrement(),majorColor,minorColor) );
            }
        }
        return twistedColorPairList;
    }
}
