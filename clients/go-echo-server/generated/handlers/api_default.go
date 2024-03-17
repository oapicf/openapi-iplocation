package handlers
import (
	"github.com/oapicf/openapi-iplocation/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// RootGet - Get geolocation of an IP address
func (c *Container) RootGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

