package lotr;

import lombok.Getter;
import kick.KickStrategy;
import lombok.AllArgsConstructor;

@Getter @AllArgsConstructor
public abstract class Character {
    @Getter
    private int hp;
    @Getter
    private int power;
    private KickStrategy kick;

    public void kick(Character opponent){
        this.kick.kick(this, opponent);
    }

    public boolean isAlive(){
        return hp > 0;
    }

    public void setHp(int hp){
        this.hp = hp < 0 ? 0 : hp;
    }

    public void setPower(int power){
        this.power = power < 0 ? 0 : power;
    }

    public String toString(){
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
    
}
