public class com.ansca.corona.events.AlertEvent extends com.ansca.corona.events.Event {
	 /* .source "AlertEvent.java" */
	 /* # instance fields */
	 private Integer myButtonIndex;
	 /* # direct methods */
	 com.ansca.corona.events.AlertEvent ( ) {
		 /* .locals 0 */
		 /* .param p1, "which" # I */
		 /* .prologue */
		 /* .line 8 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
		 /* .line 9 */
		 /* iput p1, p0, Lcom/ansca/corona/events/AlertEvent;->myButtonIndex:I */
		 /* .line 10 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void Send ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 14 */
		 /* iget v0, p0, Lcom/ansca/corona/events/AlertEvent;->myButtonIndex:I */
		 com.ansca.corona.JavaToNativeShim .alertCallback ( v0 );
		 /* .line 15 */
		 return;
	 } // .end method
