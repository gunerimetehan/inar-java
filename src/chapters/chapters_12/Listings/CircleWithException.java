package chapters.chapters_12.Listings;


public class CircleWithException {
        private double radius;
        private static int numberOfObjects=0;

    public CircleWithException(){
        this(1.0);
            numberOfObjects++;
        }
    public CircleWithException(double newRadius){
            setRadius(newRadius);
            numberOfObjects++;
        }

        public static int getNumberOfObjects() {
            return numberOfObjects;
        }

        public static void setNumberOfObjects(int numberOfObjects) {
            CircleWithException.numberOfObjects = numberOfObjects;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) throws IllegalArgumentException {
            if (radius >= 0) {
                this.radius = radius;
            }else {
                throw new IllegalArgumentException("Radius cannot be negative");
            }
        }
        public double getArea(){
            return radius*radius*Math.PI;
        }
    }

