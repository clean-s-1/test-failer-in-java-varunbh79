public class TShirts {
    
    static String size(int cms) {
        if(cms < 38) {
            return "S";
        } else if(cms < 42) {
            return "M";
        } else {
            return "L";
        }
    }

}
