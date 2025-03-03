import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
  standalone: true  // Este componente es standalone
})
export class HomeComponent {
  title = 'Marvel Characters';  // O lo que desees mostrar
}
