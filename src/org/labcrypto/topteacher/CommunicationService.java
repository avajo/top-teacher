package org.labcrypto.topteacher;

import java.util.List;

public interface CommunicationService {

	void setSerializationService(SerializationService serializationService);

	void send(Message message) throws CommunicationException;

	void registerMessageListener(MessageListener listener);

	void unregisterMessageListener(MessageListener listener);

	List<Instance> scanForNeighbours();
}
