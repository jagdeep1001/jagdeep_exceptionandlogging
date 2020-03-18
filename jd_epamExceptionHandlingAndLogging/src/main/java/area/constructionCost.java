package area;
public class constructionCost {
    double stdCost = 1200, abvStdCost = 1500,highStdCost = 1800,highStdAutoCost = 2500;
    public double calculateArea(double area,int material,boolean automation) throws InvalidMaterialSelect
    {
        double totalArea = 0;
        if(material==1)
        {
            totalArea=area*stdCost;
        }
        else if(material==2)
        {
            totalArea=area * abvStdCost;
        }
        else if(material==3)
        {
            if (automation)
                totalArea = area * highStdAutoCost;
            else
                totalArea = area * highStdCost;
        }
        return totalArea;
    }
}
