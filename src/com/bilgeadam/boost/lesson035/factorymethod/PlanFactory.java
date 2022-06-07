package com.bilgeadam.boost.lesson035.factorymethod;

public class PlanFactory {

	public Plan getPlan(String planType) {
		if(planType == null) {
			return null;
		}
		if(planType.equalsIgnoreCase("Domestic")) {
			return new DomesticPlan();
		}else if(planType.equalsIgnoreCase("Commercial")){
			return new CommercialPlan();
		}else if(planType.equalsIgnoreCase("Institutional")) {
			return new InstitutionalPlan();
		}
		return null;
	}
}
