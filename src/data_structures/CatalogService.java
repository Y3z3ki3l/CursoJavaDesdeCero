package data_structures;

public enum CatalogService {
	
	PERSONAL_DATA (1),
	FINANCIAL_HEALTH (2)
	;
	
	private final int serviceId;

	CatalogService(int id) {
		this.serviceId = id;
	}
	
	public int getServiceId() {
		return this.serviceId;
	}

}
