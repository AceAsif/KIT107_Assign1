/**
 * Interface for Flavour
 * ADT specification for KIT107 Assignment 1
 * Author Julian Dermoudy
 * Version 2/3/2020
 * 
 * This file is COMPLETE.
 */

public interface SweetFAInterface
{
    //public SweetFA(Curry concentration, int numBananaPieces);
    public Curry getConcentration();
    public int getNumBananaPieces();
    public void setConcentration(Curry concentration);
    public void setNumBananaPieces(int numBananaPieces);
    public void calculateFlavour();
    public boolean exceedsThreshold();
    public double toDouble();
    public String toString();
}