import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class HelloImpl extends UnicastRemoteObject implements Hello {

public  HelloImpl()throws RemoteException{
 super();
}

    @Override
    public String sayHello() throws RemoteException {
        return "Hello Rmi";
    }
}