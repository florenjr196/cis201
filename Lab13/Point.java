public class Point {

    // class data field

    // object data fields
    int x;
    int y;

    public Point (int initX, int initY) {
	this.x = initX;
        this.y = initY;
        
    }

    // Checkpoint 1
    public Point () {
	this.x = 0;
	this.y = 0;
    }
    // Checkpoint 5


    // Checkpoint 2 and 3
    public double getSlope(Point p) {
	if (p.x == this.x) {
	    throw new IllegalArgumentException();
	} else {
	return (double)(this.y - p.y)/(this.x - p.x);
	}
    }

    // Checkpoint 4
    public boolean isColinear(Point p, Point q) {
	double slope1 = (double)(p.y - q.y)/(p.x - q.x);
	double slope2 = (double)(this.y - q.y)/(this.x - q.x);
	if (slope1 == slope2) {
	    return true;
	}
	return false;
    }

    public void translate (int diffx, int diffy) {
	this.x += diffx;
        this.y += diffy;
    }

    public void setLocation(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    // distance from this point to another
    public double distance(Point p) {
	double dist = (this.x - p.x)*(this.x - p.x) + 
                      (this.y - p.y)*(this.y - p.y);
        dist = Math.sqrt(dist);
        return dist;
    }

    // distance from this point to (0,0)
    public double distanceFromOrigin() {
        return this.distance(new Point(0,0));
    }

    // a toString method
    public String toString() {
	return "(" + this.x + ", " + this.y + ")";
    }
}
