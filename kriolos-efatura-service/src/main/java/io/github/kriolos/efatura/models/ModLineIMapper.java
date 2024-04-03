package io.github.kriolos.efatura.models;

import io.github.kriolos.efatura.clientapi.generated.model.PayloadProcessingResponseDfePayload;

public interface ModLineIMapper {

	public int addLineToModDoc ( int i , ModDoc doc , PayloadProcessingResponseDfePayload  d );
	
}
