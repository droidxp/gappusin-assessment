public class com.ansca.corona.events.AdRequestEvent extends com.ansca.corona.events.Event {
	 /* .source "AdRequestEvent.java" */
	 /* # instance fields */
	 private Boolean fIsError;
	 /* # direct methods */
	 com.ansca.corona.events.AdRequestEvent ( ) {
		 /* .locals 0 */
		 /* .param p1, "isError" # Z */
		 /* .prologue */
		 /* .line 8 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
		 /* .line 9 */
		 /* iput-boolean p1, p0, Lcom/ansca/corona/events/AdRequestEvent;->fIsError:Z */
		 /* .line 10 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void Send ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 14 */
		 /* iget-boolean v0, p0, Lcom/ansca/corona/events/AdRequestEvent;->fIsError:Z */
		 com.ansca.corona.JavaToNativeShim .adRequestEvent ( v0 );
		 /* .line 15 */
		 return;
	 } // .end method
