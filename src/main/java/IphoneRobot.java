public class IphoneRobot {
    private String name;
    private IPhone iphone;

    public IphoneRobot(String name, IPhone iphone) {
        this.name = name;
        this.iphone = iphone;
    }

    public IPhone getIphone() {
        return iphone;
    }

    public void setIphone(IPhone iphone) {
        this.iphone = iphone;
    }

    public void call(){
        System.out.print(this.name + " call ");
        iphone.printBasicInformation();
    }
}
