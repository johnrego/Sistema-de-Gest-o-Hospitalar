/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.gestao.consultas.entidades;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author jeffe
 */
@Entity
@Table(name="administrador")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String user;
    @Column
    private String senha;    
    
    public Administrador(String user, String senha){
        this.user = user;
        this.senha = senha;
    }
    public boolean validaLogin(){
        if(user.equals("admin")&&senha.equals("admin")){
            return true;
        }
        else{
            return false;
        }
    }    
}