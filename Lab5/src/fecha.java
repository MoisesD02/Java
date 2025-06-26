
public class fecha extends Object {
	
	private int dia, mes, año;

public fecha()
{
	dia = 0;
	mes = 0;
	año = 0;
}

public void Asignar(int dia, int mes, int año)
{
	this.dia = (dia >= 0 && dia <= 30)?dia :0;
	this.mes = (mes >= 0 && mes <=12)?mes : 0;
	this.año = (año >= 1900 && año <= 3000)?año : 0;
}

public String formato()
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
	return dia + "  de  " + resultado + "  del  " + año;
}
}