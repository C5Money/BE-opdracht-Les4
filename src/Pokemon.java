// Instance variables
public abstract class Pokemon {
    private String type;
    private String name;
    private int level;
    private int hp;


//    Constructor
    public Pokemon(String type, String name, int level, int hp) {
        this.setType(type);
        this.setName(name);
        this.setLevel(level);
        this.setHp(hp);
    }

//    Getters en Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


//    Instance methods
    public int eats(){
        int hp = getHp()+1;
        System.out.println("Nom nom nom... Ik heb nu " + hp + " hp. Ik voel me alweer een stuk sterker!!!");
        setHp(hp);
        if (hp == 5){
            System.out.println("Mijn hp is nu " + hp + ". Ik bereik een nieuwe level !!!");
            int level = getLevel() +1;
            System.out.println("Mijn level is: " + level);
        }
        return hp;
    }

    public abstract void speaks();

    public abstract void fights();

}
