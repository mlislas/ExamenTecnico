import { Component, OnInit } from '@angular/core';
import { MarvelApiService } from '../../../services/marvel-api.service';
import { NgFor } from '@angular/common'; // 🔹 Importa NgFor

@Component({
  selector: 'app-character-list',
  templateUrl: './character-list.component.html',
  styleUrls: ['./character-list.component.css'],
  imports: [NgFor]
})
export class CharacterListComponent implements OnInit {
  characters: any[] = [];

  constructor(private marvelService: MarvelApiService) {}

  ngOnInit() {
    console.log("Entrando ---");
    this.marvelService.getCharacters().subscribe(data => {
      this.characters = data;

    });
  }
  showDetails(characterId: string): void {
    alert('Mostrar detalles para el personaje: ' + characterId);
    
  }
}
