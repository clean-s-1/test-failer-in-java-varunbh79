

public class TShirtsSizeTest {


    public static void main(String[] args) {

        assert(TShirts.size(37).equals("S"));

        assert(!TShirts.size(38).equals("L"));
        assert(!TShirts.size(38).equals("S"));
        assert(TShirts.size(38).equals("M")):"Invalid Size For Medium";

        assert(TShirts.size(40).equals("M"));
        assert(!TShirts.size(40).equals("L"));

        assert (TShirts.size(42).equals( "L"));
        assert (!TShirts.size(42).equals("M"));

        assert (!TShirts.size(43).equals("M"));
        assert(TShirts.size(43).equals("L"));

        System.out.println("All is well (maybe!)");
    }
}
