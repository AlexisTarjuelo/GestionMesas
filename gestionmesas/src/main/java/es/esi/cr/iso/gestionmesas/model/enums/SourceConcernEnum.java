package es.esi.cr.iso.gestionmesas.model.enums;

public enum SourceConcernEnum {
	
	APPLICATION(1, "Applications"), SERVICE(2, "Services"), PROCESS(3, "Processes");
	
	private int id;
	private String label;
	
	private SourceConcernEnum(int id, String label) {
		this.id=id;
		this.label=label;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
}
