package org.example;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;
    public Tester(String name, String surname) {
        this(name, surname, 0, "B1", 0.0);
    }
    public Tester(String name, String surname, int expirienceInYears) {
        this(name, surname, expirienceInYears, "B1", 0.0);
    }
    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }
    public void printInfo() {
        System.out.println("Name: " + name + ", Surname: " + surname);
    }
    public void printInfo(boolean includeSalary) {
        printInfo();
        if (includeSalary) {
            System.out.println("Salary: " + salary);
        }
    }
    public void printInfo(String additionalInfo) {
        printInfo();
        System.out.println("Additional Info: " + additionalInfo);
    }
    public static void printCompanyInfo() {
        System.out.println("Company: TestCorp");
    }
    @Override
    public String toString() {
        return name;
    }
}