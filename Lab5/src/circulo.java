
public class circulo extends Object {
	
	private int radio;
	
public circulo()
{
	radio = 0;
}

public void rad(int radio)
{
	this.radio = (radio >= 0)?radio :0;
}

public double calculoA()
{
	return (double) (Math.PI * Math.pow(radio, 2));
}

public double calculoC()
{
	return (double) (2 * Math.PI * radio);
}
public int Getrad()
{
return radio;	
}
}
