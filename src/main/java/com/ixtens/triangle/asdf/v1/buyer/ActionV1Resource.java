package com.ixtens.triangle.asdf.v1.buyer;

import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(RestPathConstants.BUYER_URL_V1)
@Api(value = RestPathConstants.SWAGGER_BUYER_V1 + "actions", description = "Buyer API - Action Status Resource")
public class ActionV1Resource {


    @ApiOperation(value = "Search Action Info", notes = "Get Actions detailed status using search criteria",
            response = ActionInfoListDto.class)
    @RequestMapping(value = "/actions", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ActionInfoListDto search(@ModelAttribute ActionSearchParamsDto searchParams) {
        return new ActionInfoListDto();
    }

    @ApiOperation(value = "Get Action Info", notes = "Get Action status", response = ActionInfoDto.class)
    @RequestMapping(value = "/actions/{actionId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ActionInfoDto getActionInfo(@ApiParam(value = "Action ID") @PathVariable Long actionId) {
        return new ActionInfoDto();
    }

    @ApiOperation(value = "Get exported products file id", notes = "Get exported products file id", response = String.class)
    @RequestMapping(value = "/actions/{actionId}/products-export", method = RequestMethod.GET)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Request successful", response = String.class),
            @ApiResponse(code = 400, message = "Invalid request parameters"),
    })
    public String getProductExport(@ApiParam(value = "Action Id") @PathVariable Long actionId) throws ObjectNotFoundException {
        return "hello world";
    }

}
