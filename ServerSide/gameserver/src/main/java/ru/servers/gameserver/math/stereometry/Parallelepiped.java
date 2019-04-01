package ru.servers.gameserver.math.stereometry;

import ru.servers.gameserver.math.algebra.vectors.Vector3;
import ru.servers.gameserver.math.algebra.vectors.VectorsUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Parallelepiped {

    private Vector3[] points;

    private final int FIRST_POINT = 0;
    private final int MIDDLE_POINT = 1;
    private final int SECOND_POINT = 2;
    private final int THIRD_POINT = 5;

    public double getVolume() {
        final double length = getLength();
        final double width = getWidth();
        final double height = getHeight();
        return length * width * height;
    }

    public double getLength() {
       return VectorsUtil.getLengthBetweenTwoVectors(points[FIRST_POINT], points[MIDDLE_POINT]);
    }

    public double getWidth() {
        return VectorsUtil.getLengthBetweenTwoVectors(points[SECOND_POINT], points[MIDDLE_POINT]);
    }

    public double getHeight() {
        return VectorsUtil.getLengthBetweenTwoVectors(points[MIDDLE_POINT], points[THIRD_POINT]);
    }

    public boolean isInside(Vector3 vertex) {
        return ( (points[MIDDLE_POINT].getX() <= vertex.getX()) && (vertex.getX() <= points[FIRST_POINT].getX()))
                && ((points[MIDDLE_POINT].getY() <= vertex.getY()) && (vertex.getY() <= points[SECOND_POINT].getY()))
                && ((points[MIDDLE_POINT].getZ() <= vertex.getZ()) && (vertex.getZ() <= points[THIRD_POINT].getZ()) );
    }

}
