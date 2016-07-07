/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExaFinal;

/**
 *
 * @author Oscar Torres
 */
public interface IAlmacen {
    
    void Comprar(Farmacia f);
    void Buscar(String nombre);
    void Mostrar();
    void COntar();
    void Contarxtip(String tipo);
}
