public class com.heyzap.sdk.HeyzapButton extends android.widget.ImageButton {
	 /* # instance fields */
	 private java.lang.String checkinMessage;
	 /* # direct methods */
	 public com.heyzap.sdk.HeyzapButton ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V */
		 final String v0 = ""; // const-string v0, ""
		 this.checkinMessage = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0}, Lcom/heyzap/sdk/HeyzapButton;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public com.heyzap.sdk.HeyzapButton ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 final String v0 = ""; // const-string v0, ""
		 this.checkinMessage = v0;
		 /* invoke-direct {p0, p1, p2}, Lcom/heyzap/sdk/HeyzapButton;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public com.heyzap.sdk.HeyzapButton ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 final String v0 = ""; // const-string v0, ""
		 this.checkinMessage = v0;
		 /* invoke-direct {p0, p1, p2}, Lcom/heyzap/sdk/HeyzapButton;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 static java.lang.String access$100 ( com.heyzap.sdk.HeyzapButton p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.checkinMessage;
	 } // .end method
	 private void init ( android.content.Context p0, android.util.AttributeSet p1 ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 v0 = 		 com.heyzap.sdk.Utils .androidVersionSupported ( );
		 /* if-nez v0, :cond_0 */
		 int v0 = 4; // const/4 v0, 0x4
		 (( com.heyzap.sdk.HeyzapButton ) p0 ).setVisibility ( v0 ); // invoke-virtual {p0, v0}, Lcom/heyzap/sdk/HeyzapButton;->setVisibility(I)V
	 } // :goto_0
	 return;
} // :cond_0
if ( p2 != null) { // if-eqz p2, :cond_1
	 final String v0 = "checkinMessage"; // const-string v0, "checkinMessage"
	 v1 = this.checkinMessage;
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 this.checkinMessage = v0;
	 } // :cond_1
	 com.heyzap.sdk.HeyzapLib .sendNotification ( p1 );
	 int v0 = 0; // const/4 v0, 0x0
	 (( com.heyzap.sdk.HeyzapButton ) p0 ).setBackgroundColor ( v0 ); // invoke-virtual {p0, v0}, Lcom/heyzap/sdk/HeyzapButton;->setBackgroundColor(I)V
	 int v0 = 1; // const/4 v0, 0x1
	 (( com.heyzap.sdk.HeyzapButton ) p0 ).setAdjustViewBounds ( v0 ); // invoke-virtual {p0, v0}, Lcom/heyzap/sdk/HeyzapButton;->setAdjustViewBounds(Z)V
	 (( com.heyzap.sdk.HeyzapButton ) p0 ).drawableStateChanged ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/HeyzapButton;->drawableStateChanged()V
	 /* new-instance v0, Lcom/heyzap/sdk/HeyzapButton$ButtonOnClickListener; */
	 /* invoke-direct {v0, p0, v2}, Lcom/heyzap/sdk/HeyzapButton$ButtonOnClickListener;-><init>(Lcom/heyzap/sdk/HeyzapButton;Lcom/heyzap/sdk/HeyzapButton$1;)V */
	 (( com.heyzap.sdk.HeyzapButton ) p0 ).setOnClickListener ( v0 ); // invoke-virtual {p0, v0}, Lcom/heyzap/sdk/HeyzapButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
	 final String v0 = "checkin-button-shown"; // const-string v0, "checkin-button-shown"
	 com.heyzap.sdk.HeyzapAnalytics .trackEvent ( p1,v0 );
	 com.heyzap.sdk.HeyzapLib .broadcastEnableSDK ( p1 );
	 final String v0 = "heyzap_button.png"; // const-string v0, "heyzap_button.png"
	 com.heyzap.sdk.Drawables .setImageDrawable ( p1,p0,v0 );
} // .end method
/* # virtual methods */
public java.lang.String getCheckinMessage ( ) {
	 /* .locals 1 */
	 v0 = this.checkinMessage;
} // .end method
public void setCheckinMessage ( java.lang.String p0 ) {
	 /* .locals 0 */
	 this.checkinMessage = p1;
	 return;
} // .end method
