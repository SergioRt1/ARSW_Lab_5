/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arsw.lab5.beans;

import arsw.lab5.model.Blueprint;
import java.util.List;

/**
 *
 * @author sergio
 */
public interface BlueprintFilter {
    public Blueprint filter(Blueprint blueprint);
    public List<Blueprint> blueprintsFilter(List<Blueprint> blueprints);
    
}
