public class com.ansca.corona.events.RunnableEvent extends com.ansca.corona.events.Event {
	 /* .source "RunnableEvent.java" */
	 /* # instance fields */
	 private java.lang.Runnable fRunnable;
	 /* # direct methods */
	 public com.ansca.corona.events.RunnableEvent ( ) {
		 /* .locals 0 */
		 /* .param p1, "runnable" # Ljava/lang/Runnable; */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
		 /* .line 16 */
		 this.fRunnable = p1;
		 /* .line 17 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void Send ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 22 */
		 v0 = this.fRunnable;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 23 */
			 v0 = this.fRunnable;
			 /* .line 25 */
		 } // :cond_0
		 return;
	 } // .end method
