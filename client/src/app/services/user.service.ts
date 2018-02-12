import { Injectable } from '@angular/core';
import { JwtUtil } from "../utils/jwt.util";

export interface UserSessionInfo{
  token:string;
}

export interface DecodedToken {
  sub:string;
  environments:Array<string>;
}

@Injectable()
export class UserService {

  public tokenKey:string = "token";
  public environmentKey:string = "environment";
  public storage:Storage = sessionStorage;
  public decodedToken: DecodedToken;

  constructor(
    private jwtUtil:JwtUtil
  ) {}

  storeToken(userSessionString:string) {
    let userSessionInfo: UserSessionInfo = JSON.parse(userSessionString);
    this.storage.setItem(this.tokenKey, userSessionInfo.token);
  }

  isLoggedIn(): boolean {
    if (this.storage.getItem(this.tokenKey) !== '' && this.storage.getItem(this.tokenKey) !== null) {
      return true;
    }
    return false;
  }

  removeUserInfo():void {
    this.storage.clear();
  }

  getStoredToken():string|null {
    if (this.storage.getItem(this.tokenKey) !== '' && this.storage.getItem(this.tokenKey) !== null) {
      return this.storage.getItem(this.tokenKey);
    }
    return null;
  }

  getUsername():string {
    this.decodedToken = this.jwtUtil.decodeToken(this.getStoredToken());
    if (this.decodedToken !== null && this.decodedToken.sub !== '' && this.decodedToken.sub !== null) {
      return this.decodedToken.sub.toLocaleUpperCase();
    }

    return null;
  }

  getEnvironments():Array<string> {
    this.decodedToken = this.jwtUtil.decodeToken(this.getStoredToken());
    if (this.decodedToken !== null && this.decodedToken.environments !== null && this.decodedToken.environments.length !== 0) {
      return this.decodedToken.environments;
    }

    return null;
  }

  getEnvironment():string {
    if (this.storage.getItem(this.environmentKey) !== '' && this.storage.getItem(this.environmentKey) !== null) {
      return this.storage.getItem(this.environmentKey);
    }
    return null;
  }

  setEnvironment(name):void {
    this.storage.setItem(this.environmentKey, name);
  }
}
