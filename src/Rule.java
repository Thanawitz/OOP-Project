
public class Rule {
	
	public static void CheackXX(CarX A,CarX B){	
		if(Math.abs(A.getX()-B.getX())<150){		
			//A at right side
			if(A.getX()>B.getX()){
				A.setLeft(false);
			}
			//A at left side
			else if(A.getX()<B.getX()){
				A.setRight(false);
			}
				
		}
	}	
	public static void CheackYY(CarY A,CarY B){
		if(Math.abs(A.getY()-B.getY())<150){				
			//A at down side
			if(A.getY()>B.getY()){
				A.setUp(false);
			}
			//A at up side
			else if(A.getY()<B.getY()){
				A.setDown(false);
			}				
		}		
	}
	
	public static void CheackYX(CarY A,CarX B){
		//Y is A B is X
		//case 1 : B is top right	
		if(A.getX()==B.getX()&&A.getY()>B.getY()&&Math.abs((A.getY()-B.getY()))<75){
			A.setUp(false);
		}
		//case 2 : B is top left
		else if(Math.abs((A.getY()-B.getY()))<75&&Math.abs((A.getX()-B.getX()))==75&&A.getX()>B.getX()&&A.getY()>B.getY()){
			A.setUp(false);
		}
		//case 3 : B is  down right
		else if(A.getX()==B.getX()&&A.getY()<B.getY()&&Math.abs((A.getY()-B.getY()))<150){
			A.setDown(false);
		}
		//case 4 : B is down left
		else if(Math.abs((A.getY()-B.getY()))<150&&Math.abs((A.getX()-B.getX()))==75&&A.getX()>B.getX()&&A.getY()<B.getY()){
			A.setDown(false);
		}	
	}
	public static void CheackXY(CarX A,CarY B){
		//X is A ----- Y is B
		//case 5 : B is down right	
		if(Math.abs((A.getX()-B.getX()))<150&&A.getX()<B.getX()&&A.getY()==B.getY()){
			A.setRight(false);
		}
		//case 6 : B is top right
		else if(Math.abs((A.getX()-B.getX()))<150&&A.getX()<B.getX()&&A.getY()>B.getY()&&Math.abs((A.getY()-B.getY()))==75){
			A.setRight(false);
		}
		//case 3 : B is  down left
		else if(Math.abs((A.getX()-B.getX()))<75&&A.getX()>B.getX()&&A.getY()==B.getY()){
			A.setLeft(false);
		}
		//case 4 : B is top left
		else if(Math.abs((A.getX()-B.getX()))<75&&A.getX()>B.getX()&&A.getY()>B.getY()&&Math.abs((A.getY()-B.getY()))==75){
			A.setLeft(false);
		}	
	}
	
	public static void CheackX3X(CarX A,Car3X B){				
			//A at right side
			if(A.getX()>B.getX()&&Math.abs(A.getX()-B.getX())<225){
				A.setLeft(false);
			}
			//A at left side
			else if(A.getX()<B.getX()&&Math.abs(A.getX()-B.getX())<150){
				A.setRight(false);
			}						
	}
	public static void CheackY3Y(CarY A,Car3Y B){			
		//A at down side
		if(A.getY()>B.getY()&&Math.abs(A.getY()-B.getY())<225){
			A.setUp(false);
		}
		//A at up side
		else if(A.getY()<B.getY()&&Math.abs(A.getY()-B.getY())<150){
			A.setDown(false);
		}							
	}
	
	public static void CheackX3Y(CarX A,Car3Y B){
		//X is A ----- 3Y is B
		//case 1 : B is down right	
		if(Math.abs((A.getX()-B.getX()))<150&&A.getX()<B.getX()&&A.getY()==B.getY()){
			A.setRight(false);
		}
		//case 2 : B is middle right
		else if(Math.abs((A.getX()-B.getX()))<150&&A.getX()<B.getX()&&A.getY()>B.getY()&&Math.abs((A.getY()-B.getY()))==75){
			A.setRight(false);
		}
		//case 3 : B is top right
		else if(Math.abs((A.getX()-B.getX()))<150&&A.getX()<B.getX()&&A.getY()>B.getY()&&Math.abs((A.getY()-B.getY()))==150){
			A.setRight(false);
		}
		//case 4 : B is  down left
		else if(Math.abs((A.getX()-B.getX()))<75&&A.getX()>B.getX()&&A.getY()==B.getY()){
			A.setLeft(false);
		}
		//case 5 : B is middle left
				else if(Math.abs((A.getX()-B.getX()))<75&&A.getX()>B.getX()&&A.getY()>B.getY()&&Math.abs((A.getY()-B.getY()))==75){
					A.setLeft(false);
				}	
		//case 6 : B is top left
		else if(Math.abs((A.getX()-B.getX()))<75&&A.getX()>B.getX()&&A.getY()>B.getY()&&Math.abs((A.getY()-B.getY()))==150){
			A.setLeft(false);
		}	
	}
	public static void CheackY3X(CarY A,Car3X B){
		//Y is A --- 3X is B
		//case 1 : B is top right	
		if(A.getX()==B.getX()&&A.getY()>B.getY()&&Math.abs((A.getY()-B.getY()))<75){
			A.setUp(false);
		}
		//case 2 : B is middle left
				else if(Math.abs((A.getY()-B.getY()))<75&&Math.abs((A.getX()-B.getX()))==75&&A.getX()>B.getX()&&A.getY()>B.getY()){
					A.setUp(false);
				}
		
		//case 3 : B is top left
		else if(Math.abs((A.getY()-B.getY()))<75&&Math.abs((A.getX()-B.getX()))==150&&A.getX()>B.getX()&&A.getY()>B.getY()){
			A.setUp(false);
		}
		//case 4 : B is  down right
		else if(A.getX()==B.getX()&&A.getY()<B.getY()&&Math.abs((A.getY()-B.getY()))<150){
			A.setDown(false);
		}
		//case 5 : B is down middle
				else if(Math.abs((A.getY()-B.getY()))<150&&Math.abs((A.getX()-B.getX()))==75&&A.getX()>B.getX()&&A.getY()<B.getY()){
					A.setDown(false);
				}
		//case 6 : B is down left
		else if(Math.abs((A.getY()-B.getY()))<150&&Math.abs((A.getX()-B.getX()))==150&&A.getX()>B.getX()&&A.getY()<B.getY()){
			A.setDown(false);
		}	
	}
	
	public static void Cheack3XX(Car3X A,CarX B){				
		//A at right side
		if(A.getX()>B.getX()&&Math.abs(A.getX()-B.getX())<150){
			A.setLeft(false);
		}
		//A at left side
		else if(A.getX()<B.getX()&&Math.abs(A.getX()-B.getX())<225){
			A.setRight(false);
		}						
	}	
	public static void Cheack3YY(Car3Y A,CarY B){			
		//A at down side
		if(A.getY()>B.getY()&&Math.abs(A.getY()-B.getY())<150){
			A.setUp(false);
		}
		//A at up side
		else if(A.getY()<B.getY()&&Math.abs(A.getY()-B.getY())<225){
			A.setDown(false);
		}							
	}
	
	public static void Cheack3XY(Car3X A,CarY B){
		//X is A ----- Y is B
		//case 5 : B is down right	
		if(Math.abs((A.getX()-B.getX()))<235&&A.getX()<B.getX()&&A.getY()==B.getY()){
			A.setRight(false);
		}
		//case 6 : B is top right
		else if(Math.abs((A.getX()-B.getX()))<235&&A.getX()<B.getX()&&A.getY()>B.getY()&&Math.abs((A.getY()-B.getY()))==75){
			A.setRight(false);
		}
		//case 3 : B is  down left
		else if(Math.abs((A.getX()-B.getX()))<75&&A.getX()>B.getX()&&A.getY()==B.getY()){
			A.setLeft(false);
		}
		//case 4 : B is top left
		else if(Math.abs((A.getX()-B.getX()))<75&&A.getX()>B.getX()&&A.getY()>B.getY()&&Math.abs((A.getY()-B.getY()))==75){
			A.setLeft(false);
		}	
	}
	public static void Cheack3YX(Car3Y A,CarX B){
		//Y is A B is X
		//case 1 : B is top right	
		if(A.getX()==B.getX()&&A.getY()>B.getY()&&Math.abs((A.getY()-B.getY()))<75){
			A.setUp(false);
		}
		//case 2 : B is top left
		else if(Math.abs((A.getY()-B.getY()))<75&&Math.abs((A.getX()-B.getX()))==75&&A.getX()>B.getX()&&A.getY()>B.getY()){
			A.setUp(false);
		}
		//case 3 : B is  down right
		else if(A.getX()==B.getX()&&A.getY()<B.getY()&&Math.abs((A.getY()-B.getY()))<225){
			A.setDown(false);
		}
		//case 4 : B is down left
		else if(Math.abs((A.getY()-B.getY()))<225&&Math.abs((A.getX()-B.getX()))==75&&A.getX()>B.getX()&&A.getY()<B.getY()){
			A.setDown(false);
		}	
	}
	
	public static void Cheack3X3Y(Car3X A,Car3Y B){
		//X is A ----- 3Y is B
		//case 1 : B is down right	
		if(Math.abs((A.getX()-B.getX()))<225&&A.getX()<B.getX()&&A.getY()==B.getY()){
			A.setRight(false);
		}
		//case 2 : B is middle right
		else if(Math.abs((A.getX()-B.getX()))<225 && A.getX()<B.getX() && A.getY()>B.getY() && Math.abs((A.getY()-B.getY()))==75){
			A.setRight(false);
		}
		//case 3 : B is top right
		else if(Math.abs((A.getX()-B.getX()))<225&&A.getX()<B.getX()&&A.getY()>B.getY()&&Math.abs((A.getY()-B.getY()))==150){
			A.setRight(false);
		}
		//case 4 : B is  down left
		else if(Math.abs((A.getX()-B.getX()))<75&&A.getX()>B.getX()&&A.getY()==B.getY()){
			A.setLeft(false);
		}
		//case 5 : B is middle left
				else if(Math.abs((A.getX()-B.getX()))<75&&A.getX()>B.getX()&&A.getY()>B.getY()&&Math.abs((A.getY()-B.getY()))==75){
					A.setLeft(false);
				}	
		//case 6 : B is top left
		else if(Math.abs((A.getX()-B.getX()))<75&&A.getX()>B.getX()&&A.getY()>B.getY()&&Math.abs((A.getY()-B.getY()))==150){
			A.setLeft(false);
		}	
	}
	public static void Cheack3Y3X(Car3Y A,Car3X B){
		//Y is A --- 3X is B
		//case 1 : B is top right	
		if(A.getX()==B.getX()&&A.getY()>B.getY()&&Math.abs((A.getY()-B.getY()))<75){
			A.setUp(false);
		}
		//case 2 : B is middle left
				else if(Math.abs((A.getY()-B.getY()))<75&&Math.abs((A.getX()-B.getX()))==75&&A.getX()>B.getX()&&A.getY()>B.getY()){
					A.setUp(false);
				}
		
		//case 3 : B is top left
		else if(Math.abs((A.getY()-B.getY()))<75&&Math.abs((A.getX()-B.getX()))==150&&A.getX()>B.getX()&&A.getY()>B.getY()){
			A.setUp(false);
		}
		//case 4 : B is  down right
		else if(A.getX()==B.getX()&&A.getY()<B.getY()&&Math.abs((A.getY()-B.getY()))<225){
			A.setDown(false);
		}
		//case 5 : B is down middle
				else if(Math.abs((A.getY()-B.getY()))<225&&Math.abs((A.getX()-B.getX()))==75&&A.getX()>B.getX()&&A.getY()<B.getY()){
					A.setDown(false);
				}
		//case 6 : B is down left
		else if(Math.abs((A.getY()-B.getY()))<225&&Math.abs((A.getX()-B.getX()))==150&&A.getX()>B.getX()&&A.getY()<B.getY()){
			A.setDown(false);
		}	
	}
}
