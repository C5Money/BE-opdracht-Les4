public class ElectroPoky extends Pokemon{
//    Instance Variable
    private boolean electricity;


//    Constructor
    public ElectroPoky(String type, String name, int level, int hp, boolean electricity) {
        super(type, name, level, hp);
        this.setElectricity(electricity);
    }


//    Getters en Setters
    public boolean getElectricity() {
        return electricity;
    }

    public void setElectricity(boolean electricity) {
        this.electricity = electricity;
    }


    //    Instance method
    public void electroBall(){
        System.out.println("Chiii Dooo Riiiii");
    }

    @Override
    public void speaks() {
        System.out.println(getName() + "bzzzt!");
    }

    @Override
    public void fights() {

    }
}
