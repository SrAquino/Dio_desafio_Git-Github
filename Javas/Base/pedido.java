package Javas.Base;

public class pedido {
    private final String code;

    public pedido(String code){
        this.code = code;
    }
    
    @Override
    public String toString(){
        return "Ordem: " + code;
    }
    
}
