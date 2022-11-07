public class de.nurogames.android.ticb.base.core.ShopElement {
	 /* .source "ShopElement.java" */
	 /* # instance fields */
	 private java.lang.String m_IsPromoTill;
	 private java.lang.String m_app_desc;
	 private Integer m_app_id;
	 private java.lang.String m_app_name;
	 private java.lang.String m_app_platform;
	 private java.lang.String m_app_price;
	 private android.graphics.Bitmap m_icon;
	 private java.lang.String m_market_url;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.core.ShopElement ( ) {
		 /* .locals 0 */
		 /* .param p1, "app_id" # I */
		 /* .param p2, "icon" # Landroid/graphics/Bitmap; */
		 /* .param p3, "app_name" # Ljava/lang/String; */
		 /* .param p4, "app_price" # Ljava/lang/String; */
		 /* .param p5, "market_url" # Ljava/lang/String; */
		 /* .param p6, "app_desc" # Ljava/lang/String; */
		 /* .param p7, "app_platform" # Ljava/lang/String; */
		 /* .param p8, "is_promo_till" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 51 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 66 */
		 /* iput p1, p0, Lde/nurogames/android/ticb/base/core/ShopElement;->m_app_id:I */
		 /* .line 67 */
		 this.m_icon = p2;
		 /* .line 68 */
		 this.m_app_name = p3;
		 /* .line 69 */
		 this.m_app_price = p4;
		 /* .line 70 */
		 this.m_market_url = p5;
		 /* .line 71 */
		 this.m_app_desc = p6;
		 /* .line 72 */
		 this.m_app_platform = p7;
		 /* .line 73 */
		 this.m_IsPromoTill = p8;
		 /* .line 75 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String Desc ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 80 */
		 v0 = this.m_app_desc;
	 } // .end method
	 public Integer ID ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 78 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/core/ShopElement;->m_app_id:I */
	 } // .end method
	 public android.graphics.Bitmap Icon ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 83 */
		 v0 = this.m_icon;
	 } // .end method
	 public java.lang.String IsPromoTill ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 85 */
		 v0 = this.m_IsPromoTill;
	 } // .end method
	 public java.lang.String MarketURL ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 82 */
		 v0 = this.m_market_url;
	 } // .end method
	 public java.lang.String Name ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 79 */
		 v0 = this.m_app_name;
	 } // .end method
	 public java.lang.String Platform ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 84 */
		 v0 = this.m_app_platform;
	 } // .end method
	 public java.lang.String Price ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 81 */
		 v0 = this.m_app_price;
	 } // .end method
