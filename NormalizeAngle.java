 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){  
    int newAngle = angle;
    while (newAngle <= -180) newAngle += 360;
    while (newAngle > 180) newAngle -= 360;
    return newAngle;

    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        int angle = Math.floorMod(integer, 360);
        return angle;
    }

    public static void main(String[] args){

    }
}
