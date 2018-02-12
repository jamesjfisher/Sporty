import {Component} from '@angular/core';
import {UserService} from "./services/user.service";
import {Router} from "@angular/router";
import {LoginService} from "./services/login.service";
import {AnnouncementService} from "./services/announcement.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private router: Router,
              private userService: UserService,
              private announcementService: AnnouncementService,
              private loginService: LoginService
  ) {}

  logout() {
    this.loginService.logout();
    this.router.navigate(['login']);
  }

}
