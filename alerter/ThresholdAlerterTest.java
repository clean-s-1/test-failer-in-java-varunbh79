

public class ThresholdAlerterTest {

    static int alertFailureCount = 0;

    static void alertInCelcius(float farenheit,ThresholdAlerterStub thresholdAlerterStub) {
        float celcius = (farenheit - 32) * 5 / 9;
        int returnCode = thresholdAlerterStub.networkAlertStub(celcius);
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
        ThresholdAlerterStub thresholdAlerterStub = new ThresholdAlerterStubImpl();
        alertInCelcius(400.5f,thresholdAlerterStub);
        alertInCelcius(303.6f,thresholdAlerterStub);
        System.out.printf("%d alerts failed.\n", alertFailureCount);
        System.out.println("All is well (maybe!)\n");
    }
}
