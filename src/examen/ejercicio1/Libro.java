package examen.ejercicio1;

public record Libro(String titulo, String autor, Tematica tematica, String isbn) {
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s", titulo, autor, isbn, tematica);
    }
}
