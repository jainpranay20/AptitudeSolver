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

    public String getNthTermAP(double startValue, double commonDifference, int n)
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

    public String findFirstNTermsAP(double startValue, double commonDifference, int n)
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

    public String findSumOfFirstNTermsAP(double startValue, double commonDifference, int n)
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

    public String getNthTermGP(double startValue, double commonDifference, int n)
    {
        try {
            if (n <= 0) {
                throw new Exception();
            }
            double res = startValue*Math.pow(commonDifference, n-1);
            return Double.toString(res);
        }catch (Exception e)
        {
            return "Invalid count";
        }
    }

    public String findFirstNTermsGP(double startValue, double commonDifference, int n)
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
                current = current*commonDifference;
                res = res + "," + Double.toString(current);
            }
            return res;
        }catch(Exception e)
        {
            return "Invalid count input";
        }
    }

    public String findSumOfFirstNTermsGP(double startValue, double commonDifference, int n)
    {

        try
        {
            if(n<=0)
            {
                throw new Exception();
            }
            double sum = startValue*(Math.pow(commonDifference, n)-1)/(commonDifference-1);
            String res = Double.toString(sum);
            return res;
        }catch(Exception e)
        {
            return "Invalid count input";
        }
    }





}
