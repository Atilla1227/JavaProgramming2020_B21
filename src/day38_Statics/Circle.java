package day38_Statics;

public class Circle {

    public double radius, diameter, area, perimeter;

    public void setInfo(double radius){
        this.radius = radius;
        diameter = 2 * radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }


    public double calculateArea(){
        return radius * radius * Math.PI;
    }

    public double calculatePerimeter(){
        return diameter * Math.PI;
    }





}

/*
	1. create a custom class called Circle
				Attributes:
					radius, diameter, area, perimeter

				methods:
					calculateArea: returns the area of the circle

					calculatePerimeter: returns the perimeter of the circle

					setInfo: initializes all the instance of the Circle

					toString methods
 */