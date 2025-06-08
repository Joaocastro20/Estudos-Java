package OracleJava21zo830.ObjectOriented.Nesteds;
import OracleJava21zo830.ObjectOriented.Nesteds.Persons.EstaticaPerson;
import OracleJava21zo830.ObjectOriented.Nesteds.Users.NaoEstaticaUsers;

public class PersonsTest {
    public static void main(String[] args) {
//        Persons.EstaticaPerson estaticaPerson = new Persons.EstaticaPerson();
//        estaticaPerson.show();

        EstaticaPerson estaticaPerson1 = new EstaticaPerson();
        estaticaPerson1.show();

        Users users = new Users();
        NaoEstaticaUsers naoEstaticaUsers =  users.new NaoEstaticaUsers();
        naoEstaticaUsers.show();
    }
}
