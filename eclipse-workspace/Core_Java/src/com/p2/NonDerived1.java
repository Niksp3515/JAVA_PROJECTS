package com.p2;

import com.p1.Protection;

public class NonDerived1 {
	public NonDerived1() {
		Protection p =new Protection()
;		System.out.println("NonDerived's Constructor");
//		System.out.println("n : "+p.n);this will not allow
		System.out.println("n_pub : "+p.n_pub);
//		System.out.println("n_pro : "+p.n_pro);this will not allow
//		System.out.println("n_pri : "+p.n_pri); this will not give access
	}
}
