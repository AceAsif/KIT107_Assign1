/**
 * Interface for Curry Concentration
 * ADT specification for KIT107 Assignment 1
 * @author Julian Dermoudy
 * @version 2/3/2020
 * 
 * This file is COMPLETE.
 */

public interface CurryInterface
{
    //public Curry(double step);
    public void setStep(double step);
    public double getStep();
    public double getConcentration();
    public boolean nextStep();
    public String toString();
}
