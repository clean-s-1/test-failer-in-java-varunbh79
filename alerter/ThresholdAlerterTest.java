

public class ThresholdAlerterTest {

    static int alertFailureCount = 0;

    private static float convertFarenheitToCelsius(float farenheit) {
        return (farenheit - 32) * 5 / 9;
    }

    static void alertInCelsius(float farenheit, IThresholdAlerter IThresholdAlerter) {
        float celsius = convertFarenheitToCelsius(farenheit);
        int returnCode = IThresholdAlerter.networkAlertStub(celsius);
        if (returnCode != 200) {
            // non-ok response is not an error! Issues happen in life!
            // let us keep a count of failures to report
            // However, this code doesn't count failures!
            // Add a test below to catch this bug. Alter the stub above, if needed.
            alertFailureCount += 1;
            assert (alertFailureCount > 0):"Alert Failure Count Tracker Didn't Update";
        }
    }
    public static void main(String[] args) {
        IThresholdAlerter IThresholdAlerter = new ThresholdAlerterStubImpl();
        alertInCelsius(400.5f, IThresholdAlerter);
        alertInCelsius(303.6f, IThresholdAlerter);
        System.out.printf("%d alerts failed.\n", alertFailureCount);
        System.out.println("All is well (maybe!)\n");
    }
}

