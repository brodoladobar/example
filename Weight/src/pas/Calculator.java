package pas;

public class Calculator {
	
	public double bmt=0;
	public String ims;
	
	public double BMT(Man m){
		bmt= m.weight/((m.hight/100)*(m.hight/100));
		
		GetResult(bmt, m.age, m.hight);
		return bmt;
	}
	
	public double IdealW(double h)
	{
		double ideal=0;
		if( h>160){	ideal=h-110;}
		else{ ideal=h-100;}
	    return ideal;
	}

	public void GetResult(double bmt, int a, double h)
	{
		if (a>19 && a<24) 
		{
		if( bmt>19 && bmt<24) { System.out.println(" ��� ��� � �����:");}
		if( bmt<19) { System.out.println(" ������� ����� ����:");
				      System.out.println("��� ��������� ���:"+IdealW(h));}
		if( bmt>24) { System.out.println(" ���������� ��� ����");
	                  System.out.println("��� ��������� ���:"+IdealW(h));}
		}
		
		if (a>25 && a<34) 
		{
		if(bmt>20 && bmt<25) { System.out.println(" ��� ��� � �����");}
		if( bmt<20) { System.out.println(" ������� ����� ����:");
		System.out.println("��� ��������� ���:"+IdealW(h));}
		if( bmt>25) { System.out.println(" ���������� ��� ����:");
		System.out.println("��� ��������� ���:"+IdealW(h));}
		}
		
		if (a>35 && a<44) 
		{
		if( bmt>21 && bmt<26) { System.out.println(" ��� ��� � �����");}
		if( bmt<21) { System.out.println(" ������� ����� ����:");
		System.out.println("��� ��������� ���:"+IdealW(h));}
		if( bmt>26) { System.out.println(" ���������� ��� ����:");
		System.out.println("��� ��������� ���:"+IdealW(h));}
		}
		
		if (a>45 && a<54) 
		{
		if( a>22 && a<27) { System.out.println(" ��� ��� � �����:");}
		if( a<22) { System.out.println(" ������� ����� ����:");
		System.out.println("��� ��������� ���:"+IdealW(h));}
		if( a>27) { System.out.println(" ���������� ��� ����:");
		System.out.println("��� ��������� ���:"+IdealW(h));}
		}
		
		if (a>55 && a<64) 
		{
		if( a>23 && a<28) { System.out.println(" ��� ��� � �����:");}
		if( a<23) { System.out.println(" ������� ����� ����:");
		System.out.println("��� ��������� ���:"+IdealW(h));}
		if( a>28) { System.out.println(" ���������� ��� ����:");
		System.out.println("��� ��������� ���:"+IdealW(h));}
		}
		
		
		}
	   

}
