
public class alumnos extends Object {
	
	protected int n1,n2,n3;
	
public alumnos()
{
	n1 = 0;
	n2 = 0;
	n3 = 0;
}

public void SetAsignar(int n1, int n2, int n3)
{
	this.n1 = n1;
	this.n2 = n2;
	this.n3 = n3;
}

public String IMPC()
{
	return n1 + "\t" + n2 + "\t" + n3;
}
}
