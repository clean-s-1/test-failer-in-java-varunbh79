

public class TShirtsSizeTest {


    public static void main(String[] args) {

        assert(TShirts.size(37) == "S");
        assert(TShirts.size(40) == "M");
        assert(TShirts.size(43) == "L");
        assert(TShirts.size(38) == "M"):"Invalid Size For Medium";
        System.out.println("All is well (maybe!)");
    }
}
