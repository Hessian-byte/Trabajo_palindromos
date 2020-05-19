
public class Funcion {


    public boolean esPalindromo(Object cadena) {
        String cadenaAux = cadena.toString();

        String resultado = "";
        cadenaAux = cadenaAux.replaceAll(" ", "");
        cadenaAux = cadenaAux.toLowerCase();
        if (cadenaAux.length() < 2) {
            return false;
        } else {

            for (int i = cadenaAux.length() - 1; i >= 0; i--) {
                resultado = resultado + cadenaAux.charAt(i);
            }


            return resultado.equals(cadenaAux);
        }
    }
}
