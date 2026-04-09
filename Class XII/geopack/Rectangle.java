package geopack;
class Rectangle implements GeoAnalyser
{
    int length,width;
    Rectangle(int l, int b)
    {
        length=l;
        width=b;
    }
    public float PI()
    {
        return (float)Math.PI;
    }
    public float area()
    {
        return (float)(length*width);
    }
    public float perimeter()
    {
        return (float)(2*(length+width));
    }    
}