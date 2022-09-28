public class AquaPoky extends Pokemon {

//     Instance Variable
    private boolean swim;


//    Constructor
    public AquaPoky(String type, String name, int level, int hp, boolean swim) {
        super(type, name, level, hp);
        this.swim = swim;
    }

    //    Getters en Setters
    public boolean getSwim() {
        return swim;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }


    //    Instance methods
    public void swim(){
        if(swim){
            System.out.println("Ik hou van het water!");
        } else {
            System.out.println("Alleen tot mijn tenen. Ik ben er nog niet klaar voor");
        }
    }

    @Override
    public void speaks() {
        System.out.println(getName()+"flooood!");
    }

    @Override
    public void fights() {
    }

}
