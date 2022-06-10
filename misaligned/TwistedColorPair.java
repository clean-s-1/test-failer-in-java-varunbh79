public class TwistedColorPair {

    private  Integer pairNo;
    private  String majorColor;
    private  String minorColor;

    public TwistedColorPair(Integer pairNo, String majorColor, String minorColor) {
        this.pairNo = pairNo;
        this.majorColor = majorColor;
        this.minorColor = minorColor;
    }

    public void setpairNo(Integer pairNo) {
        this.pairNo = pairNo;
    }

    public void setMajorColor(String majorColor) {
        this.majorColor = majorColor;
    }

    public void setMinorColor(String minorColor) {
        this.minorColor = minorColor;
    }

    public Integer getpairNo() {
        return pairNo;
    }

    public String getMajorColor() {
        return majorColor;
    }

    public String getMinorColor() {
        return minorColor;
    }
}
