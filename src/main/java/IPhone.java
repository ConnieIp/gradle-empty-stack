public class IPhone extends Mobile {

    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void printMsg(String msg) {
        if(msg.length()>17){
            System.out.println("<iPhone> Message cannot be sent");
        }else {
            System.out.print("<iPhone>");
            super.printMsg(msg);
        }
    }
}
