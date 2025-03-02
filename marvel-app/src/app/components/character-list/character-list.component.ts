import { Component, OnInit } from '@angular/core';
import { MarvelApiService } from '../../../services/marvel-api.service';

@Component({
  selector: 'app-character-list',
  templateUrl: './character-list.component.html',
  styleUrls: ['./character-list.component.css']
})
export class CharacterListComponent implements OnInit {
  characters: any[] = [];

  constructor(private marvelService: MarvelApiService) {}

  ngOnInit() {
    this.marvelService.getCharacters().subscribe(data => {
      this.characters = data;
    });
  }
}
