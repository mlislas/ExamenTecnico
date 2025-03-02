import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MarvelApiService {
  private apiUrl = 'http://localhost:8080/api/marvel';

  constructor(private http: HttpClient) {}

  // Obtener listado de personajes
  getCharacters(): Observable<any> {
    return this.http.get(`${this.apiUrl}/characters`);
  }
}
