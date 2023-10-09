package lotr;


public class main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        Character c1 = new Hobbit();
        Character c2 = new Elf();
        gameManager.fight(c1, c2);
        System.out.println("---------------");
        Character c3 = new King();
        Character c4 = new Knight();
        gameManager.fight(c3, c4);
        System.out.println("---------------");
        Character c5 = CharacterFactory.createCharacter();
        Character c6 = CharacterFactory.createCharacter();
        gameManager.fight(c5, c6);
        System.out.println("---------------");
    }
}