import java.util.Stack;

public class PostFixEvaluator {
	public static boolean isOperand(char i) 
	{ 
		if(i>=1 && i<=1000)
			return true;
		else 
			return false;
	  
	}
	
	public static int PostfixEvaluation(String e) {
        Stack<Integer> stack = new Stack<>(); 
        
        for(int i = 0; i < e.length(); i++) 
        { 
            char ch = e.charAt(i); 
              
            if(ch == ' ') 
            continue; 
              
         
            else if(Character.isDigit(ch)) 
            { 
                int num = 0;
                while(Character.isDigit(ch)) 
                { 
                    num = num*10 + (int)(ch-'0'); 
                    i++; 
                    ch = e.charAt(i); 
                } 
                i--;
                stack.push(num); 
            } 
            else
            { 
                int val1 = stack.pop(); 
                int val2 = stack.pop(); 
                  
                switch(ch) 
                { 
                    case '+': 
                    stack.push(val2+val1); 
                    break; 
                      
                    case '-': 
                    stack.push(val2- val1); 
                    break; 
                      
                    case '/': 
                    stack.push(val2/val1); 
                    break; 
                      
                    case '*': 
                    stack.push(val2*val1); 
                    break; 
            } 
            } 
        } 
        return stack.pop();  
    } 
		  
	}


