package controllers;

import apimodels.Get200Response;
import apimodels.Get400Response;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2025-05-10T04:58:54.147295106Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class DefaultApiControllerImp extends DefaultApiControllerImpInterface {
    @Override
    public Get200Response rootGet(Http.Request request, @NotNull String ip, String format, String delimiter) throws Exception {
        //Do your magic!!!
        return new Get200Response();
    }

}
