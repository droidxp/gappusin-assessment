public class com.flurry.android.AppCircle {
	 /* # direct methods */
	 public com.flurry.android.AppCircle ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void addUserCookie ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 0 */
		 com.flurry.android.FlurryAgent .addUserCookie ( p1,p2 );
		 return;
	 } // .end method
	 public void clearUserCookies ( ) {
		 /* .locals 0 */
		 com.flurry.android.FlurryAgent .clearUserCookies ( );
		 return;
	 } // .end method
	 public android.view.View getHook ( android.content.Context p0, java.lang.String p1, Integer p2 ) {
		 /* .locals 1 */
		 com.flurry.android.FlurryAgent .a ( p1,p2,p3 );
	 } // .end method
	 public com.flurry.android.Offer getOffer ( ) {
		 /* .locals 1 */
		 final String v0 = ""; // const-string v0, ""
		 (( com.flurry.android.AppCircle ) p0 ).getOffer ( v0 ); // invoke-virtual {p0, v0}, Lcom/flurry/android/AppCircle;->getOffer(Ljava/lang/String;)Lcom/flurry/android/Offer;
	 } // .end method
	 public com.flurry.android.Offer getOffer ( java.lang.String p0 ) {
		 /* .locals 1 */
		 com.flurry.android.FlurryAgent .a ( p1 );
	 } // .end method
	 public Boolean isLaunchCanvasOnBannerClicked ( ) {
		 /* .locals 1 */
		 v0 = 		 com.flurry.android.FlurryAgent .a ( );
	 } // .end method
	 public void launchCanvasOnBannerClicked ( Boolean p0 ) {
		 /* .locals 0 */
		 com.flurry.android.FlurryAgent .a ( p1 );
		 return;
	 } // .end method
	 public void openCatalog ( android.content.Context p0 ) {
		 /* .locals 1 */
		 final String v0 = ""; // const-string v0, ""
		 (( com.flurry.android.AppCircle ) p0 ).openCatalog ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/flurry/android/AppCircle;->openCatalog(Landroid/content/Context;Ljava/lang/String;)V
		 return;
	 } // .end method
	 public void openCatalog ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 0 */
		 com.flurry.android.FlurryAgent .a ( p1,p2 );
		 return;
	 } // .end method
	 public void setDefaultNoAdsMessage ( java.lang.String p0 ) {
		 /* .locals 0 */
		 com.flurry.android.FlurryAgent .setDefaultNoAdsMessage ( p1 );
		 return;
	 } // .end method
