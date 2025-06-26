
public class solicitud extends Object{
	
	private String nombre;
	private Telefono dom;
	
public solicitud()
{	
}

public solicitud(String M, Telefono DM)
{
	nombre = M;
	dom = DM;
}

public void SetAsignar(String M, Telefono DM)
{
	nombre = M;
	dom = DM;
}

public String toString()
{
	return "\n" + nombre + "\t" + dom.IMPc() + "\n";
}

}
