
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {

        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            String[] services = registry.list();
            for (String service : services) {
                System.out.println("- " + service);
            }
            Hello obj = (Hello) registry.lookup("HelloService");

            System.out.println(obj.sayHello());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
