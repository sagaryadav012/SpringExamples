package com.learnings.JavaBasedConfigExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class OnePlus implements Phone
{
   @Autowired
   @Qualifier("mediaTek")
   Processor p;
   
   @Autowired
   @Qualifier("sony")
   Camera cam;
   
//	public Processor getP() {
//		return p;
//	}
//	public void setP(Processor p) {
//		this.p = p;
//	}
//	public Camera getCam() {
//		return cam;
//	}
//	public void setCam(Camera cam) {
//		this.cam = cam;
//	}
   
   public void specs()
   {
	   System.out.println("Phone : OnePlus");
	   p.pType();
	   cam.camFeatures();
   }

}
