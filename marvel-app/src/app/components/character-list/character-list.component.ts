import { Component, OnInit } from '@angular/core';
import { MarvelApiService } from '../../../services/marvel-api.service';
import { CommonModule  } from '@angular/common'; 
import { MatDialog } from '@angular/material/dialog';
import { CharacterDetailsDialogComponent } from '../../character-details-dialog/character-details-dialog.component';
import { RouterLink } from '@angular/router'; 

@Component({
  selector: 'app-character-list',
  templateUrl: './character-list.component.html',
  styleUrls: ['./character-list.component.css'],
  imports: [CommonModule, RouterLink ]
})
export class CharacterListComponent implements OnInit {
  characters: any[] = [];
  character: any = null;

  constructor(private marvelService: MarvelApiService,
              public dialog: MatDialog
  ) {}

  ngOnInit() {
    console.log("Entrando ---");
    this.marvelService.getCharacters().subscribe(data => {
    this.characters = data;

    });
  }
  showDetails(characterId: string): void {

    this.character = this.characters.find(c => c.id === characterId);
  
    //if (this.character) {
    //  alert(`Detalles del personaje:\n\nNombre: ${this.character.name}\nDescripción: ${this.character.description}`);
    //} else {
    //  alert('Personaje no encontrado');
    //}

    const dialogRef = this.dialog.open(CharacterDetailsDialogComponent, {
      data: this.character,
      width: '70vw', // 70% del ancho de la pantalla
      height: '70vh', // 70% del alto de la pantalla
      panelClass: 'custom-dialog-container'
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
    });
   
    
  }

  
}
