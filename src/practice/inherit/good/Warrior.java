package inherit.good;

public class Warrior extends Player{

    int rage;

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("rage = " + rage);
    }

}
