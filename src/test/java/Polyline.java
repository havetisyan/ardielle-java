//
// This file generated by rdl 1.3.10
//

import java.util.List;
import java.util.Map;
import com.yahoo.rdl.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// Polyline -
//
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public final class Polyline {
    public List<Point> points;

    public Polyline points(List<Point> points) { this.points = points; return this; }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != Polyline.class) {
                return false;
            }
            Polyline a = (Polyline) another;
				if (points == null? a.points != null : !points.equals(a.points)) {
                return false;
            }
        }
        return true;
    }
}
