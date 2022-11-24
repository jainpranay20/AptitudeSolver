package org.example;

public class AptitudeFunction
{
    public String percentageChange(double original, double revised)
    {
        try {
            if (original == 0) {
                throw new Exception();
            }
            double res = ((original - revised) / original) * 100;
            return Double.toString(res);
        }catch (Exception e)
        {
            return "Invalid original value";
        }
    }

    public double degreeToPercentageCalculator(double degree)
    {
        return (degree*100)/360;
    }

    public String fractionToDoubleConverter(double a, double b)
    {
        try
        {
            if(b==0)
            {
                throw new Exception();
            }
            else
            {
                double res = (a/b)*100;
                return Double.toString(res);
            }
        }catch(Exception e)
        {
            return "Invalid operands";
        }
    }

    public String getCountOfDays(int[] arr)
    {
        int count = 0;
        double efficiency=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                count++;
                efficiency = efficiency + 100/arr[i];
            }
        }
        try
        {
            if(count==0)
            {
                throw new Exception();
            }
            double res = (1/efficiency)*100;
            return Double.toString(res);
        }catch (Exception e)
        {
            return "Invalid Input;";
        }

    }

    public String getNthTerm(double startValue, double commonDifference, int n)
    {
        try {
            if (n <= 0) {
                throw new Exception();
            }
            double res = startValue + (n - 1) * commonDifference;
            return Double.toString(res);
        }catch (Exception e)
        {
            return "Invalid count";
        }
    }

    public String findFirstNTerms(double startValue, double commonDifference, int n)
    {
        String res = Double.toString(startValue);
        try
        {
            if(n<=0)
            {
                throw new Exception();
            }
            double current = startValue;
            for(int i=0;i<n-1;i++)
            {
                current = current + commonDifference;
                res = res + "," + Double.toString(current);
            }
            return res;
        }catch(Exception e)
        {
            return "Invalid count input";
        }
    }

    public String findSumOfFirstNTerms(double startValue, double commonDifference, int n)
    {

        try
        {
            if(n<=0)
            {
                throw new Exception();
            }
            double sum = (n/2)*(2*startValue + (n-1)*commonDifference);
            String res = Double.toString(sum);
            return res;
        }catch(Exception e)
        {
            return "Invalid count input";
        }
    }

    public String simpleInterest(double principal, double rate, double time)
    {
        try {
            if (principal == 0 || rate==0 || time==0) {
                throw new Exception();
            }
            double si = (principal * rate * time)/ 100;
            return Double.toString(si);
        }catch (Exception e)
        {
            return "Invalid original value";
        }
    }

    public String compoundInterest(double principal, double rate, double time)
    {
        String result;
        try {
            if (principal == 0 || rate==0 || time==0) {
                throw new Exception();
            }
            double amount = principal * (Math.pow((1 + rate/100), (time)));
            double interest = amount - principal;
            return result = "Amount is" + amount + "Interest is" + interest;
        }catch (Exception e)
        {
            return "Invalid original value";

        }
    }

    public String compareProfitLoss(double costPrice,double sellingPrice)
    {
        String res;
        try {
            if (costPrice == 0) {
                throw new Exception();
            }
            else if(costPrice-sellingPrice>0) {
                double ans=costPrice-sellingPrice;
                double res1=(ans/costPrice)*100;
                res="loss" + ans + "loss percent" +res1;
            }
            else if(costPrice-sellingPrice<0) {
                double ans=costPrice-sellingPrice;
                double res1=(-1 * ans/costPrice)*100;
                res="profit"+ ans +"profit percent" +res1;
            }
            else {
                res="neutral";
            }
            return res;
        }
        catch (Exception e)
        {
            return "Invalid original value";
        }
    }


    public String distanceSpeedAndTime(double speed,double time)
    {
        String res;
        try {
            if (speed == 0 || time == 0) {
                throw new Exception();
            }
            double distance = speed * time;
            res= "Distance is "+distance;
            return res;
        }
        catch (Exception e)
        {
            return "Invalid original Value";
        }
    }

    public double squareArea(double side) {
        double area = side*side;
        return area;
    }

    public double rectangleArea(double length, double breadth) {
        double area = length*breadth;
        return area;
    }

    public double circleArea(double radius) {
        double pi = 3.14;
        double area = pi*radius*radius;
        return area;
    }

    public double triangleArea(double breadth,double height) {
        double area = 0.5*breadth*height;
        return area;
    }

    public double surfaceAreaOfCube(double side) {
        double area = 6*side*side;
        return area;
    }
    public double volumeOfCube(double side) {
        double volume = side*side*side;
        return volume;
    }


    public double surfaceAreaOfCuboid(double length,double breadth,double height) {
        double area = 2*(length*breadth+breadth*height+height*length);
        return area;
    }
    public double volumeOfCuboid(double length,double breadth,double height) {
        double volume = length*breadth*height;
        return volume;
    }


    public double surfaceAreaOfCylinder(double radius,double height) {
        double pi = 3.14;
        double area = 2*pi*radius*(radius+height);
        return area;
    }

    public double volumeOfCylinder(double radius,double height) {
        double pi = 3.14;
        double volume = pi*radius*radius*height;
        return volume;
    }

    public double surfaceAreaOfCone(double radius,double length) {
        double pi = 3.14;
        double area = pi*radius*(radius+length);
        return area;
    }
    public double volumeOfCone(double radius, double height) {
        double pi = 3.14;
        double volume = 1/3*pi*radius*radius*height;
        return volume;
    }


    public double surfaceAreaOfSphere(double radius) {
        double pi = 3.14;
        double area = 4*pi*radius*radius;
        return area;
    }
    public double volumeOfSphere(double radius) {
        double pi = 3.14;
        double volume = 4/3*pi*radius*radius*radius;
        return volume;



    }
