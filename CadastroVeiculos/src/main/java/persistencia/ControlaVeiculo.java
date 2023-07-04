/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.ArrayList;
import negocio.Veiculo;

/**
 *
 * @author marcu
 */
public class ControlaVeiculo {
    private final ArrayList<Veiculo> veiculos = new ArrayList<>();
    
    public boolean salvar (Veiculo v){
        if (v != null) {
            veiculos.add(v);
            return true;
        }else{
        return false;
    }
    }
    public ArrayList<Veiculo> retornarTodos () {
        return veiculos;
    }
}