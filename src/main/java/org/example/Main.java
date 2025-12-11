package org.example;

public class Main {
    static class Patient {
        private String name;
        private int age;

        public Patient() {
            this.name = "unknown";
            this.age = 0;
        }

        public Patient(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void printInfo() {
            System.out.println("Patient: " + name + ", age: " + age);
        }
    }
    static class MedicalProfessional{
        private String name;
        private String specialty;

        public MedicalProfessional(){
        this.name = "unknown";
        this.specialty = "none";
        }

        public MedicalProfessional(String name, String specialty){
            this.name = name;
            this.specialty = specialty;
        }

        public String getName(){return name;}
        public String getSpecialty(){return specialty;}

        public void setName(String name){this.name = name;}
        public void setSpecialty(String specialty){this.specialty = specialty;}
        public void printInfo(){
            System.out.println("Doctor: " + name + ", specialty: " + specialty);
        }
    }

    static class Hospital{
        private String name;
        private String city;

        public Hospital(){
            this.name = "unknown";
            this.city = "unknown";
        }

        public Hospital(String name, String city){
            this.name = name;
            this.city = city;
        }

        public String getName(){return name;}
        public String getCity(){return city;}
        public void setName(String name){this.name = name;}
        public void setCity(String city){this.city = city;}
        public void printInfo(){
            System.out.println("Hospital: " + name + ", city: " + city);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Bekzat", 17);
        Patient p2 = new Patient();
        p2.setName("Miras");
        p2.setAge(34);

        MedicalProfessional doc1 = new MedicalProfessional("Dr.Kublanov", "Dentist");

        Hospital h1 = new Hospital("Central Hospital", "Aktobe");

        System.out.println("===Information===");
        p1.printInfo();
        p2.printInfo();
        doc1.printInfo();
        h1.printInfo();

        System.out.println("\n===Comparison===");
        if (p1.getAge() > p2.getAge()){
            System.out.println(p1.getName() + " is older than " + p2.getName());
        }
        else if (p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is equal to " + p2.getName());
        }
        else {
            System.out.println(p2.getName() + " is older than " + p1.getName());
        }
    }
}
