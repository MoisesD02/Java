
public class poligono extends Object {
	
	protected int radio;
	
public poligono()
{
	radio = 1;
}

public void SetAsignar(int radio)
{
	this.radio = radio;
}

public float GetAsignar()
{
	return radio;
}
public float CalcularA()
{
	return (float) (4 * Math.PI * Math.pow(radio, 2));
}

public float CalcularV()
{
	return (float) ((4.0 / 3.0) * Math.PI * Math.pow(radio, 3));
}
}
