using FastEndpoints;
using FastEndpoints.Swagger;

var builder = WebApplication.CreateBuilder(args);

builder.Services
    
    .AddFastEndpoints()
    .SwaggerDocument(o =>
    {
        o.DocumentSettings = s =>
        {
            s.DocumentName = "iplocation.net API";
            s.Title = "iplocation.net API";
            s.Description = """
OpenAPI v3 specification and a set of generated API clients for iplocation.net
""";
            s.Version = "1.2.1-pre.0";
        };
        o.AutoTagPathSegmentIndex = 0;
    })
    
;

var app = builder.Build();

app
    
    .UseFastEndpoints(x =>
    {
        
    })
    .UseSwaggerGen();

app.UseHttpsRedirection();

app.Run();