package utilidades;

public class UtilidadesGenerales 
{

	public UtilidadesGenerales() 
	{
		// TODO Auto-generated constructor stub
	}

	
	// UTILIDAES GENERALES
    public static boolean isNumeric(String cadena) 
    {
        boolean resultado;

        try 
        {
            Integer.parseInt(cadena);
            resultado = true;
        } 
        catch (NumberFormatException excepcion) 
        {
            resultado = false;
        }

        return resultado;
    }
    
    public static boolean isNumeric(Double numero) 
    {
        boolean resultado;

        try 
        {
            
            resultado = true;
        } 
        catch (NumberFormatException excepcion) 
        {
            resultado = false;
        }

        return resultado;
    }

    
    public static boolean isUnA�o(int any) 
    {
        boolean resultado;
        
        if (any > 1900)
            resultado = true;
        else
        	resultado = false;

        return resultado;
    }
    
}
