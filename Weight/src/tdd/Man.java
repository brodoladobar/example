package tdd;

public class Man {
	double w;
	double h;
	double old;
	
	public Man(double w, double h, double o)
	{
		this.w=w;
		this.h=h;
		this.old=o;
	}
	
	public double getIW(double h){
		double ideal=0;
		if( h>160){	ideal=h-110;}
		else{ ideal=h-100;}
	    return ideal;
	 }
	
	public double getBMT(double w, double h){
        double bmt=0;
        bmt= w/((h/100)*(h/100));
		return bmt; 
	}
	
	public double getC(double w, double h, double o)
	{
		double c=0;
		c= 9.99*w+6.25*h+4.92*o;
		return c;
	}

}
