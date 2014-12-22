package org.labcrypto.topteacher;

import java.nio.Buffer;

public interface Serializer {

    Buffer serialize(Message message);
}
