4) Переписать код в соответствии с Liskov Substitution Principle:
public class Rectangle {
private int width;
private int height;
public void setWidth(int width) {
this.width = width;
}
public void setHeight(int height) {
this.height = height;
}
public int area() {
return this.width * this.height;
}
}
public class Square extends Rectangle {
@Override
public void setWidth(int width) {
super.width = width;
super.height = width;
}
@Override
public void setHeight(int height) {
super.width = height;
super.height = height;
}
}
•


Исправления:

В классе Rectangle добавлен конструктор, принимающий ширину и высоту, чтобы обеспечить правильное создание прямоугольников.
В классе Square конструктор теперь принимает только длину стороны, так как квадрат всегда имеет одинаковую ширину и высоту.
Методы setWidth и setHeight в классе Square переопределены, 
чтобы гарантировать, что при изменении ширины или высоты квадрата изменяются и ширина, и высота.