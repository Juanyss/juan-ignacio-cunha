package ProxyPattern;

public class ProxyDemo {
    public static void main(String args[]){
        Message msg = new ProxyMsg("Juan Ignacio Cunha");

        msg.msg(); // Execute the function and instantiate the RealMsg class
        System.out.println("The already exist");

        msg.msg(); // Execute the function with a already instantiate class
    }
}


/*    public static void main(String args[]) {
        Image image = new ProxyImage("test_10mb.jpg");


        image.display();
        System.out.println("");


        image.display();
    }
*/