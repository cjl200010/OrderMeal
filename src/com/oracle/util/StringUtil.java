package com.oracle.util;

public class StringUtil {
	public static boolean isEmpty(String str){
		if("".equals(str)||str==null){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isNotEmpty(String str){
		if(!"".equals(str)&&str!=null){
			return true;
		}else{
			return false;
		}
	}

    public static boolean checkEmail(String email){  
      String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";  
      return check.matches(email); 
    }  
    /**  
     * 手机号码校验
     * @param mobiles  
     * @return  [0-9]{5,9}  
     */  
    public static boolean isMobileNO(String mobiles){  
     return mobiles.matches("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$"); 
    }  
      
    //是否是数字
    public static boolean isNum(String str){	
    	return str.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");	
    }


}  
