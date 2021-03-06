import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { UserService } from "./services/user.service";
import { Router } from "@angular/router";

@Injectable()
export class AuthGuard implements CanActivate {

  constructor(
    private userService:UserService,
    private router:Router
  ) {}

  canActivate(next: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean {
    if (!this.userService.isLoggedIn()) {
      this.router.navigate(['login']);
    }
    return this.userService.isLoggedIn();
  }
}
