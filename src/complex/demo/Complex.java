/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex.demo;

/**
 *
 * @author Romenia
 */
public class Complex {
    private double realPart;
    private double imaginaryPart;
    
    //Constructors
    public Complex(){
        this.realPart=0;
        this.imaginaryPart=0;
    }
    public Complex(double realPart, double imaginaryPart){
        this.realPart=realPart;
        this.imaginaryPart=imaginaryPart;
    }
    
    //Methods
    public Complex add(Complex otherNumber){
        
        double real = this.realPart + otherNumber.realPart;
        double imaginary = this.imaginaryPart + otherNumber.imaginaryPart;
         
        return new Complex(real,imaginary);
    }
    public Complex subtract(Complex otherNumber){
        double real = this.realPart - otherNumber.realPart;
        double imaginary = this.imaginaryPart - otherNumber.imaginaryPart;
         
        return new Complex(real,imaginary);
    }
    public Complex multiply(Complex otherNumber){
        
        double real= (this.realPart * otherNumber.realPart)-(this.imaginaryPart * otherNumber.imaginaryPart);
        double imaginary= (this.realPart * otherNumber.imaginaryPart)+(this.imaginaryPart * otherNumber.realPart);
        
        return new Complex(real,imaginary);
    }
    public Complex divide (Complex otherNumber){
        double real= ((this.realPart * otherNumber.realPart)+(this.imaginaryPart * otherNumber.imaginaryPart))/((otherNumber.realPart*otherNumber.realPart)+(otherNumber.imaginaryPart*otherNumber.imaginaryPart));
        double imaginary=((this.imaginaryPart * otherNumber.realPart)-(this.realPart * otherNumber.imaginaryPart))/((otherNumber.realPart*otherNumber.realPart)+(otherNumber.imaginaryPart*otherNumber.imaginaryPart));
    
        return new Complex(real,imaginary);
    }
    
    //setters
    public void setRealPart (double realPart){
        this.realPart=realPart;
    }
    public void setImaginaryPart (double imaginaryPart){
        this.imaginaryPart=imaginaryPart;
    }
    
    //getters
    public double getRealPart(){
        return this.realPart;
    }
    public double getImaginaryPart(){
        return this.imaginaryPart;
    }
    
    @Override
    public String toString(){
        return realPart + " + " + imaginaryPart + "i";
    }
}
