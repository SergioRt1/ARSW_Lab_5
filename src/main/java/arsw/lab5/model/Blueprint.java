/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arsw.lab5.model;

import java.util.Set;

/**
 *
 * @author sergio
 */
public class Blueprint {
    
    String author;
    Set<Point> points;

    public Blueprint(String author, Set<Point> points) {
        this.author = author;
        this.points = points;
    }

    public String getAuthor() {
        return author;
    }

    public Set<Point> getPoints() {
        return points;
    }
    
    
    
}
