import java.util.Stack;
public class InfixTopostfix {
	 static int Prec(char ch) 
	    { 
	        switch (ch) 
	        { 
	        case '+': 
	        case '-': 
	            return 1; 
	       
	        case '*': 
	        case '/': 
	            return 2; 
	       
	        case '^': 
	            return 3; 
	        } 
	        return -1; 
	    } 
	       
	  
	    static String infixToPostfix(String exp) 
	    { 
	        
	        String result = new String(""); 
	          
	        
	        Stack<Character> si = new Stack<>(); 
	          
	        for (int i = 0; i<exp.length(); ++i) 
	        { 
	            char c = exp.charAt(i); 
	              
	             // If the scanned character is an operand, add it to output. 
	            if (Character.isLetterOrDigit(c)) 
	                result += c; 
	               
	            // If the scanned character is an '(', push it to the stack. 
	            else if (c == '(') 
	                si.push(c); 
	              
	            //  If the scanned character is an ')', pop and output from the stack  
	            // until an '(' is encountered. 
	            else if (c == ')') 
	            { 
	                while (!si.isEmpty() && si.peek() != '(') 
	                    result += si.pop(); 
	                  
	                if (!si.isEmpty() && si.peek() != '(') 
	                    return "Invalid Expression"; // invalid expression                 
	                else
	                    si.pop(); 
	            } 
	            else  // an operator is encountered
	            { 
	            	while (!si.isEmpty() && Prec(c)<= Prec(si.peek())) 
	                    result += si.pop(); 
	                si.push(c); 
	            } 
	        } 
	       
	        // pop all the operators from the stack 
	        while (!si.isEmpty())
	            result += si.pop();
	        return result; 
	    }
}