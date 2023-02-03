import {Product} from "../../model/product/product";
import {Color} from "../../model/product/color";
import {Size} from "../../model/product/size";
import {Category} from "../../model/product/category";
import {Image} from "../../model/product/image";
import {Oder} from "../../model/order/oder";

export interface ProductDetailDto {
  id?: number;
  quantity?: number;
  deleteStatus?: boolean;
  product?: Product;
  color?: Color;
  size?: Size;
  category?: Category;
  images?: Image[];
  oders?: Oder[];
  colorId?: number;
  sizeId?: number;
  productId?: number;
}
