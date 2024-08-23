package com.p2;

import com.p1.Protection;

public class Derived1 extends Protection{

		public Derived1() {
			System.out.println("Derived1's Constructor");
//			System.out.println("n : "+n);This will not allow
			System.out.println("n_pub : "+n_pub);
			System.out.println("n_pro : "+n_pro);
//			System.out.println("n_pri : "+n_pri); this will not give access
		}
}
