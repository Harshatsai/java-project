import static java.lang.Math.*;
public class Volume {
	          static int count=1;
           double dlwidth;
           double dlheight;
           double dldepth;
          
		public Volume() {
			
			this(2);
			System.out.println("default constructor");
			count++;
		}
		public Volume(double dlwidth, double dlheight, double dldepth) {
			super();
			this.dlwidth = dlwidth;
			this.dlheight = dlheight;
			this.dldepth = dldepth;
			System.out.println("one parameter");
			count++;
		}
		public Volume(double dldepth)
		{
			this(34,34,34);
			
			System.out.println("constructor is"+dldepth);
			count++;
		}
		
		public static  double Volume2()
         {
			 String s1=new String();
			     Object o=new Object();
			     o=s1;
			 System.out.println(sqrt(9));
      	  // return dlwidth*dlheight*dldepth;
      	   return 2;
         }
		
		
		
}

