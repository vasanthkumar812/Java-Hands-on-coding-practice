class Student{
    String name;
    int age;
    public void print(){
        System.out.println(this.name+" "+this.age);
    }
       
        Student(Student s2){
            this.name=s2.name;
            this.age=s2.age;
           
        }
        Student(){

        }
    
}
class Shape {
    int radius;
    public void area() {
        System.out.println("Displays Area of Shape");
    }
 }
 class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1/2)*b*h);
    }  
 }
 class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }  
}
 

public class oops {
   
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="ram";
        s1.age=21;
        Student s2=new Student(s1);
        s2.print();

        Circle cs=new Circle();
        cs.radius=3;
        cs.area();
        

    }
}
