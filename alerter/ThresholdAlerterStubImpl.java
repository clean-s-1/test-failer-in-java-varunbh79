

public class ThresholdAlerterStubImpl implements ThresholdAlerterStub{

   public Integer networkAlertStub(float celcius) {
        System.out.println("ALERT: Temperature is " + celcius + " celcius");
        if(celcius > 200)
            return 500;
        return 200;
    }
}
