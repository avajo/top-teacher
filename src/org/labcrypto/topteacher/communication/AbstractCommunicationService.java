package org.labcrypto.topteacher.communication;

import org.labcrypto.topteacher.CommunicationService;
import org.labcrypto.topteacher.SerializationService;

public abstract class AbstractCommunicationService implements CommunicationService {

	protected SerializationService serializationService;

	public SerializationService getSerializationService() {
		return serializationService;
	}

	public void setSerializationService(
			SerializationService serializationService) {
		this.serializationService = serializationService;
	}
}
