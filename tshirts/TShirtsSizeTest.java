

public class TShirtsSizeTest {


    public static void main(String[] args) {

        assert(TShirts.size(37) == "S");

        assert(TShirts.size(38) == "L");
        assert(TShirts.size(38) == "S");
        assert(TShirts.size(38) == "M"):"Invalid Size For Medium";

        assert(TShirts.size(40) == "M");
        assert(TShirts.size(40) == "L");

        assert (TShirts.size(43) == "M");
        assert(TShirts.size(43) == "L");

        assert (TShirts.size(42) == "L");
        assert (TShirts.size(42) == "M");

        System.out.println("All is well (maybe!)");
    }
}
