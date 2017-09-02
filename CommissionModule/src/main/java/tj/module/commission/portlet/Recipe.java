package tj.module.commission.portlet;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class Recipe {

	  /**
     * ����� �����
     */
    private BigDecimal amount;

    /**
     * ����������� �� Long
     */
    public Recipe(long l) {
        String s = String.valueOf(l);
        if (!s.contains(".") )
            s += ".0";
        this.amount = new BigDecimal( s );
    }

    /**
     * ����������� �� Double
     */
    public Recipe(double l) {
        String s = String.valueOf(l);
        if (!s.contains(".") )
            s += ".0";
        this.amount = new BigDecimal( s );
    }

    /**
     * ����������� �� String
     */
    public Recipe(String s) {
        if (!s.contains(".") )
            s += ".0";
        this.amount = new BigDecimal( s );
    }

    /**
     * ������� ����� ��� ������
     */
    public String asString() {
        return amount.toString();
    }

    /**
     * ������� ����� ��������, � ��������� �� ������
     */
    public String num2str() {
        return num2str(false,false);
    }

    /**
     * ������� ����� ��������
     * @param stripkop boolean ���� - ���������� ������� ��� ���
     * @return String ����� ��������
     */
    public String num2str(boolean stripkop, boolean striprub) {
        String[][] sex = {
            {"","����","���","���","������","����","�����","����","������","������"},
            {"","����","���","���","������","����","�����","����","������","������"},
        };
        String[] str100= {"","���","������","������","���������","�������","��������","�������", "���������","���������"};
        String[] str11 = {"","������","�����������","����������","����������","������������", "����������","�����������","����������","������������","������������","��������"};
        String[] str10 = {"","������","��������","��������","�����","���������","����������", "���������","�����������","���������"};
        String[][] forms = {
            {"�������", "�������", "������", "1"},
            {"�����", "�����", "������", "0"},
            {"������", "������", "�����", "1"},
            {"�������", "��������", "���������", "0"},
            {"��������","���������","����������","0"},
            {"��������","���������","����������","0"},
            // ����� ��������� ������ ������������ � �.�.
        };
        // �������� �������� ����� � �������
        long rub = amount.longValue();
        String[] moi = amount.toString().split("\\.");
        long kop = Long.valueOf(moi[1]);
        if (!moi[1].substring( 0,1).equals("0") ){// ���������� �� � ����
            if (kop<10 )
                kop *=10;
        }
        String kops = String.valueOf(kop);
        if (kops.length()==1 )
            kops = "0"+kops;
        long rub_tmp = rub;
        // ����������� ����� �� �������� �� 3 ����� � �����
        ArrayList segments = new ArrayList();
        while(rub_tmp>999) {
            long seg = rub_tmp/1000;
            segments.add( rub_tmp-(seg*1000) );
            rub_tmp=seg;
        }
        segments.add( rub_tmp );
        Collections.reverse(segments);
        // ����������� ��������
        String o = "";
        if (rub == 0) {// ���� ����
        	
        	if(!striprub)
            o = "���� "+morph( 0, forms[1][ 0],forms[1][1],forms[1][2]);
        	else
        	o = "���� ";	
        	
        	if (stripkop)
                return o;
            else
                return o +" "+kop+" "+morph(kop,forms[ 0][ 0],forms[ 0][1],forms[ 0][2]);
        }
        // ������ ����
        int lev = segments.size();
        for (int i= 0; i<segments.size(); i++ ) {// ���������� ��������
            int sexi = (int)Integer.valueOf( forms[lev][3].toString() );// ���������� ���
            int ri = (int)Integer.valueOf( segments.get(i).toString() );// ������� �������
            if (ri== 0 && lev>1) {// ���� ������� ==0 � �� ��������� �������(��� Units)
                lev--;
                continue;
            }
            String rs = String.valueOf(ri); // ����� � ������
            // ������������
            if (rs.length()==1) rs = "00"+rs;// ��� ������ � �������?
            if (rs.length()==2) rs = "0"+rs; // ��� ����� ����?
            // �������� ������� ��� �������
            int r1 = (int)Integer.valueOf( rs.substring( 0,1) ); //������ �����
            int r2 = (int)Integer.valueOf( rs.substring(1,2) ); //������
            int r3 = (int)Integer.valueOf( rs.substring(2,3) ); //������
            int r22= (int)Integer.valueOf( rs.substring(1,3) ); //������ � ������
            // �����-����-���������� �������
            if (ri>99) o += str100[r1]+" "; // �����
            if (r22>20) {// >20
                o += str10[r2]+" ";
                o += sex[ sexi ][r3]+" ";
            }
            else { // <=20
                if (r22>9) o += str11[r22-9]+" "; // 10-20
                else o += sex[ sexi ][r3]+" "; // 0-9
            }
            // ������� ��������� (�����...)
           
            if(striprub && lev < 2)
            	break;
            
        	       o += morph(ri, forms[lev][ 0],forms[lev][1],forms[lev][2])+" ";
            lev--;
        }
        // ������� � �������� ����
        if (stripkop) {
            o = o.replaceAll(" {2,}", " ");
        }
        else {
            o = o+""+kops+" "+morph(kop,forms[ 0][ 0],forms[ 0][1],forms[ 0][2]);
            o = o.replaceAll(" {2,}", " ");
        }
        return o;
    }

    /**
     * �������� ����������
     * @param n Long ���������� ��������
     * @param f1 String ������� ���������� ��� ������ �������
     * @param f2 String ������� ���������� ��� ���� ��������
     * @param f5 String ������� ���������� ��� ���� ��������
     * @return String ���������� ������� ���������� ��� ���������� ���������� ��������
     */
    public static String morph(long n, String f1, String f2, String f5) {
        n = Math.abs(n) % 100;
        long n1 = n % 10;
        if (n > 10 && n < 20) return f5;
        if (n1 > 1 && n1 < 5) return f2;
        if (n1 == 1) return f1;
        return f5;
    }
}
