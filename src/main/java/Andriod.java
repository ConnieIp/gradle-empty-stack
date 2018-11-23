public class Andriod extends Mobile{
    public Andriod(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void printMsg(String msg) {
        if(msg.length()>18){
            System.out.println("<iPhone> Message cannot be sent");
        }else {
            System.out.print("<Andriod>");
            super.printMsg(msg);
        }
    }
}
