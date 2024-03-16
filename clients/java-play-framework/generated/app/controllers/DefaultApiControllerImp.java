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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-04-02T00:24:40.469244Z[Etc/UTC]")
public class DefaultApiControllerImp extends DefaultApiControllerImpInterface {
    @Override
    public Get200Response rootGet(Http.Request request, @NotNull Object ip, Object format, Object delimiter) throws Exception {
        //Do your magic!!!
        return new Get200Response();
    }

}
