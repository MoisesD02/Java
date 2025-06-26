
public class rectangulo extends Object {
	private int base, altura;
	
public rectangulo()
{
	base = 1;
	altura = 1;
}

public void Setbas1(int base)
{
	this.base = (base > 1)?base :1;
}

public void Setaltura(int altura)
{
	this.altura = (altura > 1)?altura :1;
}

public int CalArea()
{
	return (base) * (altura);
}

public int CalP()
{
	
	return (base * base) + (altura * altura);
}

public int Getbas1()
{
	return base;
}

public int Getaltura()
{
	return altura;
}

}
