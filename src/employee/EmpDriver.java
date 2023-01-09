package employee;

public class EmpDriver {
    public static void main(String[] args) {


        Employee calisan1 = new Employee("kemal",2000,45,1985);
        System.out.println(calisan1);
        calisan1.vergi();
        calisan1.maasZammi();
        calisan1.bonus();
    }
}
