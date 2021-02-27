import java.rmi.*;
import java.util.*;
class Client{
    public static void main(String args[])
    {
        try
        {
            Inter in =( Inter)Naming.lookup("rmi://127.0.0.1/sobject");
            Scanner input =new Scanner(System.in);
            System.out.println("Enter Your Name");
            String name=input.next();
            String output=in.sum(name);
            System.out.println(output);
        }
        catch(Exception e){}
    }
}