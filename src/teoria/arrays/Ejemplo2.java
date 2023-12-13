package teoria.arrays;

public class Ejemplo2 {
    public static void main(String[] args) {
        //en una línea quiero un arrya de char
        char[] array = {'a', 'b', 'c', 'd'};
        char[] arrayInvertido = invertirArrayChar(array);
    }
    //un método que se le pasa un array de char
    //devuelve un array con los elemento en orden contrio
    //es decir el elemento 0 sería el último elemento
    //el último sería el primero, los medios se intercambian
    public static char[] invertirArrayChar(char[] array) {
        if (array == null)
            return null;
        char[] arrayInvertido = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length -1 - i];
        }
        return arrayInvertido;
    }



}
