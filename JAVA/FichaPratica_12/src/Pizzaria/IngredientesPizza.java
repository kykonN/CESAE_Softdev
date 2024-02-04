package Pizzaria;




public class IngredientesPizza {


    private double quantidade;

    private Ingredientes ingrediente;


    public IngredientesPizza(double quantidade, Ingredientes ingrediente) {
        this.quantidade = quantidade;
        this.ingrediente = ingrediente;
    }
    //***********************************************************************************************
    public double getQuantidade() {
        return quantidade;
    }

    public Ingredientes getIngrediente() {
        return ingrediente;
    }
//***********************************************************************************************
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void setIngrediente(Ingredientes ingrediente) {
        this.ingrediente = ingrediente;
    }
}
