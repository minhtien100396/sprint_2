import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {LoginComponent} from "./security/login/login.component";
import {HomeComponent} from "./home/home.component";
import {ProductDetailComponent} from "./product/product-detail/product-detail.component";
import {PaymentCartComponent} from "./payment/payment-cart/payment-cart.component";


const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path:'',component:HomeComponent},
  {path:'product-detail',component:ProductDetailComponent},
  {path:'payment-cart',component:PaymentCartComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
