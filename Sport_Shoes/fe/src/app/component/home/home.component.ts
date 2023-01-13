import {Component, OnInit} from '@angular/core';
import {ProductService} from "../../service/product/product.service";
import {PageProduct} from "../../dto/product/PageProduct";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  brand: boolean = false;
  percent: boolean = false;
  pageProduct: PageProduct | undefined;

  constructor(private _productService: ProductService) {
  }

  ngOnInit(): void {
    this.getPageProduct();

  }

  checkBrand() {
    this.brand = !this.brand;
  }

  checkPercent() {
    this.percent = !this.percent;
  }

  getPageProduct() {
    this._productService.getAllProduct(0).subscribe(data => {
      this.pageProduct = data;
    })
  }

  goToPage(i: number) {
    this._productService.getAllProduct(i).subscribe(
      data => {
        this.pageProduct = data;
        console.log(data.content)
      });
  }


}
