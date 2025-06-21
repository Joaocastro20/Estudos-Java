package OracleJava21zo830.Inheritance.Interface;

 public interface CanFly {

    void canFly();

    public default int getAge(){
        return 1;
    }
}
