public class com.ansca.corona.events.TapEvent extends com.ansca.corona.events.Event {
	 /* .source "TapEvent.java" */
	 /* # instance fields */
	 private Integer myCount;
	 private Integer myX;
	 private Integer myY;
	 /* # direct methods */
	 com.ansca.corona.events.TapEvent ( ) {
		 /* .locals 0 */
		 /* .param p1, "x" # I */
		 /* .param p2, "y" # I */
		 /* .param p3, "count" # I */
		 /* .prologue */
		 /* .line 8 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
		 /* .line 9 */
		 /* iput p1, p0, Lcom/ansca/corona/events/TapEvent;->myX:I */
		 /* .line 10 */
		 /* iput p2, p0, Lcom/ansca/corona/events/TapEvent;->myY:I */
		 /* .line 11 */
		 /* iput p3, p0, Lcom/ansca/corona/events/TapEvent;->myCount:I */
		 /* .line 12 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void Send ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 16 */
		 /* iget v0, p0, Lcom/ansca/corona/events/TapEvent;->myX:I */
		 /* iget v1, p0, Lcom/ansca/corona/events/TapEvent;->myY:I */
		 /* iget v2, p0, Lcom/ansca/corona/events/TapEvent;->myCount:I */
		 com.ansca.corona.JavaToNativeShim .tapEvent ( v0,v1,v2 );
		 /* .line 17 */
		 return;
	 } // .end method
