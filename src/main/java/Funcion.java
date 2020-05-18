
public class Funcion {
    public boolean esPalindromo(String cadena){
        String resultado = "";
        for(int i = cadena.length()-1;i >=0;i--){
            resultado = resultado + cadena.charAt(i);
        }
        System.out.println("¿"+resultado+" = "+cadena+"?");
        return resultado.equals(cadena);
    }
}
