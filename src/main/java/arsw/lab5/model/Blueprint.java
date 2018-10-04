/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arsw.lab5.model;

import java.util.List;

/**
 *
 * @author sergio
 */
public class Blueprint {
    
    private String author;
    private List<Point> points;

    public Blueprint(String author, List<Point> points) {
        this.author = author;
        this.points = points;
    }

    public boolean equals(Blueprint blueprint) {
        boolean equalPoints = blueprint.getPoints().size() == this.getPoints().size();
        int i = 0;
        int size = blueprint.getPoints().size();
        while(equalPoints && i < size){
            equalPoints &= blueprint.getPoints().get(i).equals(this.getPoints().get(i));
            i++;
        }
        return  blueprint.getAuthor().equals(this.getAuthor()) && equalPoints;
    }
    
    

    public String getAuthor() {
        return author;
    }

    public List<Point> getPoints() {
        return points;
    }
    
    
    
}
