package kick;

import lotr.Character;

import java.util.Random;

public class NobleKick implements KickStrategy{
    @Override
    public void kick(Character whoKick, Character opponent) {
        opponent.setHp(opponent.getHp() - new Random().nextInt(whoKick.getPower()));
    }
}
