import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Http } from "@angular/http";
import { ApiRequestService } from "./api-request.service";
import { UserService, UserSessionInfo} from "./user.service";
import { Observable, Subject } from "rxjs";
import {_finally} from "rxjs/operator/finally";

export interface LoginRequestParam {
  username:string;
  password:string;
}


@Injectable()
export class LoginService {

  constructor(
    private router:Router,
    private http: Http,
    private apiRequest: ApiRequestService,
    private userService: UserService
  ) {}

  getToken(username:string, password:string): Observable<any> {

    var bodyData: LoginRequestParam = {
      "username": username,
      "password": password,
    };

    return this.apiRequest.post('auth', bodyData);
  }

  logout(): void {
    this.userService.removeUserInfo();
    this.apiRequest.get('logoutApi')
  }

}
