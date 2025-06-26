
public class ejercicio1 extends Object {
	
	private float kilogramos;
	
public ejercicio1()
{
	kilogramos = 0;
}

public void SetPeso(float kilogramos)
{
	this.kilogramos = (kilogramos >= 0)?kilogramos :0;
}
public float GetPeso()
{
	return kilogramos;
}

public float conversion()
{
	return (float) (kilogramos * 2.2046);
}

}