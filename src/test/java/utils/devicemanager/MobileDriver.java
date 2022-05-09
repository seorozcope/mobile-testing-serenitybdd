package utils.devicemanager;

public class MobileDriver {
    private final IMobileDriver driverStrategy;

    public MobileDriver(IMobileDriver driverStrategy){
        this.driverStrategy=driverStrategy;
    }

    public void resetApp (){
        driverStrategy.resetApp();
    }
}
