/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.Order;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-02-12T09:59:57.847217-05:00[America/New_York]")
@Validated
@Api(value = "orders", description = "the orders API")
public interface OrdersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /orders : Return a list of orders
     *
     * @param limit How many items to return at one time (max 100) (optional)
     * @return A JSON array of orders (status code 200)
     *         or unexpected error (status code 200)
     */
    @ApiOperation(value = "Return a list of orders", nickname = "listOrders", notes = "", response = Order.class, responseContainer = "List", tags={ "orders", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A JSON array of orders", response = Order.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "unexpected error", response = Error.class) })
    @GetMapping(
        value = "/orders",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Order>> listOrders(@ApiParam(value = "How many items to return at one time (max 100)") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"shipping_price\" : 1, \"user_id\" : 6, \"discount\" : 5, \"id\" : 0, \"timestamp\" : \"timestamp\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
