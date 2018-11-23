public class Person {
    private String name;
    private Mobile mobile;

    public Person(String name, Mobile mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void call(){
        System.out.print(this.name + " call ");
        mobile.printBasicInformation();
    }

}
