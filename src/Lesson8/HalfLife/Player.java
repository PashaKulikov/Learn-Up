package Lesson8.HalfLife;
/**
 * 1) Придумайте класс, который будет описывать текущий прогресс игрока в игре.
 * 2) Создайте методы, которые будут сохранять прогресс, а также подгружать его,
 * когда пользователь продолжает игру
 */

import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class Player implements Serializable {

    private static final long serialVersionUID = 1L;

    private int level;
    private String name;
    private int health;
    private String[] arms;
    private transient Date currentDate;

    public Player(int level, String name, int health, String [] arms) {
        this.level = level;
        this.name = name;
        this.health = health;
        this.arms = arms;
        this.currentDate = new Date();
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setArms(String[] arms) {
        this.arms = arms;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String[] getArms() {
        return arms;
    }

    @Override
    public String toString() {
        return "Player{" +
                "level=" + level +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", arms=" + Arrays.toString(arms) +
                '}';
    }

    /*
     Save progress
     */

    private static boolean save(Player player){
        try (FileOutputStream fos = new FileOutputStream("SerializableTest.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(player);

            return true;
        }catch (IOException e){
            return false;
        }
    }

    /*
     Load progress
     */

    private static Player loadPlayer(){
        try(FileInputStream fis = new FileInputStream("SerializableTest.txt");
                ObjectInputStream ois = new ObjectInputStream(fis)){
                final Object obj = ois.readObject();
                Player result = (Player) obj;
                return result;


        }catch (IOException | ClassNotFoundException e ){
            return null;
        }
    }


    public static void main(String[] args) throws IOException {
        File file = new File("SerializableTest.txt");
        if (!file.exists()) file.createNewFile();

        String[] arms = {"gun","bulletproof vest"};
        Player player1 = new Player(1,"PaKu",100,arms);
        save(player1);

        System.out.println(loadPlayer());



    }
}
