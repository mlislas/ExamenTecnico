import { Component, CUSTOM_ELEMENTS_SCHEMA, OnInit } from '@angular/core';
import { RouterModule } from '@angular/router';  // Importa RouterModule
import { HttpClientModule } from '@angular/common/http';  // Si necesitas HttpClient
import { appRoutes  } from './app.routes';  // Importa las rutas
import { CharacterListComponent} from './components/character-list/character-list.component';  // Importa las rutas

@Component({
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  standalone: true,  // Es un componente standalone
  imports: [HttpClientModule, RouterModule, CharacterListComponent],  // Asegúrate de importar RouterModule
})
export class AppComponent {
  title = 'mi-proyecto-angular';
}
