public class com.jumptap.adtag.callbacks.EmptyBodyChecker {
	 /* .source "EmptyBodyChecker.java" */
	 /* # instance fields */
	 private com.jumptap.adtag.events.EventManager eventManager;
	 private com.jumptap.adtag.listeners.JtAdViewInnerListener innerListener;
	 /* # direct methods */
	 public com.jumptap.adtag.callbacks.EmptyBodyChecker ( ) {
		 /* .locals 1 */
		 /* .param p1, "innerListener" # Lcom/jumptap/adtag/listeners/JtAdViewInnerListener; */
		 /* .param p2, "eventManager" # Lcom/jumptap/adtag/events/EventManager; */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 18 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 14 */
		 this.innerListener = v0;
		 /* .line 15 */
		 this.eventManager = v0;
		 /* .line 19 */
		 this.eventManager = p2;
		 /* .line 20 */
		 this.innerListener = p1;
		 /* .line 21 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void checkBody ( java.lang.String p0 ) {
		 /* .locals 2 */
		 /* .param p1, "bodyHtml" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 26 */
		 v0 = 		 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
		 /* if-nez v0, :cond_1 */
		 /* .line 27 */
		 final String v0 = "JtAd"; // const-string v0, "JtAd"
		 final String v1 = "Ad was not found."; // const-string v1, "Ad was not found."
		 android.util.Log .d ( v0,v1 );
		 /* .line 28 */
		 v0 = this.innerListener;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 29 */
			 v0 = this.innerListener;
			 /* .line 43 */
		 } // :cond_0
	 } // :goto_0
	 return;
	 /* .line 33 */
} // :cond_1
v0 = this.innerListener;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 34 */
	 v0 = this.innerListener;
} // .end method
