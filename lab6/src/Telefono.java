
public class Telefono extends Object{
	
	protected String domicilio, trabajo, celular;

public Telefono()
{
	domicilio = null;
	trabajo = null;
	celular = null;
}

public void SetAsignar(String d, String t, String c)
{
	domicilio = d;
	trabajo = t;
	celular = c;
}

public String IMPc()
{
	return domicilio + " / " + trabajo + " / " + celular;
}
}
