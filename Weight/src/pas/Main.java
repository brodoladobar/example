package pas;

public class Main {
	 public static void main(String[] args) {
	  Man oneman = new Man(21,56,167);
	  Calculator c= new Calculator();
	  System.out.println("Человек с парамметрамми:"+oneman.age+" лет,"+oneman.weight+" вес,"+oneman.hight+" рост");
	  System.out.println("Индекс массы тела:"+c.BMT(oneman));
	 }
}
