package tj.orgimport.portlet;

import static java.lang.Character.toUpperCase;

public class Translit {
	
	public static String lat2cyr(String s){
		StringBuilder sb = new StringBuilder(s.length());
		int i = 0;
		while(i < s.length()){
			char ch = s.charAt(i);
			boolean lc = Character.isLowerCase(ch); 
			ch = toUpperCase(ch);
			if(ch == 'J'){ 
				i++; 
				ch = toUpperCase(s.charAt(i));
				switch (ch){
					case 'O': sb.append(ch('�', lc)); break;
					case 'H':
						if(i+1 < s.length() && toUpperCase(s.charAt(i+1))=='H') { 
							sb.append(ch('�', lc));
							i++; 
						}else{
							sb.append(ch('�', lc));
						}
						break;
					case 'U': sb.append(ch('�', lc)); break;
					case 'A': sb.append(ch('�', lc)); break;
					default: throw new IllegalArgumentException("Illegal transliterated symbol '"+ch+"' at position "+i);
				}
			}else if(i+1 < s.length() && toUpperCase(s.charAt(i+1))=='H' ){
				switch (ch){
					case 'Z': sb.append(ch('�', lc)); break;
					case 'K': sb.append(ch('�', lc)); break;
					case 'C': sb.append(ch('�', lc)); break;
					case 'S':
						if(i+2 < s.length() && toUpperCase(s.charAt(i+2))=='H') { 
							sb.append(ch('�', lc));
							i++; 
						}else{
							sb.append(ch('�', lc));
						}
						break;
					case 'E': sb.append(ch('�', lc)); break;
					case 'I': sb.append(ch('�', lc)); break;
					default: throw new IllegalArgumentException("Illegal transliterated symbol '"+ch+"' at position "+i);
				}
				i++; 
			}else{
				switch (ch){
					case 'A': sb.append(ch('�', lc)); break;
					case 'B': sb.append(ch('�', lc)); break;
					case 'V': sb.append(ch('�', lc)); break;
					case 'G': sb.append(ch('�', lc)); break;
					case 'D': sb.append(ch('�', lc)); break;
					case 'E': sb.append(ch('�', lc)); break;
					case 'Z': sb.append(ch('�', lc)); break;
					case 'I': sb.append(ch('�', lc)); break;
					case 'Y': sb.append(ch('�', lc)); break;
					case 'K': sb.append(ch('�', lc)); break;
					case 'L': sb.append(ch('�', lc)); break;
					case 'M': sb.append(ch('�', lc)); break;
					case 'N': sb.append(ch('�', lc)); break;
					case 'O': sb.append(ch('�', lc)); break;
					case 'P': sb.append(ch('�', lc)); break;
					case 'R': sb.append(ch('�', lc)); break;
					case 'S': sb.append(ch('�', lc)); break;
					case 'T': sb.append(ch('�', lc)); break;
					case 'U': sb.append(ch('�', lc)); break;
					case 'F': sb.append(ch('�', lc)); break;
					case 'C': sb.append(ch('�', lc)); break;
					default: sb.append(ch(ch, lc));
				}
			}

			i++; 
		}
		return sb.toString();
	}

	public static String cyr2lat(char ch){
		switch (ch){
			case '�': return "A";
			case '�': return "B";
			case '�': return "V";
			case '�': return "G";
			case '�': return "D";
			case '�': return "E";
			case '�': return "JO";
			case '�': return "ZH";
			case '�': return "Z";
			case '�': return "I";
			case '�': return "Y";
			case '�': return "K";
			case '�': return "L";
			case '�': return "M";
			case '�': return "N";
			case '�': return "O";
			case '�': return "P";
			case '�': return "R";
			case '�': return "S";
			case '�': return "T";
			case '�': return "U";
			case '�': return "F";
			case '�': return "KH";
			case '�': return "C";
			case '�': return "CH";
			case '�': return "SH";
			case '�': return "SHH";
			case '�': return "JHH";
			case '�': return "IH";
			case '�': return "JH";
			case '�': return "EH";
			case '�': return "JU";
			case '�': return "JA";
			default: return String.valueOf(ch);
		}
	}

	public static String cyr2lat(String s){
		StringBuilder sb = new StringBuilder(s.length()*2);
		for(char ch: s.toCharArray()){
			char upCh = toUpperCase(ch);
			String lat = cyr2lat(upCh);
			if(ch != upCh){
				lat = lat.toLowerCase();
			}
			sb.append(lat);
		}
		return sb.toString();
	}

	
	private static char ch(char ch, boolean toLowerCase){
		return toLowerCase? Character.toLowerCase(ch): ch;
	}

}
