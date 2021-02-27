import java.rmi.server.*;
import java.rmi.*;
public class Serv extends UnicastRemoteObject implements  Inter
{
    public Serv() throws RemoteException{}

    public String sum(String name)
    {
        String replay = "Hello " + name + "!!!! I am the server greeting you! \n wish you good day and happy weekend!";
        return(replay);
    }

    public static void main(String args[])
    {
        try{
            Serv  s=new Serv ();
            Naming.rebind("rmi://127.0.0.1/sobject",s);
        }catch(Exception e){}

    }
}