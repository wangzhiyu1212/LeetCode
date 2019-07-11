package codetest;

public enum CustomerMergeTransactionStatus {
	
	NOT_START("0"),
	IN_PROGRESS("1"),
	DONE_MERGE("2"),
	DONE_NO_MERGE("3"),
	CANCELED("4");
	
	private final String value;

	CustomerMergeTransactionStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
