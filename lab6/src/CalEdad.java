
public class CalEdad extends Object {

	private String nombre;
	private Fecha Fnac;
	private Fecha Fact;
	
public CalEdad()
{	
}

public CalEdad(String M, Fecha FN, Fecha FA)
{
	nombre = M;
	Fnac = FN;
	Fact = FA;
}

public void SetAsignar(String M, Fecha FN, Fecha FA)
{
	nombre = M;
	Fnac = FN;
	Fact = FA;	
}

public int Edad()
{
	int CE;
		if(Fnac.mes < Fact.mes)
		{
			CE = Fact.año - Fnac.año;
		}
		else if(Fnac.mes > Fact.mes)
		{
			CE = (Fact.año - Fnac.año) - 1;
		}
		else if(Fnac.dia <= Fact.dia)
		{
			CE = Fact.año - Fnac.año;
		}
		else 
		{
			CE = (Fact.año - Fnac.año) - 1;
		}
		
	return CE;
}

public String toString()
{ 
	return nombre + "\t" + Fnac.IMPfe() + "\t" + Edad() + "\n";
}
}
