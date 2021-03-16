package application.Controllers;

import java.util.ArrayList;
import application.Models.*;

/**
 * Controller Para Usuarios
 *
 * @author  Carlos Rafael
 * @version 1.0
 * @since   2021-03-16
 */
public class ControllerUsuarios {
    private ArrayList <Usuario> div = new ArrayList<Usuario>();


    public int getSize() { return this.div.size(); }

    public ArrayList<String> getNomes() {
        ArrayList <String> aux = new ArrayList<String>();

        for(int i = 0; i < this.getSize(); i++) {
            aux.add(this.div.get(i).getNome());
        }
        return aux;
    }

    public String getNome(int index) { return this.div.get(index).getNome(); }

}
