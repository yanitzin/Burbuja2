/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ismae
 */
public class classUsuario {
    //ATRIBUTOS
    private String usuario;
    private String clave;
    private String nivel;

    public classUsuario(String usuario,String clave,String nivel){
       this.usuario=usuario;
       this.clave=clave;
       this.nivel=nivel;
    }
    //GET Y SET
    public String getUsuario(){
       return usuario;
   }
   public void setUsuario(String usuario){
       this.usuario=usuario;
   }
   public String getclave(){
       return clave;
       
   }
   public void setclave(String clave){
       this.clave=clave;
   }
   public String getnivel(){
       return nivel;
   }
   public void setnivel(String nivel){
       
       this.nivel=nivel;
   }
}
