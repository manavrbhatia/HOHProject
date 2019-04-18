import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';

import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms'

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { TableManagementComponent } from './table-management/table-management.component';
import { GuestManagementComponent } from './guest-management/guest-management.component';
import { NavComponent } from './nav/nav.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  { path: "table", component: TableManagementComponent },
  { path: "register", component: RegisterComponent },
  { path: "login", component: LoginComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    TableManagementComponent,
    GuestManagementComponent,
    NavComponent,
    RegisterComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
