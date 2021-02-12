package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-02-12T09:59:57.847217-05:00[America/New_York]")
@Controller
@RequestMapping("${openapi.commerce.base-path:}")
public class OrderitemsApiController implements OrderitemsApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OrderitemsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
