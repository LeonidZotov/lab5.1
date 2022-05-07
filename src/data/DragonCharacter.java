package data;
/**
 * enum, хранящий в себе значения характеров дракона
 */
public enum DragonCharacter {
    WISE,
    GOOD,
    CHAOTIC,
    CHAOTIC_EVIL;


    public static String nameList() {
        String nameList = "";
        for (DragonCharacter dragonCharacter : values()) {
            nameList += dragonCharacter.name() + ", ";
        }
        return nameList.substring(0, nameList.length()-2);
    }
}
