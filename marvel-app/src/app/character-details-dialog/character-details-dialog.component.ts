import { Component, Inject } from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
  selector: 'app-character-details-dialog',
  imports: [],
  templateUrl: './character-details-dialog.component.html',
  styleUrl: './character-details-dialog.component.scss'
})
export class CharacterDetailsDialogComponent {
  constructor(@Inject(MAT_DIALOG_DATA) public character: any) {}

}
