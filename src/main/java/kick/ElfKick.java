package kick;

import lotr.Character;

public class ElfKick implements KickStrategy{
    public void kick(Character whoKick, Character opponent) {
        if (opponent.getHp() < whoKick.getHp()) {
            opponent.setHp(0);
        } else {
            opponent.setPower(opponent.getPower() - 1);
        }
    }
}
