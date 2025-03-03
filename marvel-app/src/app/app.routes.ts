import { Routes } from '@angular/router';
import { CharacterListComponent } from '../app/components/character-list/character-list.component';
import { BitacoraComponent } from './bitacora/bitacora.component';

export const appRoutes: Routes = [
  { path: '', component: CharacterListComponent  },  // Ruta principal
  { path: 'bitacora', component: BitacoraComponent }
];
