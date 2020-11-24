package coreservletsbean;

public class ColorBeanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorBean colorBean = new ColorBean();
		System.out.println("OG FG color " + colorBean.getForegroundColor());	
		
		System.out.println("OG BG color " + colorBean.getBackgroundColor() );	

		
		if(args.length > 1){
			colorBean.setForegroundColor(args[0]);
			colorBean.setBackgroundColor(args[1]);
//			colorBean.setForegroundColor("RED");
//			colorBean.setBackgroundColor("BLUE");
		
		
		System.out.println("New FG color " + colorBean.getForegroundColor());	

		
		System.out.println("New BG color " + colorBean.getBackgroundColor());	
		}

	}

}
