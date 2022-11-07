public class com.ansca.corona.events.DidFailLoadUrlEvent extends com.ansca.corona.events.Event {
	 /* .source "DidFailLoadUrlEvent.java" */
	 /* # instance fields */
	 java.lang.String myDescription;
	 Integer myErrorCode;
	 java.lang.String myFailingUrl;
	 Integer myId;
	 /* # direct methods */
	 com.ansca.corona.events.DidFailLoadUrlEvent ( ) {
		 /* .locals 0 */
		 /* .param p1, "id" # I */
		 /* .param p2, "failingUrl" # Ljava/lang/String; */
		 /* .param p3, "description" # Ljava/lang/String; */
		 /* .param p4, "errorCode" # I */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
		 /* .line 13 */
		 /* iput p1, p0, Lcom/ansca/corona/events/DidFailLoadUrlEvent;->myId:I */
		 /* .line 14 */
		 this.myFailingUrl = p2;
		 /* .line 15 */
		 this.myDescription = p3;
		 /* .line 16 */
		 /* iput p4, p0, Lcom/ansca/corona/events/DidFailLoadUrlEvent;->myErrorCode:I */
		 /* .line 17 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void Send ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 22 */
		 com.ansca.corona.ViewManager .getViewManager ( );
		 v0 = 		 (( com.ansca.corona.ViewManager ) v0 ).isWebViewShown ( ); // invoke-virtual {v0}, Lcom/ansca/corona/ViewManager;->isWebViewShown()Z
		 /* if-nez v0, :cond_0 */
		 /* .line 28 */
	 } // :goto_0
	 return;
	 /* .line 27 */
} // :cond_0
/* iget v0, p0, Lcom/ansca/corona/events/DidFailLoadUrlEvent;->myId:I */
v1 = this.myFailingUrl;
v2 = this.myDescription;
/* iget v3, p0, Lcom/ansca/corona/events/DidFailLoadUrlEvent;->myErrorCode:I */
com.ansca.corona.JavaToNativeShim .webPopupDidFailLoadUrl ( v0,v1,v2,v3 );
} // .end method
