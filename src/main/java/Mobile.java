public class Mobile{
    private String name;
    private String color;
    private String brand;

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void printMsg(String msg){
        System.out.println("Message : "+msg);
    }

    public void printBasicInformation(){
        System.out.println("name: "+this.name+", color: "+this.color+", brand: "+this.brand);
    }

}