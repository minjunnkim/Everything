
public class receipt {
	    public static void main(String[] args) {
	       double Subtotal = (38 + 40 + 30);
	       double Tax = ((38 + 40 + 30) * .08);
	       double Tip = ((38 + 40 + 30) * .15);
	       double Total = (Subtotal + Tax + Tip);
	       System.out.println("Subtotal:" + Subtotal);
	       System.out.println("Tax:" + Tax);
	       System.out.println("Tip:" + Tip);
	       System.out.println("Total:" + Total);
	    }
	}
