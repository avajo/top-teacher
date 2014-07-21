package org.labcrypto.topteacher;

public interface SerializationService {

	ByteArray serialize(Message message) throws SerializationException;

	Message deserialize(ByteArray byteArray) throws SerializationException;
}
