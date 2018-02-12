import { Injectable } from '@angular/core';
import {Observable} from "rxjs/Observable";
import {ApiRequestService} from "./api-request.service";
import {Http} from "@angular/http";
import {Router} from "@angular/router";

@Injectable()
export class AnnouncementService {

  constructor(
    private router: Router,
    private http: Http,
    private apiRequest: ApiRequestService
  ) {}

  getList(): Observable<any> {
    return this.apiRequest.get('globalannouncement/list');
  }

  getCount(): Observable<any> {
    return this.apiRequest.get('globalannouncement/count');
  }
}
