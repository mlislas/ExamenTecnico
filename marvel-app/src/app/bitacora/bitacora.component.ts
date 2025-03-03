import { Component, OnInit } from '@angular/core';
import { MarvelApiService } from '../../services/marvel-api.service';
import { CommonModule  } from '@angular/common'; 

@Component({
  selector: 'app-bitacora',
  standalone: true,
  templateUrl: './bitacora.component.html',
  styleUrls: ['./bitacora.component.css'],
  imports: [CommonModule ]
})
export class BitacoraComponent implements OnInit {
  bitacora: any[] = [];

  constructor(private marvelApiService: MarvelApiService) {}

  ngOnInit(): void {
    console.log('BitácoraComponent inicializado');
    this.marvelApiService.getConsultationLog().subscribe(data => {
      this.bitacora = data;
    });
  }
}
