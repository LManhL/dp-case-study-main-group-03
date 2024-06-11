package entity.payment;

import java.lang.reflect.InvocationTargetException;

public class CardCreatorFactory {
    public static CardCreator getCardCreator(String className) {
        try {
            String fullName = "entity.payment." + className;
            Class<?> clazz = Class.forName(fullName);
            Object instance = clazz.getDeclaredConstructor().newInstance();
            return (CardCreator) instance;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
