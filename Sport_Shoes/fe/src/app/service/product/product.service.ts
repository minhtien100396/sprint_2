import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {environment} from "../../../environments/environment";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private API_PRODUCT_PAGE = environment.API_LOCAL + 'products';

  constructor(private _httpClient: HttpClient) {
  }

  getAllProduct(pageNumber: number): Observable<any> {
    return this._httpClient.get(this.API_PRODUCT_PAGE + '?page=' + pageNumber);
  }
}
