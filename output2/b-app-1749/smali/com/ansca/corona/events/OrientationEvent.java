public class com.ansca.corona.events.OrientationEvent extends com.ansca.corona.events.Event {
	 /* .source "OrientationEvent.java" */
	 /* # instance fields */
	 Integer myNewOrientation;
	 Integer myOldOrientation;
	 /* # direct methods */
	 com.ansca.corona.events.OrientationEvent ( ) {
		 /* .locals 0 */
		 /* .param p1, "newOrientation" # I */
		 /* .param p2, "oldOrientation" # I */
		 /* .prologue */
		 /* .line 7 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
		 /* .line 8 */
		 /* iput p1, p0, Lcom/ansca/corona/events/OrientationEvent;->myNewOrientation:I */
		 /* .line 9 */
		 /* iput p2, p0, Lcom/ansca/corona/events/OrientationEvent;->myOldOrientation:I */
		 /* .line 10 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void Send ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 14 */
		 /* iget v0, p0, Lcom/ansca/corona/events/OrientationEvent;->myNewOrientation:I */
		 /* iget v1, p0, Lcom/ansca/corona/events/OrientationEvent;->myOldOrientation:I */
		 com.ansca.corona.JavaToNativeShim .orientationChanged ( v0,v1 );
		 /* .line 15 */
		 return;
	 } // .end method
