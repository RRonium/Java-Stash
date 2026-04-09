package geopack;
class Circles implements GeoAnalyser
{
    int radius;
    Circles(int r)
    {
        radius=r;
    }
    public float PI()
    {
        return (float)Math.PI;
    }
    public float area()
    {
        return (float)(PI()*Math.pow(radius,2));
    }
    public float perimeter()
    {
        return (float)(2*Math.PI*radius);        
    }    
}