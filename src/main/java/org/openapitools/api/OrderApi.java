/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

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
@Api(value = "order", description = "the order API")
public interface OrderApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /order : Add a order
     *
     * @param order Order to create (required)
     * @return Successfully created order (status code 200)
     *         or Invalid input (status code 405)
     */
    @ApiOperation(value = "Add a order", nickname = "addOrder", notes = "", response = Order.class, tags={ "order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created order", response = Order.class),
        @ApiResponse(code = 405, message = "Invalid input") })
    @PostMapping(
        value = "/order",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Order> addOrder(@ApiParam(value = "Order to create" ,required=true )  @Valid @RequestBody Order order) {
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


    /**
     * DELETE /order/{orderId} : Delete a order
     *
     * @param orderId ID of order to delete (required)
     * @return Invalid order value (status code 400)
     */
    @ApiOperation(value = "Delete a order", nickname = "deleteOrder", notes = "", tags={ "order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid order value") })
    @DeleteMapping(
        value = "/order/{orderId}"
    )
    default ResponseEntity<Void> deleteOrder(@ApiParam(value = "ID of order to delete",required=true) @PathVariable("orderId") Long orderId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /order/{orderId} : Return a single order
     *
     * @param orderId ID of order to return (required)
     * @return A JSON representation of a order (status code 200)
     *         or Invalid order ID (status code 400)
     *         or Order not found (status code 404)
     */
    @ApiOperation(value = "Return a single order", nickname = "getOrderById", notes = "", response = Order.class, tags={ "order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A JSON representation of a order", response = Order.class),
        @ApiResponse(code = 400, message = "Invalid order ID"),
        @ApiResponse(code = 404, message = "Order not found") })
    @GetMapping(
        value = "/order/{orderId}",
        produces = { "application/json" }
    )
    default ResponseEntity<Order> getOrderById(@ApiParam(value = "ID of order to return",required=true) @PathVariable("orderId") Long orderId) {
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


    /**
     * PUT /order : Update a order
     *
     * @param order Order to create (required)
     * @return Successfully updated order (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Order not found (status code 404)
     *         or Invalid input (status code 405)
     */
    @ApiOperation(value = "Update a order", nickname = "updateOrder", notes = "", response = Order.class, tags={ "order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully updated order", response = Order.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Order not found"),
        @ApiResponse(code = 405, message = "Invalid input") })
    @PutMapping(
        value = "/order",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Order> updateOrder(@ApiParam(value = "Order to create" ,required=true )  @Valid @RequestBody Order order) {
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