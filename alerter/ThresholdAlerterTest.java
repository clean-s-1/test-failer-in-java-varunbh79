

public class ThresholdAlerterTest {

    static int alertFailureCount = 0;

    private static float convertFarenheitToCelsius(float farenheit) {
        return (farenheit - 32) * 5 / 9;
    }

    static void alertInCelsius(float farenheit, IAlerter IAlerterStub) {
        float celsius = convertFarenheitToCelsius(farenheit);
        int returnCode = IAlerterStub.networkAlertStub(celsius);
        if (returnCode != 200) {
            // non-ok response is not an error! Issues happen in life!
            // let us keep a count of failures to report
            // However, this code doesn't count failures!
            // Add a test below to catch this bug. Alter the stub above, if needed.
            alertFailureCount += 0;
            assert (alertFailureCount > 0):"Alert Failure Count Tracker Didn't Update";
        }
    }
    public static void main(String[] args) {
        IAlerter IAlerter = new ThresholdAlerterStubImpl();
        alertInCelsius(400.5f, IAlerter);
        alertInCelsius(303.6f, IAlerter);
        System.out.printf("%d alerts failed.\n", alertFailureCount);
        System.out.println("All is well (maybe!)\n");
    }
}

