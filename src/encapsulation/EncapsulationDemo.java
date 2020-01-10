package encapsulation;

public class EncapsulationDemo {


    public static void main(String[] args) {
        RegistrationDomain domain=new RegistrationDomain();
        System.out.println(domain.getName());
        System.out.println(domain.getAddress());
        System.out.println(domain.getId());
        System.out.println(domain.getUsername());
        System.out.println(domain.getPassword());

    }

}
