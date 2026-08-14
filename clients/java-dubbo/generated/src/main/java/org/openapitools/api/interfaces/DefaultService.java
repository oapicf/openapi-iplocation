package org.openapitools.api.interfaces;

import org.openapitools.model.Get200Response;
import org.openapitools.model.Get400Response;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface DefaultService {

    /**
     * Get geolocation of an IP address
     * Retrieve geolocation of an IP address. 
     *
     * @param ip An IPv4 or IPv6 address that you would like to lookup. (required)
     * @param format Output format, the following formats are supported: plain xml json jsonp php csv serialized (optional)
     * @param delimiter Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. (optional)
     * @return Get200Response
     */
    Get200Response rootGet(
        String ip,
        String format,
        String delimiter
    );
}
