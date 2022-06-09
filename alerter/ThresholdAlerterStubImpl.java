

public class ThresholdAlerterStubImpl implements IAlerter{

   public Integer networkAlertStub(float celsius) {
        System.out.println("ALERT: Temperature is " + celsius + " celsius");
        if(celsius > 200)
            return 500;
        return 200;
    }
}
