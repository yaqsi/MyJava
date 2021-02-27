import java.rmi.*;

public interface Inter extends Remote
{
    public String sum(String name) throws RemoteException;
}