package lectures.lambda.lecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exercise {
    public static void main(String[] args) {
//        new Thread(() -> System.out.println("Lambda ....")).start();

        EmployeeMe john = new EmployeeMe("John Doe", 30);
        EmployeeMe tammam = new EmployeeMe("tammam", 44);
        EmployeeMe peter = new EmployeeMe("Peter", 35);
        EmployeeMe bernahrd = new EmployeeMe("Bernahrd", 30);
        EmployeeMe Ahmad = new EmployeeMe("Ahmad", 25);

        List<EmployeeMe> employeeMes = new ArrayList<>();
        employeeMes.add(john);
        employeeMes.add(tammam);
        employeeMes.add(peter);
        employeeMes.add(bernahrd);
        employeeMes.add(Ahmad);

        Collections.sort(employeeMes, (employeeMe1, employeeMe2) -> employeeMe1.getName().compareTo(employeeMe2.getName()));
        for (EmployeeMe employeeMe: employeeMes) {
            System.out.println(employeeMe.getName());
        }
    }
}

    class EmployeeMe {
        private String name;
        private int age;

        public EmployeeMe(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


