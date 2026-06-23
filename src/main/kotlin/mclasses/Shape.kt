package mclasses

sealed class Shape {

    class Circle(val radious:Float) : Shape()
    class Square(val sides:Int) : Shape()
    class Rectangle(val height:Int,val width:Int) : Shape()

}

fun main() {

    
    val circle = Shape.Circle(3.0F)
    val square = Shape.Square(10)
    val rectangle = Shape.Rectangle(8,10)

    getArea(circle)
    getArea(square)
    getArea(rectangle)

}

fun getArea(shape: Shape){
    when(shape){
        is Shape.Circle -> println("Area of circle : ${3.14 * (shape.radious*shape.radious)}")
        is Shape.Rectangle -> println("Area of Rectangle : ${(shape.height*shape.width)}")
        is Shape.Square -> println("Area of Square : ${(shape.sides*shape.sides)}")
    }
}