import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {environment} from "../../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class SizeService {
  private API_SIZE_LIST = environment.API_LOCAL + 'size/';

  constructor(private _httpClient: HttpClient) {
  }

  getAllSize(): Observable<any> {
    return this._httpClient.get(this.API_SIZE_LIST);
  }

  getAllSizeDto(rfSize: any): Observable<any> {
    return this._httpClient.post(this.API_SIZE_LIST, rfSize);
  }
}
