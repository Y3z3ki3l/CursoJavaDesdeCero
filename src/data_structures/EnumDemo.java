package data_structures;

public class EnumDemo {

	public static void main(String[] args) {
		
		CatalogService service1 = CatalogService.PERSONAL_DATA;
		System.out.println("Service Id: " + service1.getServiceId());
		
		CatalogService service2 = CatalogService.FINANCIAL_HEALTH;
		System.out.println("Service Id: " + service2.getServiceId());
		
	}

}
