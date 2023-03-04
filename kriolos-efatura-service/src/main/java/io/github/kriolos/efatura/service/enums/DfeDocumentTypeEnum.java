package io.github.kriolos.efatura.service.enums;

public enum DfeDocumentTypeEnum {
	NONE(0),
	FTE(1),
	FRE(2),
	TVE(3),
	RCE(4),
	NCE(5),
	NDE(6),
	DTE(7),
	DVE(8),
	NLE(9);
	
	private int value;

	DfeDocumentTypeEnum(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static DfeDocumentTypeEnum convert(int n) {
        for(DfeDocumentTypeEnum o : values())
            if(o.getValue() == n)
                return o;
        return null;
    }
}
