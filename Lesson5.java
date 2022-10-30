package ru.geekbrains;

public class Lesson5 {
    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Fedorov Fedr", "Director", "FF@gos.com", "512-25-25", 350,45);
        empArray[1] = new Employee("Ivanov Ivan", "Manager", "II@gos.com", "512-24-24", 250,39);
        empArray[2] = new Employee("Kirilov Kiril", "SisAdmin", "KK@gos.com", "512-23-23", 150,41);
        empArray[3] = new Employee("Petrov Petr", "Secretary", "PP@gos.com", "512-22-22", 300,43);
        empArray[4] = new Employee("Nikolaev Nikolai", "Senior manager", "NN@gos.com", "512-21-21", 340,35);

        for(Employee emp : empArray) {
            if(emp.getAge() >= 40) {
                emp.displayInfo();
            }
        }

    }
}