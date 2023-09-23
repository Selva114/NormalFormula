//Ange between two clock

public class ClockAngle
{
public static void main(String args[])
{
int H=10;
int M=16;

double Angle=0.5*((60*H)-(11*M));
if(Angle>180)
{
Angle=Angle-360;
System.out.println(Angle);
}
else
{
System.out.println(Angle*(-1));
}

}
}
