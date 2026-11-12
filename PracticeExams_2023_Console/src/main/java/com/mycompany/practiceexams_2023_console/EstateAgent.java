
package com.mycompany.practiceexams_2023_console;

public class EstateAgent implements IEstateAgent {
    
    private double TOP_SELLING_AGENT = 0;
    
    private double [][] EstateAgent = {
    
        {800000, 1500000, 2000000},
        {700000, 1200000, 1600000},
        
    };

    @Override
    public double EstateAgentSales(double[] propertySales) {
        double total = 0;
        
        for (int row = 0; row < EstateAgent.length; row++)
        {
            for (int col = 0; col < EstateAgent[row].length; col++)
            {
                total =+ EstateAgent[row][col];
            }
        }
        return total;
    }

    @Override
    public double EstateAgentCommission(double propertySales) {
        
        return propertySales * 0.2;
    }

    @Override
    public int TopEstateAgent(double[] totalSales) {

        if (totalSales[0] > totalSales[1])
        {
            return 0;
        }else{
        
            return 1;
        }

    }
    
}
