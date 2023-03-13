import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LandingComponent } from './landing/landing.component';
import { LoginComponent } from './login/login.component';
import { ContentComponent } from './content/content.component';
import { MoviesComponent } from './movies/movies.component';
import { ShowsComponent } from './shows/shows.component';

@NgModule({
  declarations: [
    LandingComponent,
    LoginComponent,
    ContentComponent,
    MoviesComponent,
    ShowsComponent,
  ],
  imports: [CommonModule],
  exports: [
    LandingComponent,
    LoginComponent,
    ContentComponent,
    MoviesComponent,
    ShowsComponent,
  ],
})
export class PagesModule {}
