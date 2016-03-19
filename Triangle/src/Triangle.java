
public class Triangle {
	public static int judge(int a, int b, int c){
		if(a+b<=c || a+c<=b || b+c<=a){
			return 1;
		}
		if(a==b || a==c || b==c){
		    if(a==b && b==c){
		    	return 2;
		    }
		    else {
		    	return 3;
		    }
		}
		else {
			return 4;
	    }
		 
    }
}
