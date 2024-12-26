package singletondesignprinciple;

public class Test {
    public static void main(String[] args) {
        Connection connection= Connection.callingmethod();

        System.out.println(connection.count);

        connection.count=10;

        System.out.println(connection.count);
        System.out.println(connection.hashCode());


        Connection connection1= Connection.callingmethod();

        System.out.println(connection1.count);

        connection1.count=20;

        System.out.println(connection1.count);
        System.out.println(connection1.hashCode());

        Connection connection2= Connection.callingmethod();

        System.out.println(connection2.count);

        connection1.count=30;

        System.out.println(connection2.count);
        System.out.println(connection2.hashCode());
    }
}

