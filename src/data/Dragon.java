package data;

import java.time.LocalDateTime;
import java.util.Objects;

public class Dragon implements Comparable<Dragon> {
    private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Long age; //Значение поля должно быть больше 0, Поле не может быть null
    private long wingspan; //Значение поля должно быть больше 0
    private DragonType type; //Поле не может быть null
    private DragonCharacter character; //Поле не может быть null
    private DragonHead head;

    /**
     *
     * @param id
     * @param name имя
     * @param coordinates координаты
     * @param creationDate дата создания
     * @param age возраст
     * @param wingspan размах крыльев
     * @param type тип
     * @param character характер
     * @param head размер головы
     */

    public Dragon(Integer id, String name, Coordinates coordinates, LocalDateTime creationDate, Long age, long wingspan, DragonType type,
                  DragonCharacter character, DragonHead head){
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.age = age;
        this.wingspan = wingspan;
        this.type = type;
        this.character = character;
        this.head = head;
    }

    /**
     * @return id
     */
    public Integer getId(){return id;}
    /**
     * @return имя дракона
     */
    public String getName(){return name;}
    /**
     * @return координаты
     */
    public Coordinates getCoordinates(){return coordinates;}
    /**
     * @return дата создания
     */
    public LocalDateTime getCreationDate(){return creationDate;}
    /**
     * @return возраст
     */
    public Long getAge(){return age;}
    /**
     * @return размах крыльев
     */
    public long getWingspan(){return wingspan;}
    /**
     * @return размер головы
     */
    public DragonHead getHead(){return head;}
    /**
     * @return тип дракона
     */
    public DragonType getType(){return type;}
    /**
     * @return характер дракона
     */
    public DragonCharacter getCharacter(){return character;}

    public void setId( Integer id){this.id = id;}
    public void setName(String name){this.name = name;}
    public void setCoordinates(Coordinates coordinates){this.coordinates = coordinates;}
    public void setCreationDate(LocalDateTime creationDate){this.creationDate = creationDate;}
    public void setAge(Long age){this.age= age;}
    public void setWingspan(long wingspan){this.wingspan = wingspan;}
    public void setHead(DragonHead head){this.head = head;}
    public void setType(DragonType type){this.type = type;}
    public void setCharacter(DragonCharacter character){this.character = character;}

    /**
     * @param dragonObj Экземпляр класса Dragon, с которым необходимо сравнить
     * @return больше 0, если больше, меньше 0, если меньше, 0, если равно
     */
    @Override
    public int compareTo(Dragon dragonObj) {
        return id.compareTo(dragonObj.getId());
    }
    /**
     * @return Приводит объект к строковому виду
     */
    @Override
    public String toString() {
        String info = "";
        info += "Дракон №" + id;
        info += " (добавлен " + creationDate.toLocalDate() + " " + creationDate.toLocalTime() + ")";
        info += "\n Имя: " + name;
        info += "\n Местоположение: " + coordinates;
        info += "\n Возраст: " + age;
        info += "\n Размах крыльев: " + wingspan;
        info += "\n Тип: " + type;
        info += "\n Размер головы: " + head;
        info += "\n Характер: " + character;
        return info;
    }
    /**
     * @return хэш код данных
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, name, coordinates, creationDate, age, wingspan, type, head, character);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Dragon) {
            Dragon dragonObj = (Dragon) obj;
            return name.equals(dragonObj.getName()) && coordinates.equals(dragonObj.getCoordinates()) &&
                    (age == dragonObj.getAge()) && (wingspan == dragonObj.getWingspan()) &&
                    (type == dragonObj.getType()) && (head == dragonObj.getHead()) &&
                    character.equals(dragonObj.getCharacter());
        }
        return false;
    }

}
