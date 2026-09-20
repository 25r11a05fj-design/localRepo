class Vehicle{
int speed;
void drive()
{

System.out.print("Drive");
}
}
class Car extends Vehicle
{
void honk()
{
System.out.print("HOnkk");
}
}


class main {
public static void main(String[]args)
{
 Vehicle v = new Vehicle();
v.speed=90;
v.drive();
v.honk();

}
}