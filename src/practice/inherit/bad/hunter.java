package inherit.bad;

public class hunter {
    String name;
    int level;
    int atk;
    int hp;
    int pet;

    void characterInfo() {
        System.out.println("캐릭터의 정보");
        System.out.println("아이디: " + name);
        System.out.println("레벨: " + level);
        System.out.println("공격력: " + atk);
        System.out.println("체력: " + hp);
        System.out.println("펫: "+ pet);
    }
}
