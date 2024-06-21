
public class Cat extends Animal{
    private String littlePreference;

    public Cat(String name){
        this.name = name;
    }

    public Cat(){
        System.out.println("meao");
    }

    public String getLittlePreference(){
        return littlePreference;
    }

    public void setLittlePreference(String littlePreference){
        this.littlePreference = littlePreference;
    }
}
