
public class Fecha extends Object{
	
	protected int dia, mes, año;
	
public Fecha()
{
	dia = 1;
	mes = 1;
	año = 1900;
}

public void SetAsignar(int d, int m, int a)
{
	año = (a >= 1900 && a <= 3000)?a :1900;
	mes = (m > 0 && m <= 13)?m :1;
	dia = SetDia(d);
}

public int SetDia(int d)
{
	int DM[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
		if(d > 0 && d <= DM[mes])
		{
			return d;
		}
		else
		{
			return 1;
		}
}

public String IMPfe()
{
	
String resultado = null;
	
	switch(mes)
	{
	case 1:
		resultado = "Enero";
		break;
	case 2 : 
		resultado = "Febrero";
		break;
	case 3:
		resultado = "Marzo";
		break;
	case 4 : 
		resultado = "Abril";
		break;
	case 5:
		resultado = "Mayo";
		break;
	case 6 : 
		resultado = "Junio";
		break;
	case 7:
		resultado = "Julio";
		break;
	case 8 : 
		resultado = "Agosto";
		break;
	case 9:
		resultado = "Septiembre";
		break;
	case 10 : 
		resultado = "Octubre";
		break;
	case 11:
		resultado = "Noviembre";
		break;
	case 12 : 
		resultado = "Diciembre";
		break;
	default: 
		resultado = "Invalido";			
	}
	return dia + " de " + resultado + " de " + año;
}

}
