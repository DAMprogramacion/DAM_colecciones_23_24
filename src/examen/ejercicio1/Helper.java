package examen.ejercicio1;

public class Helper {
    public static boolean esCorrectaTematica(String tematica) {
        return tematica.toLowerCase().matches("literatura|ciencias|tecnolog[ií]a");
    }
    public static boolean validarISBN (String isbn) {
        return isbn.matches("0[0-9]{9}|84[0-9]{8}");
    }

}
