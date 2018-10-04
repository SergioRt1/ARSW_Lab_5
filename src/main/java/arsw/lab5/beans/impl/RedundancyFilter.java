/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arsw.lab5.beans.impl;

import arsw.lab5.beans.BlueprintFilter;
import arsw.lab5.model.Blueprint;
import arsw.lab5.model.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.springframework.stereotype.Service;

/**
 *
 * @author sergio
 */
@Service
public class RedundancyFilter implements BlueprintFilter {

    @Override
    public Blueprint filter(Blueprint blueprint) {
        List<Point> points = new ArrayList<>();
        Integer lastX = null;
        Integer lastY = null;
        for (Point pt : blueprint.getPoints()) {
            if (pt.getX() != lastX || pt.getY() != lastY) {
                points.add(pt);
            } else {
                lastX = pt.getX();
                lastY = pt.getY();
            }
        }
        return new Blueprint(blueprint.getAuthor(), points);

    }

    @Override
    public List<Blueprint> blueprintsFilter(List<Blueprint> blueprints) {
        List<Blueprint> filterBlueprints = new ArrayList<>();
        for (Blueprint blueprint : blueprints) {
            filterBlueprints.add(filter(blueprint));
        }
        return filterBlueprints;
    }

}
