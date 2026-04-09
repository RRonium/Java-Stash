package geopack;
class Ellipse implements GeoAnalyser
{
    int major,minor;
    Ellipse(int maj, int min)
    {
        major=maj;
        minor=min;
    }
    public float PI()
    {
        return (float)Math.PI;
    }
    public float area()
    {
        return (float)(PI()*major*minor);
    }
    public float perimeter()
    {
        return (float)(2*Math.PI*Math.sqrt(Math.pow(major,2)+Math.pow(major,2))/2);
    }    
}