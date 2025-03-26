package org.example;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Ярик!" );
        Tester tester1 = new Tester("Илья", "Надосин");
        Tester tester2 = new Tester("Ярик", "Цалей", 5);
        Tester tester3 = new Tester("Кирилл", "Волчооо", 3, "C1", 5000.0);
        tester1.printInfo();
        tester2.printInfo(true);
        tester3.printInfo("Experienced tester");
        Tester.printCompanyInfo();
    }
}