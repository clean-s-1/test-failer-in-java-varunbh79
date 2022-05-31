public class TwistedColorPair {

    private  Integer pair;
    private  String majorColor;
    private  String minorColor;

    public TwistedColorPair(Integer pair, String majorColor, String minorColor) {
        this.pair = pair;
        this.majorColor = majorColor;
        this.minorColor = minorColor;
    }

    public void setPair(Integer pair) {
        this.pair = pair;
    }

    public void setMajorColor(String majorColor) {
        this.majorColor = majorColor;
    }

    public void setMinorColor(String minorColor) {
        this.minorColor = minorColor;
    }

    public Integer getPair() {
        return pair;
    }

    public String getMajorColor() {
        return majorColor;
    }

    public String getMinorColor() {
        return minorColor;
    }
}
