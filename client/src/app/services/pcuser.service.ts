import { Injectable } from '@angular/core';
import { ApiRequestService } from "./api-request.service";
import { Http } from "@angular/http";
import { Router } from "@angular/router";
import { Observable } from "rxjs/Observable";

@Injectable()
export class PcuserService {

  constructor(
    private router:Router,
    private http: Http,
    private apiRequest: ApiRequestService
  ) {}

  getPCUserAdminList(): Observable<any> {
    return this.apiRequest.get('pcuser/listAdmin');
  }

}
