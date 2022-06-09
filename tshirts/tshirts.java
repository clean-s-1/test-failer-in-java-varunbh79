

public class tshirts
{

    static String size(int cms) {
        if(cms < 38) {
            return "S";
        } else if(cms < 42) {
            return "M";
        } else {
            return "L";
        }
    }


    public static void main(String[] args) {

        assert(size(37).equals("S"));

        assert(!size(38).equals("L"));
        assert(!size(38).equals("S"));
        assert(size(38).equals("M")):"Invalid Size For Medium";

        assert(size(40).equals("M"));
        assert(!size(40).equals("L"));

        assert (size(42).equals( "L"));
        assert (!size(42).equals("M"));

        assert (!size(43).equals("M"));
        assert(size(43).equals("L"));

        System.out.println("All is well (maybe!)");
    }
}
