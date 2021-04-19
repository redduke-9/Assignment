import java.util.*;
import java.lang.*;

public class UserMainCode{
	public static final int PWD_LENGTH = 8;
    public static boolean CheckPassword(String password) {

        if (password.length() < PWD_LENGTH) 
        	return false;

        int upprchar = 0;
        int nCount = 0;int splchar = 0;int lwrchar =0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if(Character.isUpperCase(ch)) 
            	 upprchar++;
            else if(Character.isLowerCase(ch))
            	lwrchar++;
            else if(Character.isDigit(ch))
            	nCount++;
            else if(ch==' ')
            	continue;
            else 
            	splchar++;
        }

       if(upprchar>0&&lwrchar>0&&nCount>0&&splchar>0)
    	   return true;
       return false;
    }
}
