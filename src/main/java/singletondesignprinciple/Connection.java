package singletondesignprinciple;

public class Connection {
    private static final Connection connection=new Connection();
    public  int count=1;
    private  Connection (){
        System.out.println("from private constructor");
    }
    public static  Connection callingmethod(){
        return connection;
    }
}
