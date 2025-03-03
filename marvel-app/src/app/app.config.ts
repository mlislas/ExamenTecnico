import { provideHttpClient } from '@angular/common/http';
import { ApplicationConfig } from '@angular/core';
import { provideRouter } from '@angular/router';
import { CharacterListComponent } from './components/character-list/character-list.component';
import { BitacoraComponent } from './bitacora/bitacora.component';
import { appRoutes } from './app.routes';

export const appConfig: ApplicationConfig = {  
  providers: [
    provideRouter([
      { path: '', component: CharacterListComponent },
      { path: 'bitacora', component: BitacoraComponent }
    ]),
    provideHttpClient()
  ]
};
