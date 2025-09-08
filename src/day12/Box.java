package day12;

public class Box { // over loading by using constructors
	
/*	double L;
	double V;
	double v;
*/  
	
	double L,V,v;
	
	Box(){
	/*	 L=0;
		 V=0;
		 v=0;
	*/
		 L=V=v=0;
	}
	
	Box(double l, double S, double s){
		L=l;
		V=S;
		v=s;
	}
	
	Box(double d){
		L=V=v=d;
	}
	
	double volume() {
		return(L*V*v);
	}

}
