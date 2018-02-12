import { Component, OnInit } from '@angular/core';
import { UserService } from "../../services/user.service";
import { AnnouncementService } from "../../services/announcement.service";
import { Router } from "@angular/router";
import { LoginService } from "../../services/login.service";

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})

export class DashboardComponent implements OnInit {

  announcementCount:number;
  environments:Array<string>;
  selected:string;
  user:string;

  constructor(
    private router: Router,
    private userService:UserService,
    private loginService:LoginService,
    private announcementService:AnnouncementService
  ) {}


  ngOnInit(): void {
    this.user = this.userService.getUsername();
    // this.environments = this.userService.getEnvironments();
    // this.selected = this.environments[0];
    // this.userService.setEnvironment(this.selected);
    // this.setCounts();
  }

  onSelectEnvironment(name): void {
    this.selected = name;
    this.userService.setEnvironment(this.selected);
    this.setCounts();
    this.router.navigate(['dashboard']);
  }

  setCounts(): void {
    this.setAnnouncementCount();
  }

  setAnnouncementCount(): void {
    this.announcementCount = 0;
    this.announcementService.getCount()
      .subscribe(data => {
          this.announcementCount = data;
        }
      );
  }

  logout() {
    this.loginService.logout();
    this.router.navigate(['login']);
  }
}
