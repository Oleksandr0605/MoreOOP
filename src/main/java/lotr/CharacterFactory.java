package lotr;

import java.util.Random;
import org.reflections.*;
import org.reflections.util.ConfigurationBuilder;

import java.lang.reflect.Constructor;
import java.util.Set;

public class CharacterFactory{
    private static Reflections scanner = new Reflections(new ConfigurationBuilder().forPackage("lotr"));
    private static Random characterPicker = new Random();
    public static Character createCharacter(){
        Set<Class<? extends Character>> characters = scanner.getSubTypesOf(Character.class);
        int randomIndex = characterPicker.nextInt(characters.size());
        Class<? extends Character> randomCharacter = (Class<? extends Character>) characters.toArray()[randomIndex];
        try{
            Constructor<? extends Character> constructor = randomCharacter.getConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            System.out.println("Error creating character");
            return null;
        }
    }
}
