import java.util.Objects;

public class Cat {

    private String owner;
    private String nickName;
    private String color;
    private String breed;
    private int age;

    private int weight;

    public Cat(String owner, String nickName, String color,
               String breed,
               int age,
               int weight){
        this.nickName = nickName;
        this.owner = owner;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public String getOwner(){
        return owner;
    }

    public String getNickName(){
        return nickName;
    }

    public String getColor(){
        return color;
    }

    public int getAge(){
        return age;
    }

    public String getBreed(){
        return breed;
    }

    public void setOwner(String Owner){
        this.owner = owner;
    }

    public void setNickName(String nickName){
        this.nickName = nickName;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void setAge(int age){
        this.age = age;
    }




    @Override
    public String toString() {
        return "Cat{" +
                "Владелец='" + owner + '\'' +
                ", Кличка='" + nickName + '\'' +
                ", Цвет='" + color + '\'' +
                ", Порода='" + breed + '\'' +
                ", Возраст=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(owner, cat.owner) && Objects.equals(nickName, cat.nickName) && Objects.equals(color, cat.color) && Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, nickName, color, breed, age);
    }
}
