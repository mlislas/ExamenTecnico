import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MarvelApiService {
  private apiUrl = 'http://localhost:8080/api/marvel';

  headers = new HttpHeaders({
    'Authorization': 'Basic ' + btoa('user:password')
  });

  constructor(private http: HttpClient) {}

  // Obtener listado de personajes
  getCharacters(): Observable<any> {
    return this.http.get(`${this.apiUrl}/characters`, { headers: this.headers });
  }

  getCharacterById(characterId: string): Observable<any> {
    return this.http.get(`${this.apiUrl}/characters/${characterId}`, { headers: this.headers });
  }

  getConsultationLog(): Observable<any> {

    return this.http.get('http://localhost:8080/logs/listar', { headers: this.headers });  // Ajusta la URL según tu API de logs
    
  }

}
