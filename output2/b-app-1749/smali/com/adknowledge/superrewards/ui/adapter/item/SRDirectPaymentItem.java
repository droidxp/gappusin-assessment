public class com.adknowledge.superrewards.ui.adapter.item.SRDirectPaymentItem {
	 /* .source "SRDirectPaymentItem.java" */
	 /* # instance fields */
	 private android.graphics.drawable.Drawable offerIcon;
	 private java.lang.String offerName;
	 /* # direct methods */
	 public com.adknowledge.superrewards.ui.adapter.item.SRDirectPaymentItem ( ) {
		 /* .locals 0 */
		 /* .param p1, "offerIcon" # Landroid/graphics/drawable/Drawable; */
		 /* .param p2, "offerName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 53 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 54 */
		 this.offerIcon = p1;
		 /* .line 55 */
		 this.offerName = p2;
		 /* .line 56 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.graphics.drawable.Drawable getOfferIcon ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 24 */
		 v0 = this.offerIcon;
	 } // .end method
	 public java.lang.String getOfferName ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 33 */
		 v0 = this.offerName;
		 (( java.lang.String ) v0 ).toLowerCase ( ); // invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
		 final String v1 = "paypalec"; // const-string v1, "paypalec"
		 v0 = 		 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 34 */
			 final String v0 = "Paypal"; // const-string v0, "Paypal"
			 this.offerName = v0;
			 /* .line 37 */
		 } // :cond_0
		 v0 = this.offerName;
		 (( java.lang.String ) v0 ).toLowerCase ( ); // invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
		 final String v1 = "gate2shop"; // const-string v1, "gate2shop"
		 v0 = 		 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 38 */
			 final String v0 = "Credit Card"; // const-string v0, "Credit Card"
			 this.offerName = v0;
			 /* .line 41 */
		 } // :cond_1
		 v0 = this.offerName;
		 (( java.lang.String ) v0 ).toLowerCase ( ); // invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
		 final String v1 = "google"; // const-string v1, "google"
		 v0 = 		 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 42 */
			 final String v0 = "Google"; // const-string v0, "Google"
			 this.offerName = v0;
			 /* .line 45 */
		 } // :cond_2
		 v0 = this.offerName;
	 } // .end method
	 public void setOfferIcon ( android.graphics.drawable.Drawable p0 ) {
		 /* .locals 0 */
		 /* .param p1, "offerIcon" # Landroid/graphics/drawable/Drawable; */
		 /* .prologue */
		 /* .line 28 */
		 this.offerIcon = p1;
		 /* .line 29 */
		 return;
	 } // .end method
	 public void setOfferName ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "offerName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 49 */
		 this.offerName = p1;
		 /* .line 50 */
		 return;
	 } // .end method
