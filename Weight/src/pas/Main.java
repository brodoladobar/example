package pas;

public class Main {
	 public static void main(String[] args) {
	  Man oneman = new Man(21,56,167);
	  Calculator c= new Calculator();
	  System.out.println("������� � �������������:"+oneman.age+" ���,"+oneman.weight+" ���,"+oneman.hight+" ����");
	  System.out.println("������ ����� ����:"+c.BMT(oneman));
	 }
}
