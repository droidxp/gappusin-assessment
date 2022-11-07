public class com.adknowledge.superrewards.ui.adapter.item.SROfferPaymentItem {
	 /* .source "SROfferPaymentItem.java" */
	 /* # instance fields */
	 private android.graphics.drawable.Drawable icon;
	 private android.graphics.drawable.Drawable image;
	 private com.adknowledge.superrewards.model.SROffer offer;
	 /* # direct methods */
	 public com.adknowledge.superrewards.ui.adapter.item.SROfferPaymentItem ( ) {
		 /* .locals 0 */
		 /* .param p1, "icon" # Landroid/graphics/drawable/Drawable; */
		 /* .param p2, "image" # Landroid/graphics/drawable/Drawable; */
		 /* .param p3, "offer" # Lcom/adknowledge/superrewards/model/SROffer; */
		 /* .prologue */
		 /* .line 48 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 49 */
		 this.icon = p1;
		 /* .line 50 */
		 this.offer = p3;
		 /* .line 51 */
		 this.image = p2;
		 /* .line 52 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.graphics.drawable.Drawable getIcon ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 24 */
		 v0 = this.icon;
	 } // .end method
	 public android.graphics.drawable.Drawable getImage ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 28 */
		 v0 = this.image;
	 } // .end method
	 public com.adknowledge.superrewards.model.SROffer getOffer ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 40 */
		 v0 = this.offer;
	 } // .end method
	 public void setIcon ( android.graphics.drawable.Drawable p0 ) {
		 /* .locals 0 */
		 /* .param p1, "icon" # Landroid/graphics/drawable/Drawable; */
		 /* .prologue */
		 /* .line 32 */
		 this.icon = p1;
		 /* .line 33 */
		 return;
	 } // .end method
	 public void setImage ( android.graphics.drawable.Drawable p0 ) {
		 /* .locals 0 */
		 /* .param p1, "image" # Landroid/graphics/drawable/Drawable; */
		 /* .prologue */
		 /* .line 36 */
		 this.image = p1;
		 /* .line 37 */
		 return;
	 } // .end method
	 public void setOffer ( com.adknowledge.superrewards.model.SROffer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "offer" # Lcom/adknowledge/superrewards/model/SROffer; */
		 /* .prologue */
		 /* .line 44 */
		 this.offer = p1;
		 /* .line 45 */
		 return;
	 } // .end method
