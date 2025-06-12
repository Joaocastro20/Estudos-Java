package OracleJava21zo830.Inheritance.Sealed;

 sealed class Animals permits Dog, Bird {

    int legs;

    void showLegs(){
        System.out.println("Legs" + legs);
    }

    protected void eat(String animal){
        System.out.println(animal + "eat food!");
    }

     void drink(String animal){
        System.out.println(animal + "drink water!");
    }

    private void move(String animal){
        System.out.println(animal + "move!");
    }

    public void breath(String animal){
        System.out.println(animal + "breath!");
    }


}
