
public class Funcion {


    public boolean esPalindromo(Object cadena){
        String cadenaAux = cadena.toString();

        String resultado = "";
        for(int i = cadenaAux.length()-1;i >=0;i--){
            resultado = resultado + cadenaAux.charAt(i);
        }
        if(cadenaAux.length() < 2){
            return false;
        }

        return resultado.equals(cadenaAux);
    }
}
