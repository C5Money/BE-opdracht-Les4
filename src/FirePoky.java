public class FirePoky extends Pokemon {
//    Instance Variables
    private boolean flame = false;


//    Constructor
    public FirePoky(String type, String name, int level, int hp, String sound, String food, boolean flame){
        super(type, name, level, hp);
        this.setFlame(flame);
    }


//    Getters en Setters
    public boolean getFlame() {
        return flame;
    }

    public void setFlame(boolean flame) {
        this.flame = flame;
    }


//    Instance methods
    public void inferno(){
        if(getLevel() == 1) {
            setFlame(true);
            if(getFlame()) {
                System.out.println("Ik blaas vuur!");
            } else {
                System.out.println("Ik heb nog geen vlam. Want mijn level is 0 !");
            }
        } else {
            System.out.println("Ik ben VUURIGGGGG, maar mijn level is te laag. Ik ben er nog niet klaar voor!");
        }
    }

    @Override
    public void speaks() {
        System.out.println(getName() + "blaaaaaze!");
    }

    @Override
    public void fights() {
    }
}
