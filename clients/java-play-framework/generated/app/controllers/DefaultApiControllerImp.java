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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-02T22:26:07.217339944Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DefaultApiControllerImp extends DefaultApiControllerImpInterface {
    @Override
    public Get200Response rootGet(Http.Request request, @NotNull String ip, String format, String delimiter) throws Exception {
        //Do your magic!!!
        return new Get200Response();
    }

}
