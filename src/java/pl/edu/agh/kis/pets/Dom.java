package pl.edu.agh.kis.pets;

/**
 * Created by wojtek on 23.05.17.
 */
public class Dom {
    private int length;
    private int age;
    private MyStyle style;

    public Dom(int length, int age, MyStyle style) {
        this.length = length;
        this.age = age;
        this.style = style;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyStyle getStyle() {
        return style;
    }

    public void setStyle(MyStyle style) {
        this.style = style;
    }
}
