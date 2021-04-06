import java.util.Arrays;

public class Point3D extends Point2D{
    private double z;
    public Point3D(){

    }
    public  Point3D(double x, double y, double z){
        super(x,y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public void setXYZ(double x, double y ,double z){
        super.setXY(x,y);
        this.z = z;
    }
    public double[] getXYZ(){
        return new double[] {this.getX(),this.getY(),this.getZ()};
    }
    public String toString(){
        return Arrays.toString(this.getXYZ());
    }
}
