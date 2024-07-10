# IplocationNetAPI

OpenAPI v3 specification and a set of generated API clients for iplocation.net

## Building

To install the required dependencies and to build the elixir project, run:

```console
mix local.hex --force
mix do deps.get, compile
```

## Installation

If [available in Hex][], the package can be installed by adding `iplocation_net_api` to
your list of dependencies in `mix.exs`:

```elixir
def deps do
  [{:iplocation_net_api, "~> 0.9.0-pre.0"}]
end
```

Documentation can be generated with [ExDoc][] and published on [HexDocs][]. Once published, the docs can be found at
[https://hexdocs.pm/iplocation_net_api][docs].

## Configuration

You can override the URL of your server (e.g. if you have a separate development and production server in your
configuration files).

```elixir
config :iplocation_net_api, base_url: "https://api.iplocation.net"
```

Multiple clients for the same API with different URLs can be created passing different `base_url`s when calling
`IplocationNetAPI.Connection.new/1`:

```elixir
client = IplocationNetAPI.Connection.new(base_url: "https://api.iplocation.net")
```

[exdoc]: https://github.com/elixir-lang/ex_doc
[hexdocs]: https://hexdocs.pm
[available in hex]: https://hex.pm/docs/publish
[docs]: https://hexdocs.pm/iplocation_net_api
