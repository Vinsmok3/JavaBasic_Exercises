package it.develhope.overload;

/**
 * Class that define a shape.
 * There are different shapes according to different constructors.
 */
    public class Shape {
    public String shapeName;
    public int numberOfEdges;

   

    /**
     * Basic constructor method for creating an undefined Shape
     */
    public Shape(){
        System.out.println("An Object has been created!");
        shapeName = null;
    }
    

    /**
     * Constructor method for creating a circle
     * @param radius a double representing the circle's radius
     */
    public Shape(double radius){
        System.out.println("A Circle has been created!");
        shapeName = "Circle";
    }

    /**
     * Constructor method for creating a square
     * @param edges the number of edges
     * @param edgeLength the length of the edge
     */
    public Shape(int edges, double edgeLength){
        System.out.println("A Square has been created!");
        shapeName = "Square";
        numberOfEdges = 4;
    }

    /**
     * Constructor method for creating a rectangle
     * @param edges the number of edges
     * @param e1 double length of the first edge
     * @param e2 double length of the second edge
     */
    public Shape(int edges, double e1, double e2){
        System.out.println("A rectangle has been created!");
        shapeName = "Rectangle";
        numberOfEdges = 4;
    }
    

    /**
     * Constructor method for creating a triangle
     * @param edges the number of edges
     * @param e1 double length of the first edge
     * @param e2 double length of the second edge
     * @param e3 double length of the third edge
     */
    public Shape(int edges, double e1, double e2, double e3){
        System.out.println("A triangle has been created!");
        shapeName = "Triangle";
        numberOfEdges = 3;
    }

    /**
     * Method for getting the shape details.
     * @return an informative String containing the shapeName and the numberOfEdges
     */

    public String getShapeDetails(){
        return shapeName + " " + numberOfEdges;
    }
}
