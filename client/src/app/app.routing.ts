import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from "./pages/home/home.component";
import { LoginComponent } from "./pages/login/login.component";
import { AuthGuard } from "./auth.guard";
import { NgModule } from "@angular/core";
import { PageNotFoundComponent } from "./pages/404/page-not-found.component";
import { PCUserComponent } from "./pages/pcuser/pcuser.component";
import { AnnouncementComponent } from "./pages/announcement/announcement.component";
import { DashboardComponent } from "./pages/dashboard/dashboard.component";

const routes: Routes = [
  { path: '', redirectTo: '/dashboard', pathMatch: 'full' },
  { path: 'dashboard', component: DashboardComponent, canActivate: [AuthGuard],
    children: [
      { path: '', redirectTo: '/dashboard', pathMatch: 'full'},
      { path: 'announcement', component: AnnouncementComponent },
      { path: 'pcuser', component: PCUserComponent}
    ]
  },
  { path: 'login', component: LoginComponent },



  // otherwise redirect to 'page not found'
  { path: '**', component: PageNotFoundComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes, {useHash: true})],
  exports: [RouterModule]
})

export class AppRoutingModule {}
