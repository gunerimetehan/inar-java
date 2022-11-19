package chapters.chapters_10.Exercises.Exercise_13;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D(){
    this(0,0,1,1);
    }


    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
    public boolean contains(double x,double y){
        boolean xInside = x >=(getX()-width/2) && x<=(getX()+width/2);

        boolean yInside = y >=(getY()-height/2) && y<=(getY()+height/2);

        return xInside && yInside;
    }
    public boolean contains(MyRectangle2D r){
        boolean leftAndRightIsInside = r.getX()-r.width/2>=(getX()-width/2) && r.getX()-r.width/2<=(getX()+width/2);

        boolean upAndDownInside =  r.getY()-r.getHeight()/2 >=(getY()-height/2) && r.getY()-r.getHeight()/2<=(getY()+height/2);

        return leftAndRightIsInside && upAndDownInside;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
