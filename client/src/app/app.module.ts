import { BrowserModule } from "@angular/platform-browser";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home.component';
import { LoginComponent } from './pages/login/login.component';
import { UserService } from "./services/user.service";
import { AuthGuard } from "./auth.guard";
import { AppRoutingModule } from './app.routing';
import { FormsModule } from "@angular/forms";
import { HttpModule } from "@angular/http";
import { LoginService } from "./services/login.service";
import { ApiRequestService } from "./services/api-request.service";
import { AppConfig } from "./app.config";
import { PageNotFoundComponent } from "./pages/404/page-not-found.component";
import { PCUserComponent } from './pages/pcuser/pcuser.component';
import { PcuserService } from "./services/pcuser.service";
import { Ng2TableModule } from "ng2-table";
import { PaginationModule, PaginationConfig } from 'ngx-bootstrap';
import { AnnouncementComponent } from './pages/announcement/announcement.component';
import { MatButtonModule, MatInputModule, MatDialogModule, MatToolbarModule, MatCardModule, MatFormFieldModule, MatSelectModule, MatSidenavModule, MatPaginatorModule, MatListModule,  MatAutocompleteModule,
  MatButtonToggleModule,
  MatCheckboxModule,
  MatChipsModule,
  MatDatepickerModule,
  MatExpansionModule,
  MatGridListModule,
  MatIconModule,
  MatMenuModule,
  MatNativeDateModule,
  MatProgressBarModule,
  MatProgressSpinnerModule,
  MatRadioModule,
  MatRippleModule,
  MatSliderModule,
  MatSlideToggleModule,
  MatSnackBarModule,
  MatSortModule,
  MatTableModule,
  MatTabsModule,
  MatTooltipModule,
  MatStepperModule, } from '@angular/material';
import { AnnouncementService } from "./services/announcement.service";
import { CreateAnnouncementComponent } from './pages/announcement/create-announcement.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { JwtUtil } from "./utils/jwt.util";
import {CdkTableModule} from '@angular/cdk/table';


@NgModule({
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    HttpModule,
    Ng2TableModule,
    PaginationModule,
    MatButtonModule,
    MatInputModule,
    MatDialogModule,
    MatToolbarModule,
    MatCardModule,
    MatSidenavModule,
    MatFormFieldModule,
    MatSelectModule,
    MatPaginatorModule,
    MatListModule,
    AppRoutingModule,
    CdkTableModule,
    MatAutocompleteModule,
    MatButtonModule,
    MatButtonToggleModule,
    MatCardModule,
    MatCheckboxModule,
    MatChipsModule,
    MatStepperModule,
    MatDatepickerModule,
    MatDialogModule,
    MatExpansionModule,
    MatGridListModule,
    MatIconModule,
    MatInputModule,
    MatListModule,
    MatMenuModule,
    MatNativeDateModule,
    MatPaginatorModule,
    MatProgressBarModule,
    MatProgressSpinnerModule,
    MatRadioModule,
    MatRippleModule,
    MatSelectModule,
    MatSidenavModule,
    MatSliderModule,
    MatSlideToggleModule,
    MatSnackBarModule,
    MatSortModule,
    MatTableModule,
    MatTabsModule,
    MatToolbarModule,
    MatTooltipModule
  ],
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    PageNotFoundComponent,
    PCUserComponent,
    AnnouncementComponent,
    CreateAnnouncementComponent,
    DashboardComponent
  ],
  entryComponents: [
    CreateAnnouncementComponent
  ],
  bootstrap: [
    AppComponent
  ],
  providers: [
    PcuserService,
    UserService,
    AuthGuard,
    LoginService,
    ApiRequestService,
    AnnouncementService,
    JwtUtil,
    PaginationConfig,
    AppConfig
  ]
})

export class AppModule { }
