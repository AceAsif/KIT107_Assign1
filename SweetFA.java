/**
 * Class for Flavour
 * ADT Implementation for KIT107 Assignment 1
 * @author Julian Dermoudy, Luke Packer & Md Asif Iqbal
 * @version 20/03/2020
 * Percentage of work: Luke 50 / Asif 50
 */

import java.text.DecimalFormat;

public class SweetFA implements SweetFAInterface
{
    protected static final DecimalFormat FMT = new DecimalFormat("00.0"); // format for SweetFA flavour values
    protected final int THRESHOLD = 500; // flavour threshold
    
    protected Curry curry;               // curry component
    protected int numBananaPieces;       // number of banana pieces
    protected double flavour;            // flavour value in Sweet FAs
    
    
    /**
    * 'Constructor' for SweetFA
    * @param c value for curry field
    * @param n value for numBananaPieces field
    * 
    * Pre-condition: none
    * Post-condition: the curry instance variable is assigned the value of the
    *                 formal parameter c and the numBananaPieces instance
    *                 variable is assigned the value of the formal parameter n
    */
    public SweetFA(Curry c, int n)
    {
        //Create new curry object, using supplied step value
        this.curry = new Curry(c.getStep());
        
        //Set numBananaPieces to initial value
        this.numBananaPieces = n;
    }
    
    
    /**
    * Getter for curry
    * @return Curry value of curry field
    * 
    * Pre-condition: none
    * Post-condition: the value of the curry instance variable is returned
    */
    public Curry getConcentration()
    {
        return this.curry;
    }
    
    /**
    * Setter for curry
    * @param c the value for the curry field
    * 
    * Pre-condition: none
    * Post-condition: the value of the curry instance variable is assigned
    *                 the value of the formal parameter
    */
    public void setConcentration(Curry c)
    {
        this.curry = c;
    }
    
    /**
    * Getter for numBananaPieces
    * @return int value of numBananaPieces field
    * 
    * Pre-condition: none
    * Post-condition: the value of the numBananaPieces instance variable
    *                 is returned
    */
  
    public int getNumBananaPieces()
    {
        return this.numBananaPieces;
    }
    
    /**
    * Setter for numBananaPieces
    * @param n the value for the numBananaPieces field
    * 
    * Pre-condition: none
    * Post-condition: the value of the numBananaPieces instance variable
    *                 is assigned the value of the formal parameter
    */
    public void setNumBananaPieces(int n)
    {
        this.numBananaPieces = n; 
    }
    
    /**
    * Calculate flavour value, updating flavour field
    * 
    * Pre-condition: the current object's curry and numbBananaPieces
    *                instance variables are properly defined
    * Post-condition:  the value of the flavour instance variable is set
    *                  according to the formula
    */
    public void calculateFlavour()
    {
        double bananaFactor; //Holds the banana factor value
        
        //Calculates banana factor based on supplied formula
        bananaFactor = 120 - getNumBananaPieces();

        //calulates flavour based on supplied formula
        flavour = curry.getConcentration() * (800-(bananaFactor*bananaFactor));
    }
    
    /**
    * Check whether flavour exceeds the threshold
    * @return boolean whether the flavour exceeds the threshold
    * 
    * Pre-condition: the current object's flavour instance variable is defined
    * Post-condition: whether the value of the flavour instance variable
    *                 exceeds the threshold is determined and returned
    */
    public boolean exceedsThreshold()
    {
        //Check if flavour exceeds the threshold value
        if(flavour > THRESHOLD)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
    * Find raw form of flavour
    * @return double form of flavour for printing etc.
    * 
    * Pre-condition: none
    * Post-condition: the value of the flavour instance variable is returned
    */
    public double toDouble()
    {
        return flavour;
    }
    
    /**
    * Find printable form of flavour
    * @return String form of flavour for printing etc.
    * 
    * Pre-condition: the current object's flavour instance variable is defined
    * Post-condition: a String is returned which contains a 'prettified'
    *                 version of the value of the flavour instance variable
    */
    public String toString()
    {
        return FMT.format(flavour);
    }
}