public class com.flurry.android.AppCircle {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public com.flurry.android.AppCircle ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void acceptOffer ( android.content.Context p0, Long p1 ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 259 */
		 com.flurry.android.FlurryAgent .a ( p1,p2,p3 );
		 /* .line 260 */
		 return;
	 } // .end method
	 public void addUserCookie ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 308 */
		 com.flurry.android.FlurryAgent .addUserCookie ( p1,p2 );
		 /* .line 309 */
		 return;
	 } // .end method
	 public void clearUserCookies ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 318 */
		 com.flurry.android.FlurryAgent .clearUserCookies ( );
		 /* .line 319 */
		 return;
	 } // .end method
	 public java.util.List getAllOffers ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 286 */
		 final String v0 = ""; // const-string v0, ""
		 com.flurry.android.FlurryAgent .b ( v0 );
	 } // .end method
	 public java.util.List getAllOffers ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 230 */
		 com.flurry.android.FlurryAgent .b ( p1 );
	 } // .end method
	 public android.view.View getHook ( android.content.Context p0, java.lang.String p1, Integer p2 ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 131 */
		 com.flurry.android.FlurryAgent .a ( p1,p2,p3 );
	 } // .end method
	 public com.flurry.android.Offer getOffer ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 277 */
		 final String v0 = ""; // const-string v0, ""
		 (( com.flurry.android.AppCircle ) p0 ).getOffer ( v0 ); // invoke-virtual {p0, v0}, Lcom/flurry/android/AppCircle;->getOffer(Ljava/lang/String;)Lcom/flurry/android/Offer;
	 } // .end method
	 public com.flurry.android.Offer getOffer ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 214 */
		 com.flurry.android.FlurryAgent .a ( p1 );
	 } // .end method
	 public Boolean hasAds ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 175 */
		 v0 = 		 com.flurry.android.FlurryAgent .d ( );
	 } // .end method
	 public Boolean isLaunchCanvasOnBannerClicked ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 80 */
		 v0 = 		 com.flurry.android.FlurryAgent .a ( );
	 } // .end method
	 public Boolean isLaunchCatalogOnBannerClicked ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 92 */
		 v0 = 		 com.flurry.android.FlurryAgent .a ( );
	 } // .end method
	 public void launchCanvasOnBannerClicked ( Boolean p0 ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 70 */
		 com.flurry.android.FlurryAgent .a ( p1 );
		 /* .line 71 */
		 return;
	 } // .end method
	 public void launchCatalogOnBannerClicked ( Boolean p0 ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 61 */
		 com.flurry.android.FlurryAgent .a ( p1 );
		 /* .line 62 */
		 return;
	 } // .end method
	 public void openCatalog ( android.content.Context p0 ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 140 */
		 final String v0 = ""; // const-string v0, ""
		 (( com.flurry.android.AppCircle ) p0 ).openCatalog ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/flurry/android/AppCircle;->openCatalog(Landroid/content/Context;Ljava/lang/String;)V
		 /* .line 141 */
		 return;
	 } // .end method
	 public void openCatalog ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 155 */
		 com.flurry.android.FlurryAgent .a ( p1,p2 );
		 /* .line 156 */
		 return;
	 } // .end method
	 public void removeOffers ( java.util.List p0 ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 268 */
		 com.flurry.android.FlurryAgent .a ( p1 );
		 /* .line 269 */
		 return;
	 } // .end method
	 public void setAppCircleCallback ( com.flurry.android.AppCircleCallback p0 ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 48 */
		 com.flurry.android.FlurryAgent .a ( p1 );
		 /* .line 49 */
		 return;
	 } // .end method
	 public void setDefaultNoAdsMessage ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 33 */
		 com.flurry.android.FlurryAgent .setDefaultNoAdsMessage ( p1 );
		 /* .line 34 */
		 return;
	 } // .end method
