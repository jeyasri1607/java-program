import java.util.Scanner;
public abstract class Shape{
int a,b;
shape(int x,int y){
a=x;
b=y;
}
abstract void printArea();
}
class rectangle extends Shape{
rectangle(int length,breath){
super(length,breath);
}
void printArea() {
int area=a*b;
System.out.println("rectangle area:"+area);
}
}
class circle extends Shape{
circle(int radius){
super(radius,0);
}
void printArea() {
float area=a*a;
System.out.println("circle area"+area);
}
}
class triangle extends Shape{
triangle(int base,int height){
super(base,height);
}
void printArea()
{
int area=0.5*a*b;
System.out.println("triangle area:"+area)
}
}


