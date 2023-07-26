package homework01;

public class Circle {
    private float fRadius;
    final float Pl = 3.14f;

    void setRadius(float fR){
        fRadius = fR;
    }

    void showArea(){
        System.out.println("The area of circle is " + fRadius*fRadius*Pl);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.showArea();
    }
}
