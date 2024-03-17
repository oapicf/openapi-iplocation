package main

import (
	"github.com/oapicf/openapi-iplocation/handlers"
	"github.com/labstack/echo/v4"
	"github.com/labstack/echo/v4/middleware"
)

func main() {
	e := echo.New()

	//todo: handle the error!
	c, _ := handlers.NewContainer()

	// Middleware
	e.Use(middleware.Logger())
	e.Use(middleware.Recover())


	// RootGet - Get geolocation of an IP address
	e.GET("/", c.RootGet)


	// Start server
	e.Logger.Fatal(e.Start(":8080"))
}
