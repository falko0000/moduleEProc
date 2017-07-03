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
					case 'O': sb.append(ch('¨', lc)); break;
					case 'H':
						if(i+1 < s.length() && toUpperCase(s.charAt(i+1))=='H') { 
							sb.append(ch('Ú', lc));
							i++; 
						}else{
							sb.append(ch('Ü', lc));
						}
						break;
					case 'U': sb.append(ch('Þ', lc)); break;
					case 'A': sb.append(ch('ß', lc)); break;
					default: throw new IllegalArgumentException("Illegal transliterated symbol '"+ch+"' at position "+i);
				}
			}else if(i+1 < s.length() && toUpperCase(s.charAt(i+1))=='H' ){
				switch (ch){
					case 'Z': sb.append(ch('Æ', lc)); break;
					case 'K': sb.append(ch('Õ', lc)); break;
					case 'C': sb.append(ch('×', lc)); break;
					case 'S':
						if(i+2 < s.length() && toUpperCase(s.charAt(i+2))=='H') { 
							sb.append(ch('Ù', lc));
							i++; 
						}else{
							sb.append(ch('Ø', lc));
						}
						break;
					case 'E': sb.append(ch('Ý', lc)); break;
					case 'I': sb.append(ch('Û', lc)); break;
					default: throw new IllegalArgumentException("Illegal transliterated symbol '"+ch+"' at position "+i);
				}
				i++; 
			}else{
				switch (ch){
					case 'A': sb.append(ch('À', lc)); break;
					case 'B': sb.append(ch('Á', lc)); break;
					case 'V': sb.append(ch('Â', lc)); break;
					case 'G': sb.append(ch('Ã', lc)); break;
					case 'D': sb.append(ch('Ä', lc)); break;
					case 'E': sb.append(ch('Å', lc)); break;
					case 'Z': sb.append(ch('Ç', lc)); break;
					case 'I': sb.append(ch('È', lc)); break;
					case 'Y': sb.append(ch('É', lc)); break;
					case 'K': sb.append(ch('Ê', lc)); break;
					case 'L': sb.append(ch('Ë', lc)); break;
					case 'M': sb.append(ch('Ì', lc)); break;
					case 'N': sb.append(ch('Í', lc)); break;
					case 'O': sb.append(ch('Î', lc)); break;
					case 'P': sb.append(ch('Ï', lc)); break;
					case 'R': sb.append(ch('Ð', lc)); break;
					case 'S': sb.append(ch('Ñ', lc)); break;
					case 'T': sb.append(ch('Ò', lc)); break;
					case 'U': sb.append(ch('Ó', lc)); break;
					case 'F': sb.append(ch('Ô', lc)); break;
					case 'C': sb.append(ch('Ö', lc)); break;
					default: sb.append(ch(ch, lc));
				}
			}

			i++; 
		}
		return sb.toString();
	}

	public static String cyr2lat(char ch){
		switch (ch){
			case 'À': return "A";
			case 'Á': return "B";
			case 'Â': return "V";
			case 'Ã': return "G";
			case 'Ä': return "D";
			case 'Å': return "E";
			case '¨': return "JO";
			case 'Æ': return "ZH";
			case 'Ç': return "Z";
			case 'È': return "I";
			case 'É': return "Y";
			case 'Ê': return "K";
			case 'Ë': return "L";
			case 'Ì': return "M";
			case 'Í': return "N";
			case 'Î': return "O";
			case 'Ï': return "P";
			case 'Ð': return "R";
			case 'Ñ': return "S";
			case 'Ò': return "T";
			case 'Ó': return "U";
			case 'Ô': return "F";
			case 'Õ': return "KH";
			case 'Ö': return "C";
			case '×': return "CH";
			case 'Ø': return "SH";
			case 'Ù': return "SHH";
			case 'Ú': return "JHH";
			case 'Û': return "IH";
			case 'Ü': return "JH";
			case 'Ý': return "EH";
			case 'Þ': return "JU";
			case 'ß': return "JA";
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
