import {Component} from '@angular/core';
import {Router} from '@angular/router';
import {LoginService} from "../../services/login.service";
import {UserService, UserSessionInfo} from "../../services/user.service";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  public model: any = {};
  public errMsg: string = '';
  constructor(
    private router: Router,
    private loginService: LoginService,
    private userService: UserService
  ) {}

  public loginUser():void {

    var username = this.model.username;
    var password = this.model.password;
    var userSessionInfo: UserSessionInfo;

    //get user session variables
    this.loginService.getToken(username, password)
      .subscribe(resp => {
        userSessionInfo = {
            "token"       :resp.token,
        };

        this.userService.storeToken(JSON.stringify(userSessionInfo));
        this.router.navigate(['dashboard']);
      },
        error => {
          this.errMsg = 'Username or password is incorrect.';
      });
  }

}
