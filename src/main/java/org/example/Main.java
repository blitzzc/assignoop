package org.example;

public class Main {
    static class Patient {
        private String name;
        private int age;

        public Patient(){}

        public Patient(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName(){return name;}
        public int getAge(){return age;}

        public void setName(String name){this.name = name;}
        public void setAge(int age){this.age = age;}

        public void printI(){
            System.out.println("Patient: " + name + ", age: " + age);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Bekzat", 17);
        Patient p2 = new Patient();
        p2.setName("Buzoni");
        p2.setAge(34);

        p1.printI();
        p2.printI();
    }
}
