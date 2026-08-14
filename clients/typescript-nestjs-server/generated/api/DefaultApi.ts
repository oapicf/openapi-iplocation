import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Get200Response,  } from '../models';


@Injectable()
export abstract class DefaultApi {

  abstract rootGet(ip: string, format: string | undefined, delimiter: string | undefined,  request: Request): Get200Response | Promise<Get200Response> | Observable<Get200Response>;

} 