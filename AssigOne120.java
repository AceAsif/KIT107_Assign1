/**
 * Main method for running the code of KIT107 Assignment 1
 * Using the functionality of the SweetFA and Curry ADTs
 * To show chocolate flavour values
 * @author Luke Packer & Md Asif Iqbal
 * @version 22/3/2020
 * Percentage of work: Luke 50 / Asif 50
 */

import java.util.Scanner; //Import the Scanner class for user input

 public class AssigOne120
{
    public static void main (String args[])
    {
        int totalPieces[];  //Array of ints to hold each possible banana piece value
        int minPieces = 0; //minimum number of banana pieces, to be entered by the user
        int maxPieces = 0; //maximum number of banana pieces, to be entered by the user
        int numPieces = 0; //number of different amounts of banana pieces
        final double INITSTEPSIZE = 0; //initial step size for curry concentration
        
        Scanner input; //Create a Scanner object
        Curry curryConc;  //Create a Curry object
        SweetFA chocolateFlavour; //Create a SweetFA object

        totalPieces = new int[11];  //initalising array to hold all possible banana piece values
        
        input = new Scanner(System.in); //instantiating Scanner object to take user entered values
        curryConc = new Curry(INITSTEPSIZE); //instantiating Curry object to calculate curry concentrations
        chocolateFlavour = new SweetFA(curryConc, minPieces); //instantiating SweetFA object to calculate chocolate flavour


        System.out.println("The Local Chocolate Factory");       
        System.out.println("--------------------------- \n");
        
        System.out.print("Enter the minimum number of banana pieces: ");
        minPieces = input.nextInt(); //Store value of minimum banana pieces

        System.out.print("Enter the maximum number of banana pieces: ");
        maxPieces = input.nextInt(); //Store value of maximum banana pieces

        System.out.print("Enter the curry concentration step size: ");
        curryConc.setStep(input.nextDouble()); //Store value of the concentration step size in the Curry object

        //Check that the user has entered legal values, (all positive, the minimum less than or equal to the maximum, and with the difference between the minimum and maximum number of banana pieces not exceeding 10)
        if (minPieces <= 0 || maxPieces <= 0 || curryConc.getStep() <= 0.0 || (minPieces > maxPieces) || (maxPieces - minPieces) > 10 || (curryConc.getStep() > 1)) 
        {
            //If illegal values used, print error message
            System.out.println("Sorry, these are not legal");
        }
        else
        {
            //Otherwise continue with the program
            System.out.print("\n\t Number of banana pieces \n");  //Creates the label for the column values on the table
            System.out.print("Curry \t");      //Creates the label for the row values on the table
            
            //Calculate the number of different values for the number of banana pieces
            numPieces = (maxPieces - minPieces);
            
            
            //Loop for printing each value of number of banana pieces up to maxPieces
            //i is the counter for the loop
            for(int i=0; i<=numPieces; i++)
            {  
                System.out.print(minPieces + "\t");
                
                //Add the current banana piece value to the array for reuse
                totalPieces[i] = minPieces;
                
                //Increment minPieces value
                minPieces++;
            }
            //Loop for incrementing and printing curry concentration while it is not at maximum and the chocolate flavour is not at maximum
            while(curryConc.nextStep() == true && chocolateFlavour.exceedsThreshold() == false)
            {         
                //Print a new line, then the current curry concentration value
                System.out.println("");
                System.out.print(curryConc + "\t");
                
                //Loop for taking the current curry concentration value and calulating the flavour, based on each number of banana pieces values
                //a is the counter for the loop
                for (int a=0; a <=numPieces; a++)
                {
                    //Set the curry concentration to the current value
                    chocolateFlavour.setConcentration(curryConc);

                    //Set number of banana pieces to the current value
                    chocolateFlavour.setNumBananaPieces(totalPieces[a]);

                    //Calculate flavour and print
                    chocolateFlavour.calculateFlavour();
                    System.out.print(chocolateFlavour + "\t");
                }
            }
            //This is to create a new line after the code has been executed, to make the code display correctly in DrJava. 
            System.out.println();      
        }
    }
}  