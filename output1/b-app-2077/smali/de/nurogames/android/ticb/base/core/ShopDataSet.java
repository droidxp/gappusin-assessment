public class de.nurogames.android.ticb.base.core.ShopDataSet {
	 /* .source "ShopDataSet.java" */
	 /* # instance fields */
	 private java.lang.String elementDesc;
	 private Integer elementID;
	 private android.graphics.Bitmap elementIcon;
	 private java.lang.String elementIsPromoTill;
	 private java.lang.String elementMarketURL;
	 private java.lang.String elementName;
	 private java.lang.String elementPlatform;
	 private java.lang.String elementPrice;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.core.ShopDataSet ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 5 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 8 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/core/ShopDataSet;->elementID:I */
		 /* .line 9 */
		 final String v0 = ""; // const-string v0, ""
		 this.elementName = v0;
		 /* .line 10 */
		 final String v0 = ""; // const-string v0, ""
		 this.elementDesc = v0;
		 /* .line 11 */
		 final String v0 = ""; // const-string v0, ""
		 this.elementPrice = v0;
		 /* .line 12 */
		 final String v0 = ""; // const-string v0, ""
		 this.elementMarketURL = v0;
		 /* .line 13 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.elementIcon = v0;
		 /* .line 14 */
		 final String v0 = ""; // const-string v0, ""
		 this.elementPlatform = v0;
		 /* .line 15 */
		 final String v0 = "DD-MM-YYYY"; // const-string v0, "DD-MM-YYYY"
		 this.elementIsPromoTill = v0;
		 /* .line 5 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String getDesc ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 29 */
		 v0 = this.elementDesc;
	 } // .end method
	 public Integer getID ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 19 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/core/ShopDataSet;->elementID:I */
	 } // .end method
	 public android.graphics.Bitmap getIcon ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 44 */
		 v0 = this.elementIcon;
	 } // .end method
	 public java.lang.String getIsNew ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 54 */
		 v0 = this.elementIsPromoTill;
	 } // .end method
	 public java.lang.String getMarketURL ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 39 */
		 v0 = this.elementMarketURL;
	 } // .end method
	 public java.lang.String getName ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 24 */
		 v0 = this.elementName;
	 } // .end method
	 public java.lang.String getPlatform ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 49 */
		 v0 = this.elementPlatform;
	 } // .end method
	 public java.lang.String getPrice ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 34 */
		 v0 = this.elementPrice;
	 } // .end method
	 public void setDesc ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 31 */
		 this.elementDesc = p1;
		 return;
	 } // .end method
	 public void setID ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # I */
		 /* .prologue */
		 /* .line 21 */
		 /* iput p1, p0, Lde/nurogames/android/ticb/base/core/ShopDataSet;->elementID:I */
		 return;
	 } // .end method
	 public void setIcon ( android.graphics.Bitmap p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # Landroid/graphics/Bitmap; */
		 /* .prologue */
		 /* .line 46 */
		 this.elementIcon = p1;
		 return;
	 } // .end method
	 public void setIsNew ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 56 */
		 this.elementIsPromoTill = p1;
		 return;
	 } // .end method
	 public void setMarketURL ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 41 */
		 this.elementMarketURL = p1;
		 return;
	 } // .end method
	 public void setName ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 26 */
		 this.elementName = p1;
		 return;
	 } // .end method
	 public void setPlatform ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 51 */
		 this.elementPlatform = p1;
		 return;
	 } // .end method
	 public void setPrice ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 36 */
		 this.elementPrice = p1;
		 return;
	 } // .end method
