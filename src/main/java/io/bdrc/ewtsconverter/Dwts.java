package io.bdrc.ewtsconverter;

import java.util.HashMap;
import java.util.Map;

public class Dwts {
    public static String base[];
    public static String repl[];
    
    public static void init() {
    	final Map<String,String> replMap = new HashMap<String,String>();
    	replMap.put("-", " ");
    	replMap.put("ś", "sh");
    	replMap.put("s\\u0301", "sh");
    	replMap.put("ź", "zh");
    	replMap.put("z\\u0301", "zh");
    	replMap.put("ñ", "ny");
    	replMap.put("n\\u0303", "ny");
    	replMap.put("ṅ", "ng");
    	replMap.put("n\\u0307", "ng");
    	replMap.put("ā", "A"); // Ri-gi-ā-ra -> རི་གི་ཨཱ་ར་
    	replMap.put("a\\u0304", "A");
    	replMap.put("ī", "I");
    	replMap.put("i\\u0304", "I");
    	replMap.put("ū", "U");
    	replMap.put("u\\u0304", "U");
    	replMap.put("ṃ", "M");
    	replMap.put("m\\u0323", "M");
    	replMap.put("ṁ", "~M");
    	replMap.put("m\\u0307", "~M");
    	replMap.put("ṁ", "~M"); // dwts
    	replMap.put("m\\u0307", "~M");
    	replMap.put("m\\u0310", "~M"); // alalc
    	replMap.put("ṛ", "r-i"); // dwts
    	replMap.put("r\\u0323", "r-i");
    	replMap.put("r\\u0325", "r-i"); // alalc
    	replMap.put("ṝ", "r-I"); // dwts
    	replMap.put("ṛ\\u0304", "r-I");
    	replMap.put("r\\u0323\\u0304", "r-I");
    	replMap.put("r\\u0304\\u0323", "r-I");
    	replMap.put("r\\u0325\\u0304", "r-I"); // alalc
    	replMap.put("r\\u0304\\u0325", "r-I");
    	replMap.put("ḷ", "l-i"); // dwts
    	replMap.put("l\\u0323", "l-i");
    	replMap.put("l\\u0325", "l-i"); // alalc
    	replMap.put("ḹ", "l-i"); // dwts
    	replMap.put("ḷ\\u0304", "l-i");
    	replMap.put("l\\u0323\\u0304", "l-i");
    	replMap.put("l\\u0304\\u0323", "l-i");
    	replMap.put("l\\u0325\\u0304", "l-i"); // alalc
    	replMap.put("l\\u0304\\u0325", "l-i");
    	replMap.put("ṭ", "T");
    	replMap.put("t\\u0323", "T");
    	replMap.put("ḍ", "D");
    	replMap.put("d\\u0323", "D");
    	replMap.put("ṇ", "N");
    	replMap.put("n\\u0323", "N");
    	replMap.put("ṣ", "Sh");
    	replMap.put("s\\u0323", "Sh");
    	replMap.put("`", "&"); // alalc
    	replMap.put("gʹy", "g.y"); // \u02B9, alalc example
    	replMap.put("ʹ", "+"); // \u02B9, seems to be a general case in alalc description although could sometimes be .
    	// contradictory:
    	replMap.put("ḥ", "'"); // dwts
    	replMap.put("h\\u0323", "'");
    	replMap.put("ḥ", "H"); // alalc
    	replMap.put("h\\u0323", "H");
    	replMap.put("ʹ", "'"); // \u2019, alalc
    	replMap.put("ʼ", "'"); // \u02BC, alalc
    	replMap.put("v", "w"); // just in case
//    	
//    	replMap.put("ʼ", ".");
//    	replMap.put("'", ".");
//    	replMap.put(".", "+");
    }
    
    public static String dwtsToEwts(String s) {
    	return s;
    }
    
}