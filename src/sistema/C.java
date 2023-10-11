package sistema;

public class C extends Planetario {
	
	{
	this.Posmin = 1;
	this.Posmax = 15;
	this.velTrans = 10;
	this.velRot = 0.1;
	this.positionX = 15;
	this.positionY = 8;
	this.Name = "C";
	}
	
	protected C() {
	}
	
		
	


protected void Rotacionar(int Time) {
	super.Rotacionar(Time);
}



	public String toString() {
	        return "C{" + 
	                "x=" + this.positionX +
	                ", y=" +this.positionY +
	                '}';
	    }
	
	





	
}
