package lotr;

public class GameManager {
        public void fight(Character c1, Character c2){
            while (c1.isAlive() && c2.isAlive()){
                c1.kick(c2);
                System.out.println(c1 + " kick " + c2);
                System.out.println(c1.getClass().getSimpleName() + " hp = " + c1.getHp());
                System.out.println(c2.getClass().getSimpleName() + " hp = " + c2.getHp());
                c2.kick(c1);
                System.out.println(c2 + " kick " + c1);
                System.out.println(c1.getClass().getSimpleName() + " hp = " + c1.getHp());
                System.out.println(c2.getClass().getSimpleName() + " hp = " + c2.getHp());
            }
        }
}
