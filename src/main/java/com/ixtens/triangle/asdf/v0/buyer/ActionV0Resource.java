package com.ixtens.triangle.asdf.v0.buyer;

import com.ixtens.triangle.asdf.v1.buyer.RestPathConstants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(RestPathConstants.BUYER_URL_V0)
@Api(value = RestPathConstants.BUYER_V0 + "/actions", description = "Buyer API - Action Status Resource")
public class ActionV0Resource {

    @ApiOperation(value = "Search Action Info", notes = "Get Actions detailed status using search criteria.", response = ActionInfoListV0Dto.class)
    @RequestMapping(value = "actions", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ActionInfoListV0Dto search(@ModelAttribute ActionSearchParamsDto searchParams) {
        return new ActionInfoListV0Dto();
    }

    @ApiOperation(value = "Get Action Info", notes = "Get Action status", response = ActionInfoV0Dto.class)
    @RequestMapping(value = "/actions/{actionId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ActionInfoV0Dto getActionInfo(@ApiParam(value = "Action ID") @PathVariable Long actionId) {
        return new ActionInfoV0Dto();
    }
}
