public class andmed{
	double r;
	public andmed(double raadius){
		if(raadius<=0){throw new RuntimeException("Sobimatu raadius");}
		r=raadius;
	}
	public double pindala(){
		return Math.round(Math.pow(r, 2)*3.14*100.0)/100.0;
	}
	public double ymberm66t(){
		return Math.round((2*3.14*r)*100.0)/100.0;
	}
	public String toString(){
		return "Ring raadiusega "+r+", ymberm66t "+
		       ymberm66t()+"m, pindala "+pindala()+" ruutmeetrit.";
	}
}