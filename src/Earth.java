public class Earth extends Pokemon {
    //     Instance Variable
    private String color;


    //    Constructor
    public Earth(String type, String name, int level, int hp, String color) {
        super(type, name, level, hp);
        this.color = color;
    }


    //    Getters en Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //    Instance methods

    @Override
    public void speaks() {
        System.out.println(getName() + "Moeeeeeeeeeeeeeeeewwwww!" +getName());
    }

    @Override
    public void fights() {
    }

}
