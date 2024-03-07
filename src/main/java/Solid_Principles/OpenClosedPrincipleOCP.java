package Solid_Principles;

/*
Software entities should be open for extension, but closed for modification.

    Software entities (classes, modules, functions, etc.) should be open for extension but
    closed for modification. This principle suggests that you should be able to add
    new functionality to an object or method without altering its existing code,
    promoting reusability and avoiding bugs introduced by changes.
*/

//Before applying OCP:
class Rectangle {
    public double length;
    public double width;
}

class AreaCalculator {
    public double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }
}

//After applying OCP:
interface ShapeCalculator {
    public double calculateArea();
}

class Rectangle2 implements ShapeCalculator {
    public double length;
    public double width;

    public double calculateArea() {
        return length * width;
    }
}

class Circle implements ShapeCalculator {
    public double radius;

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator2 {
    public double calculateShapeArea(ShapeCalculator shapeCalculator) {
        return shapeCalculator.calculateArea();
    }
}











public class OpenClosedPrincipleOCP {
}
