package homework;

import java.util.Objects;

public class Box {

    private String color;
    private int size;

    //создадим конструктор класа Box

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }

    //чтобы сравнить объекты box1 и в методе Main через метод equals нужно переопределить этот метод в классе Box (пока не совсем понял зачем)

    //при переопределении метода equals будет переопределяться и метод hashCode() (это тоже метод класса Object) вызовем их через Alt+Insert


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//сравнивает ссылки если равны значит объекты равны
        if (o == null || getClass() != o.getClass()) return false;//если наш объект==null или классы объектов разные (класс коробка не равен классу помидор)

       //теперь когда убедились что сравниваемые экземпляры класса являются экземплярами одного класса и при этом они не равны=null
        // значит эти объекты можено сравнить

        //теперь нашу коробку (объект) КАСТУЕМ (см. урок 6) т.е. делаем экземпляром класса Box,
        // чтобы была возможность обратиться к полям (переменным) класса Box
        Box box = (Box) o;

        //после кастования сравниваем значения полей
        return size == box.size && Objects.equals(color, box.color); //если размер сравниваемого объекта равен размеру объекта box (экземпляру класса Box)
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, size);
    }

    @Override
    public String toString() {
        return "Box{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}

