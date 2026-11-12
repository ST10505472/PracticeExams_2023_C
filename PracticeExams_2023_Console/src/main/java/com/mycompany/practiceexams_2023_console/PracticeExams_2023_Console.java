
package com.mycompany.practiceexams_2023_console;


public class PracticeExams_2023_Console {
    
    

    public static void main(String[] args) {
        
               
               String[] agents = {"Joe Bloggs", "Jane Doe"};
       
       double [][] propertySales = {
    
        {800000, 1500000, 2000000},
        {700000, 1200000, 1600000},
    };
       
       EstateAgent agent = new EstateAgent();
       double[] totalSales = new double[2];
        System.out.println();
        System.out.println();
        System.out.println("ESTATE AGENTS SALES REPORT");
        System.out.println();
        System.out.println("\t\tJAN\t\tFEB\t\tMAR");
        System.out.println("---------------------------------------------------------------------");
        
        for(int row = 0; row < propertySales.length; row++){
            
            System.out.println(agents[row] + "\tR" + String.format("%,.0f", propertySales[row][0])    
                                           + "\tR" + String.format("%,.0f", propertySales[row][1]) 
                                           + "\tR" + String.format("%,.0f", propertySales[row][2]) 
            );
            
            totalSales[row] = agent.EstateAgentSales(propertySales[row]);
            
        }
            
            System.out.println();
            System.out.printf("Total property sales for Joe Bloggs = R " + String.format ("%,.0f", totalSales[0]) );
            System.out.println();
            System.out.printf("Total property sales for Jane Doe = R " + String.format("%,.0f", totalSales[1]));
            System.out.println();
            System.out.println();
            System.out.printf("Sales commission for Joe Bloggs = R " + String.format("%,.0f", agent.EstateAgentCommission(totalSales[0])));
            System.out.println();
            System.out.println();
            System.out.printf("Sales Commission for Jane Doe = R" + String.format("%,.0f", agent.EstateAgentCommission(totalSales[1])));
            System.out.println();
            
            int topAgent = agent.TopEstateAgent(totalSales);
            System.out.println();
            System.out.println("Top Selling Estate Agent: Estate Agent " + (topAgent + 1));
            System.out.println();
            System.out.println();
        

        

    }
}
