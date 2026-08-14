import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { DefaultApi } from '../api';
import { Get200Response,  } from '../models';

@Controller()
export class DefaultApiController {
  constructor(private readonly defaultApi: DefaultApi) {}

  @Get('/')
  rootGet(@Query('ip') ip: string, @Query('format') format: string | undefined, @Query('delimiter') delimiter: string | undefined, @Req() request: Request): Get200Response | Promise<Get200Response> | Observable<Get200Response> {
    return this.defaultApi.rootGet(ip, format, delimiter, request);
  }

} 