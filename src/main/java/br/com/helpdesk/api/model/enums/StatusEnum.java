package br.com.helpdesk.api.model.enums;

public enum StatusEnum {
	
	NEW,
	RESOLVED,
	APPROVED,
	DISAPPROVED,
	ASSIGNED,
	CLOSED;
	
	public static StatusEnum getStatus(String status) {
		switch (status) {
			case "NEW": return NEW;
			case "RESOLVED": return RESOLVED;
			case "APPROVED": return APPROVED;
			case "DISAPPROVED": return DISAPPROVED;
			case "ASSIGNED": return ASSIGNED;
			case "CLOSED": return CLOSED;
			default: return NEW;
		}
	}

}
