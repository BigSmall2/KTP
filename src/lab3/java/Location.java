package lab3.java;


public class Location {

    public int xCoord;
    public int yCoord;
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

        /** Creates a new location with coordinates (0, 0). **/
        public Location()
        {
            this(0, 0);
        }

        public boolean equals(Object obj){
            if (this == obj)
                return true;
            if (!(obj instanceof Location))
                return false;
            Location loc = (Location) obj;
            return xCoord == loc.xCoord && yCoord == loc.yCoord;
        }

    public int hashCode() {
        int result = 13; // Начальная ценность
        result = 37 * result + xCoord;
        result = 37 * result + yCoord;
        return result;
    }

}
