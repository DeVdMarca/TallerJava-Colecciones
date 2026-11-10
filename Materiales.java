package Taller_Colecciones_Java;

public abstract class Materiales implements  Catalogable {
   private String codigo;
    private String titulo;
    private int año;
    private boolean disponible;

    public Materiales() {
    }

    public Materiales(String codigo, String titulo, int año, boolean disponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.año = año;
        this.disponible = disponible;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAño() {
        return año;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public abstract String getTipo();
    public void mostrarInfo(){
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Titulo: " + this.getTitulo());
    }
}
