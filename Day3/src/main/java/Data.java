public class Data {
    public static void main(String[] args) {
        Employee obj1 = new Employee();
        Employee obj2 = new Employee();
        Employee obj3 = new Employee("murugan",1245,"Trainee");

        obj1.setId(123);
        obj1.setName("Praveen");
        obj1.setPhoneNumber(12345);
        obj1.setRoleName("Trainee");
        obj1.setEmailId("Praveen121lingam@gmail.com");

        obj3.setEmailId("murugan@gmail.com");
        obj3.setPhoneNumber(12345);
        obj3.showEmpDetails();


        obj2.setName("Lingam");
        obj2.setId(567);
        obj2.setRoleName("Trainee");
        obj2.setPhoneNumber(67890);
        obj2.setEmailId("lingam@gmail.com");


    }
}
