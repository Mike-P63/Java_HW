package ClassWork6;

import java.time.LocalDate;
import java.util.Objects;

//1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны
// для приложения, которое является
//а) информационной системой ветеринарной клиники
//б) архивом выставки котов
//в) информационной системой Театра кошек Ю. Д. Куклачёва
//Можно записать в текстовом виде, не обязательно реализовывать в java.
public class Cat {
    Bread bread;
    LocalDate birthday;
    Owner owner;
    Color color;
    Gender gender;

    public Cat (Bread bread, LocalDate birthday, Color color, Gender gender ){
        this.bread = bread;
        this.birthday = birthday;
        this.owner = owner;
        this.color = color;
        this.gender = gender;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "bread=" + bread +
                ", birthday=" + birthday +
                ", owner=" + owner +
                ", color=" + color +
                ", gender=" + gender +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return bread == cat.bread && Objects.equals(birthday, cat.birthday) && color == cat.color && gender == cat.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bread, birthday, color, gender);
    }


    public Bread getBread() {
        return null;
    }
}
