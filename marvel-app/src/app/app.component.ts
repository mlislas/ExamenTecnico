import { Component, CUSTOM_ELEMENTS_SCHEMA, OnInit } from '@angular/core';
import { RouterModule } from '@angular/router';  // Importa RouterModule

@Component({
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  standalone: true,  // Es un componente standalone
  imports: [ RouterModule]  
})
export class AppComponent {
  title = 'mi-proyecto-angular';
}
