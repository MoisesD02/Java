
public class composicion extends Object{
	
	private String nombre;
	private alumnos Al;

public composicion()
{
}

public composicion(String M, alumnos Cl)
{
	nombre = M;	
	Al = Cl;
}

public void SetAsignar(String M, alumnos Cl)
{
	nombre = M;
	Al = Cl;
}

public float CalP()
{
	float max1,max2 = 0;
	if(Al.n1 >= Al.n2 && Al.n1 >= Al.n3)
	{
		max1 = Al.n1;
		max2 = Math.max(Al.n2, Al.n3);
	}
	else if (Al.n2 >= Al.n1 && Al.n2 >= Al.n3)
	{
		max1 = Al.n2;
		max2 = Math.max(Al.n1, Al.n3);
	}
	else
	{
		max1 = Al.n3;
		Math.max(Al.n1, Al.n2);
	}
	float promedio = (max1 + max2) / 2;
	return promedio;
}

public String toString()
{
	return nombre + "\t" + Al.IMPC() + "\t" + CalP() + "\n";
}

}
